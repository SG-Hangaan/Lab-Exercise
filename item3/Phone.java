package item3;

public class Phone {
    public static void main(String[] args) {
        // Creating instances of phones
        BasicPhone basicPhone = new BasicPhone();
        Samsung samsung = new Samsung();
        IPhone iPhone = new IPhone();

        // Demonstrating BasicPhone functionalities
        System.out.println("BasicPhone functionalities:");
        basicPhone.makeCall("910153110");
        basicPhone.sendSMS("910153110", "Hello!");

        // Demonstrating SmartPhone functionalities (Samsung)
        System.out.println("\nSamsung functionalities:");
        samsung.makeCall("9876543210");
        samsung.sendSMS("9876543210", "Hi there!");
        samsung.browseWeb("https://docs.google.com");
        samsung.takePicture();

        // Demonstrating SmartPhone functionalities (IPhone)
        System.out.println("\nIPhone functionalities:");
        iPhone.makeCall("555-123-4567");
        iPhone.sendSMS("555-123-4567", "Hey!");
        iPhone.browseWeb("https://college.neu.edu.ph");
        iPhone.takePicture();
    }
}
