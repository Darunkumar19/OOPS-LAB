class car{
    void carmodel(){
        System.out.println("This is a BMW");
    }
}

class car2 extends car{
}

public class single_inheritance1{
    public static void main(String[] args) {
        car2 c = new car2();
        c.carmodel();
    }
}
