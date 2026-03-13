public class Overloading{
    public int addition(int a, int b){
        return a + b;
    }

    public int addition(int a, int b,int c){
        return a + b + c;
    }

    public static void main(String[] args){
    Overloading a1 = new Overloading();
    int result = a1.addition(3,4);
    int result2 = a1.addition(3,4,2);

    System.out.println(result+" "+result2);
    }
}

