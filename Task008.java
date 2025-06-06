public class Task008{
    public static void main(String[] args) {
        Customer cust = new Customer();
        cust.accept();
        cust.display();
    }
}

class Customer{
    void accept(){
        System.out.println("class accepted");
    }
    void display(){
        System.out.println("class displayed");
    }
}