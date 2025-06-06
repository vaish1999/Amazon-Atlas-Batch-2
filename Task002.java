
public class Task002{
    public static void main(String[] args) {
        int a = 5,b=6;
        int a1 = add(a, b);
        int a2 = add(a1,a);
        int a3 = add(b,a2);

        System.out.println(a1+" "+a2+" "+a3);
    }
    public static int add(int a, int b){
        return a+b;
    }
}