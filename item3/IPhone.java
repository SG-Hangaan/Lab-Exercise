package item3;

class IPhone implements SmartPhone {
    public void makeCall(String number) {
        System.out.println("iPhone making a call to " + number);
    }

    public void sendSMS(String number, String message) {
        System.out.println("iPhone sending SMS to " + number + ": " + message);
    }

    public void browseWeb(String url) {
        System.out.println("iPhone browsing: " + url);
    }

    public void takePicture() {
        System.out.println("iPhone taking a picture");
    }
}