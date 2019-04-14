public class QuadraticEq {
    public static void main(String arg[]) {
        String s = "1x^2+5x+6";
        String str[]=s.split("/+");

        int a = 1;//(char)ch[]=s.split("x"))[0];
        int b = 1;
        int c = 6;

        double d = Math.pow(b, 2) - (4 * a * c);
        //d= Math.abs(d);
        System.out.println(d);
        boolean bl = (d<0)?false:true;
        if(bl){
        System.out.println( Math.sqrt(d));
        double res1 = (-b + Math.sqrt(d)) / (2 * a);
        double res2 = (-b - Math.sqrt(d)) / (2 * a);

        System.out.println("res1=" + res1 + "  res2=" + res2);
        }
        else{
            System.out.println("No is complex number");
        }

    }
}
