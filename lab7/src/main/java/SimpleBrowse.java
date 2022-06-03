

import java.util.ArrayList;
	import java.util.List;
	import org.apache.juddi.v3.client.UDDIConstants;
	import org.apache.juddi.v3.client.config.UDDIClient;
	import org.apache.juddi.v3.client.transport.Transport;
	import org.uddi.api_v3.AuthToken;
	import org.uddi.api_v3.BindingTemplate;
	import org.uddi.api_v3.BindingTemplates;
	import org.uddi.api_v3.BusinessInfos;
	import org.uddi.api_v3.BusinessList;
	import org.uddi.api_v3.BusinessService;
	import org.uddi.api_v3.Description;
	import org.uddi.api_v3.DiscardAuthToken;
	import org.uddi.api_v3.FindBusiness;
	import org.uddi.api_v3.GetAuthToken;
	import org.uddi.api_v3.GetServiceDetail;
	import org.uddi.api_v3.Name;
	import org.uddi.api_v3.ServiceDetail;
	import org.uddi.api_v3.ServiceInfos;
	import org.uddi.v3_service.UDDIInquiryPortType;
	import org.uddi.v3_service.UDDISecurityPortType;
	import org.apache.juddi.v3.client.config.ClientConfig;

public class SimpleBrowse {



	        private static UDDISecurityPortType security = null;
	        private static UDDIInquiryPortType inquiry = null;

	        public String getServiceByName(String name) {
	        	int flag = 0;
	            try {
	                String auth = GetAuthKey("uddiadmin", "da_password1");
	                BusinessList gotBusiness = GetBusinessList(auth);
	                List<BusinessService> services = getServicesByBusiness(gotBusiness, auth);
	                security.discardAuthToken(new DiscardAuthToken(auth));

	                for (BusinessService service : services) {
	                	if (ListToString(service.getName()).contains(name)) {
	                		flag++;
	                		Service_description(service);
	                	}
	                }
		        } catch (Exception e) {
		        		System.out.println("Mistake during business and services getting!");
		        		e.printStackTrace();
		        		System.out.println(e.getMessage());
		        }
	            if (flag == 0) {
	            	return("We can't find services with this name!");
	            }
	            return "Ready! Something more?";
	        }

	        //based on example @PrintBusinessDetails@
	        private List<BusinessService> getServicesByBusiness(BusinessList businesses, String token) throws Exception {
	        	List<BusinessService> services = new ArrayList<BusinessService>();
	        	BusinessInfos businessInfos = businesses.getBusinessInfos();
	            for (int i = 0; i < businessInfos.getBusinessInfo().size(); i++) {
	                GetServiceDetail gsd = new GetServiceDetail();
	                /*
	                Was interesting to find out that in my case this code from example throws
	                NullPointer Exception, so it
	                */
//	                for (int k = 0; k < businessInfos.getBusinessInfo().get(i).getServiceInfos().getServiceInfo().size(); k++) {
//                        gsd.getServiceKey().add(businessInfos.getBusinessInfo().get(i).getServiceInfos().getServiceInfo().get(k).getServiceKey());
//	                }
	                ServiceInfos servicesInfo = businessInfos.getBusinessInfo().get(i).getServiceInfos();
	                if (servicesInfo != null) {
		                for (int k = 0; k < servicesInfo.getServiceInfo().size(); k++) {
		                        gsd.getServiceKey().add(servicesInfo.getServiceInfo().get(k).getServiceKey());
		                }
		                gsd.setAuthInfo(token);
		                ServiceDetail serviceDetail = inquiry.getServiceDetail(gsd);
		                services.addAll(serviceDetail.getBusinessService());
	                }
	            }
	            return services;
	        }

	        private void Service_description(BusinessService service) {

				if (service == null) {
					return;
				}
				System.out.println("--- Service description ---");
				System.out.println("Name: " + ListToString(service.getName()));
				System.out.println("Description: " + ListToDescString(service.getDescription()));
				System.out.println("Key: " + (service.getServiceKey()));
				if (!service.getSignature().isEmpty()) {
					System.out.println("Item is digitally signed");
				} else {
					System.out.println("Item is not digitally signed");
				}
				BindingTemplates bindingTemplates = service.getBindingTemplates();
				if (bindingTemplates == null) {
					return;
				}
				for (int i = 0; i < bindingTemplates.getBindingTemplate().size(); i++) {
					System.out.println("Binding Key: " + bindingTemplates.getBindingTemplate().get(i).getBindingKey());

					if (bindingTemplates.getBindingTemplate().get(i).getAccessPoint() != null) {
						System.out.println("Access Point: " + bindingTemplates.getBindingTemplate().get(i).getAccessPoint().getValue() + " type " + bindingTemplates.getBindingTemplate().get(i).getAccessPoint().getUseType());
					} else {
						System.out.println("Here are some problems with Access Point!!!");
					}
				}
				System.out.println("--- --- --- ---");
	        }


	        public SimpleBrowse() {
	                try {
	        	// create a manager and read the config in the archive;
	                        // you can use your config file name
	                        UDDIClient client = new UDDIClient("META-INF/uddi.xml");
	        	// a UDDIClient can be a client to multiple UDDI nodes, so
	                        // supply the nodeName (defined in your uddi.xml.
	                        // The transport can be WS, inVM etc which is defined in the uddi.xml
	                        Transport transport = client.getTransport("default");
	                        // Now you create a reference to the UDDI API
	                        security = transport.getUDDISecurityService();
	                        inquiry = transport.getUDDIInquiryService();
	                } catch (Exception e) {
	                        e.printStackTrace();
	                }
	        }


	        private BusinessList GetBusinessList(String token) throws Exception {
	                FindBusiness fb = new FindBusiness();
	                fb.setAuthInfo(token);
	                org.uddi.api_v3.FindQualifiers fq = new org.uddi.api_v3.FindQualifiers();
	                fq.getFindQualifier().add(UDDIConstants.APPROXIMATE_MATCH);

	                fb.setFindQualifiers(fq);
	                Name searchname = new Name();
	                searchname.setValue(UDDIConstants.WILDCARD);
	                fb.getName().add(searchname);
	                BusinessList findBusiness = inquiry.findBusiness(fb);
	                return findBusiness;

	        }



	        private String GetAuthKey(String username, String password) {
	                try {

	                        GetAuthToken getAuthTokenRoot = new GetAuthToken();
	                        getAuthTokenRoot.setUserID(username);
	                        getAuthTokenRoot.setCred(password);

	                        // Making API call that retrieves the authentication token for the user.
	                        AuthToken rootAuthToken = security.getAuthToken(getAuthTokenRoot);
	                        return rootAuthToken.getAuthInfo();
	                } catch (Exception ex) {
	                        System.out.println("Could not authenticate with the provided credentials " + ex.getMessage());
	                }
	                return null;
	        }


	        private String ListToString(List<Name> name) {
	                StringBuilder sb = new StringBuilder();
	                for (int i = 0; i < name.size(); i++) {
	                        sb.append(name.get(i).getValue()).append(" ");
	                }
	                return sb.toString();
	        }

	        private String ListToDescString(List<Description> name) {
	                StringBuilder sb = new StringBuilder();
	                for (int i = 0; i < name.size(); i++) {
	                        sb.append(name.get(i).getValue()).append(" ");
	                }
	                return sb.toString();
	        }


}
