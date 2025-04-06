class Add{
    void add(int a,int b){
        System.out.println("The sum of two of numbers is "+(a+b));
    }
}

class calc extends Add{
    void subt(int a,int b){
        System.out.println("The difference of two of numbers is "+(a-b));
    }
}

public class single_inheritance2{
    public static void main(String[] args) {
        calc obj = new calc();
        obj.add(10, 20);
        obj.subt(10, 20);
    }
}