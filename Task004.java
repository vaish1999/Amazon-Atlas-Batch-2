public class Task004{
    public static void main(String[] args) {
        int a = 2,b=3;
        String formatted_string = String.format("before swap a is %d, b is %d",a,b);
        System.out.println(formatted_string);
        int c;
        c=a;
        a=b;
        b=c;
        String formatted_string1 = String.format("after swap a is %d, b is %d",a,b);
        System.out.println(formatted_string1);
    }
}