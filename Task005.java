public class Task005{
    public static void main(String[] args) {
        int a = 4,b=2;
        int sum,diff,prod,quotient;
        sum = add(a, b);
        diff = difference(a, b);
        prod = multiply(a, b);
        quotient = divide(a, b);
        String formatted_string_sum = String.format("Sum of %d and %d is %d", a,b,sum);
        String formatted_string_diff = String.format("difference of %d and %d is %d", a,b,diff);
        String formatted_string_prod = String.format("product of %d and %d is %d", a,b,prod);
        String formatted_string_quo = String.format("quotient of %d and %d is %d", a,b,quotient);

        System.out.println(formatted_string_sum+"\n"+formatted_string_diff+"\n"+formatted_string_prod+"\n"+formatted_string_quo);
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int difference(int a, int b){
        return a-b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public static int divide(int a, int b){
        return a/b;
    }
    
}