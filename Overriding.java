class Vehicle{
    public void display(){
        System.out.println("Hello");
    }
}

class Car extends Vehicle{
    @Override
    public void display(){
        System.out.println("Hiii");
    }
}


public class Overriding {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.display();
    }
}
