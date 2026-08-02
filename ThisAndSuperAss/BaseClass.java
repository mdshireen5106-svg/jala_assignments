public class BaseClass {
    String platform = "CRIO.DO";
    int platformID = 1001;

    public BaseClass() {

        System.out.println("Parent Default Constructor");
    }

    public BaseClass(String message) {

        System.out.println("Parent Parameterized Constructor");
        System.out.println("Message: " + message);
    }
   
}
