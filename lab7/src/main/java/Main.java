import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception {


        Scanner in = new Scanner(System.in);

            while (true) {
                String input = in.nextLine();

                if (input.equals("/exit")) {
                    break;
                }
                if (input.equals("/getServiceByName")) {
                    SimpleBrowse sb = new SimpleBrowse();
                    System.out.print("Print the name:");
                    String name = in.nextLine();
                    System.out.println(sb.getServiceByName(name));

                }
                if (input.equals("/createNewService")) {
                    SimplePublishClerk cp = new SimplePublishClerk();
                    System.out.print("Print the business key:");
                    String b_key = in.nextLine();
                    System.out.print("Print the service name:");
                    String s_name = in.nextLine();
                    System.out.print("Print the service wsdl:");
                    String s_wsdl = in.nextLine();

                    System.out.println(cp.publish(b_key, s_name, s_wsdl));
                }
                else {
                    //System.out.println("Wrong command! Try again!");
                }

            }
        //} catch (Exception e) {
        //    System.out.println("You have broke something, You are fantastic!");
       // }

    }
}