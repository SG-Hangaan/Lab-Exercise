package item3;

interface SmartPhone extends CallCapable, SMSCapable, WebCapable, CameraCapable {
    // No need to declare methods again, as they are already defined in the respective interfaces
}