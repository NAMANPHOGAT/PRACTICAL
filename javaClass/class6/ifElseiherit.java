package class6;

//import java.util.Scanner;

class parenrt{
    int a=10;
    int  b=20;
    int c=30;
    
}

class child extends parenrt{
    void conditn(){
        int Sum = a + b + c;
        System.out.println(a);
        if(Sum<45){
            Sum = a - b - c;
        }
        else{
            System.out.println(true);
        }
    }
}

public class ifElseiherit{
    public static void main(String[] args) {
        child obj = new child();
        // obj.input();
        obj.conditn();
        
    }
}

