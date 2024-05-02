package item3;

class BasicPhone implements CallCapable, SMSCapable {
    public void makeCall(String number) {
        System.out.println("Making a call to " + number);
    }

    public void sendSMS(String number, String message) {
        System.out.println("Sending SMS to " + number + ": " + message);
    }
}