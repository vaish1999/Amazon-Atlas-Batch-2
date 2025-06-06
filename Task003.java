public class Task003{
    public static void main(String[] args) {
        int a=2,b=3;
        int sum = add(a, b);
        String formatted_string = String.format("sum of %d and %d is %d",a,b,sum);
        System.out.println(formatted_string);
    }
    public static int add(int a, int b){
        return a+b;
    }
}