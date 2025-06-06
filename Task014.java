public class Task014 {
    public static void main(String[] args) {
        char[] vowels = {'a','e','i','o','u'};
        System.out.println(vowels);
        String[] names = {"Vaishakh","Mani","Meher","Jeff"};
        System.out.println(names[1]);
        names[2]="Prasunamba";
        System.out.println(names[-1]);
        //Java doesn't support negative indexing on arrays, hence error
        System.out.println(names.length);
    }
}
