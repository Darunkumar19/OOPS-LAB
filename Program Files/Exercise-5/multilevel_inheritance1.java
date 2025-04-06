class Add{
    void add(int a,int b){
        System.out.println("The sum of two of numbers is "+(a+b));
    }
}

class basic extends Add{
    void subt(int a,int b){
        System.out.println("The difference of two of numbers is "+(a-b));
    }
}

class calc extends basic{
    void mul(int a,int b){
        System.out.println("The product of two of numbers is "+(a*b));
    }

    void div(int a,int b){
        if(b==0){
            System.out.println("Error! Division by zero is not allowed");
        }
        else{
            System.out.println("The quotient of two of numbers is "+(a/b));
        }
    }
}

public class multilevel_inheritance1{
    public static void main(String[] args) {
        calc obj = new calc();
        obj.add(10, 20);
        obj.subt(10, 20);
        obj.mul(10, 20);
        obj.div(10, 20);
    }
}