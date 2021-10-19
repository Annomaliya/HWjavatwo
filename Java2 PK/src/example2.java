public class example2 {
    public static void main(String[] args) {
        double m,n,a,b,d;
        m = 8.5;
        n = 11.6;
        d = 10;
        a = Math.abs(m-d);
        b = Math.abs(n-d);
        if(a<b) {
            System.out.println(m+" Ближе");
        } else if(a>b) {
            System.out.println(n+" Ближе");
        }
    }
}
