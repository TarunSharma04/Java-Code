class Myclass {
    static int staticProperty = 42;

}

public class Main {
    public static void main(String[] args) {
        Myclass object1 = new Myclass();
        Myclass object2 = new Myclass();

        System.out.println("Static Property : " +Myclass.staticProperty);
        System.out.println("Accessing Static Property with object1 :"+object1.staticProperty);
        System.out.println("Accessing Static Property with object2 :"+object2.staticProperty);
        

        if (Myclass.staticProperty == object1.staticProperty && object1.staticProperty == object2.staticProperty){

            System.out.println("Yes, we can access Static Property using Object Reference.");
        }
    }

    
}
