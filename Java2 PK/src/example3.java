public class example3 {
    public static void main(String[] args) {
        int n = (int)(Math.random()*900+100),a,b,c;
        a = n/100;
        b = (n%100)/10;
        c = n%10;
        if(a>=b&&a>=c) {
            System.out.println("В числе " + n + " Наибольшая цифра " + a);
        } else if(b>=a&&b>=c) {
            System.out.println("В числе "+ n +" Наибольшая цифра" + b);
        }
    }
}
