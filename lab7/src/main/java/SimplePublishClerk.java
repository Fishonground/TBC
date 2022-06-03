
import org.apache.juddi.api_v3.AccessPointType;
import org.apache.juddi.v3.client.config.UDDIClerk;
import org.apache.juddi.v3.client.config.UDDIClient;
import org.uddi.api_v3.AccessPoint;
import org.uddi.api_v3.BindingTemplate;
import org.uddi.api_v3.BindingTemplates;
import org.uddi.api_v3.BusinessEntity;
import org.uddi.api_v3.BusinessService;
import org.uddi.api_v3.Name;

/**
 * This shows you to interact with a UDDI server by publishing a Business,
 * Service and Binding Template. It uses code that is specific to the jUDDI
 * client jar's and represents an easier, simpler way to do things. (UDDIClient
 * and UDDIClerk classes). Credentials and URLs are all set via uddi.xml
 */

public class SimplePublishClerk {
    private static UDDIClerk clerk = null;

    public SimplePublishClerk() {
        try {
            UDDIClient uddiClient = new UDDIClient("META-INF/uddi.xml");
            clerk = uddiClient.getClerk("default");
            if (clerk == null)
                throw new Exception("The clerk wasn't found, check the config file!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String publish(String bKey, String sName,String wsdlAdd) {
        String result = "";
        try {
            BusinessEntity be = clerk.getBusinessDetail(bKey);
            if (be == null) {
                result = "Chosen business doesn't exist!";
            } else {
                BusinessService bs = new BusinessService();
                bs.setBusinessKey(bKey);
                Name name = new Name();
                name.setValue(sName);
                bs.getName().add(name);

                BindingTemplate myBindingTemplate = new BindingTemplate();
                AccessPoint accessPoint = new AccessPoint();
                accessPoint.setUseType(AccessPointType.WSDL_DEPLOYMENT.toString());
                accessPoint.setValue(wsdlAdd);
                myBindingTemplate.setAccessPoint(accessPoint);
                BindingTemplates myBindingTemplates = new BindingTemplates();
                myBindingTemplate = UDDIClient.addSOAPtModels(myBindingTemplate);
                myBindingTemplates.getBindingTemplate().add(myBindingTemplate);
                bs.setBindingTemplates(myBindingTemplates);

                BusinessService svc = clerk.register(bs);
                if (svc == null) {
                    result = "Save failed!";
                } else {
                    result = "Successfully created!";
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            result = "Exception during publishing!";
        }
        return result;
    }


}
