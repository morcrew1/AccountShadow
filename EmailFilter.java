public class EmailFilter implements AbstractFilter {
    public int apply(Request){
        System.out.println("Email filter applied.")
        return 0;
    }
}