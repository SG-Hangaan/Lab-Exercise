package item3;

class Samsung implements SmartPhone {
    public void makeCall(String number) {
        System.out.println("Samsung making a call to " + number);
    }

    public void sendSMS(String number, String message) {
        System.out.println("Samsung sending SMS to " + number + ": " + message);
    }

    public void browseWeb(String url) {
        System.out.println("Samsung browsing: " + url);
    }

    public void takePicture() {
        System.out.println("Samsung taking a picture");
    }
}