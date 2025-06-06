public class Task015 {
    public static void main(String[] args) {
        String str1 = "str1 string";
        String str2 = new String(str1);
        String str3 = new String("this is str3");
        char[] ch = {'a','b','c','d'};
        String str4 = new String(ch);
        System.out.println(str1+"\n"+str2+"\n"+str3+"\n"+str4);
    }
}
