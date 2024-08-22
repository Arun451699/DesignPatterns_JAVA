package SingletonPattern;

public class Browser {
//    1. Creating Private static instance variable of the class
    private static  Browser browser; //default value is null from the beginning
//    2. Introducing Private constructor of this class
//    to prevent or avoid instantiation or create the object
    private Browser(){}
//    3. Creating public static get instance method
//    to provide the access to the instance or object.
    public static Browser getInstance(){
        if (browser == null){
            browser = new Browser(); // create the object of this claas and
            // returned the instance reference or reference variable of that particular class
//            through reference variable we can call any public method of the class
        }
        return browser;
    }
//    --also we can create public individual method of the class.
    public void displaymsg(){
        System.out.println("browser info");
    }

}
