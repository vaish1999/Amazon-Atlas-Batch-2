public class Task009{
    public static void main(String[] args) {
        int a =6,b=5;
        if (a>b){
            String formatted_string = String.format("%d is greater than %d",a,b);
            System.out.println(formatted_string);
        }
        else{
            String formatted_string = String.format("%d is greater than %d",b,a);
            System.out.println(formatted_string);
        }
        
    }
}