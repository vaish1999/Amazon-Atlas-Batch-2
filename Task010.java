import java.net.SocketOption;

public class Task010 {
    public static void main(String[] args) {
    int a=10, b=6, c=3;
    if (a>b && a>c){
        System.out.println(a+" is greatest");
    }
    else if (b>a && b>c){
            System.out.println(b+" is greatest");
    }
    else{
        System.out.println(c+" is greatest");
    }
    }
}
