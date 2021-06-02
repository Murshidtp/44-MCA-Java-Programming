class product{
    int pcode;
    String pname;
    int price;
}
public class Program1 {
    public static void main(String[] args) {
        product p1=new product();
        product p2=new product();
        product p3=new product();
        p1.pcode=111;
        p1.pname="toys";
        p1.price=1500;

        p2.pcode=112;
        p2.pname="car";
        p2.price=200;

        p3.pcode=113;
        p3.pname="brush";
        p3.price=500;
        if(p1.price<p2.price && p1.price<p3.price){
            System.out.println("toys have less price");
        }
        else if(p2.price<p1.price && p2.price<p3.price){
            System.out.println("car have less price");
        }
        else{
            System.out.println("brush have lowest price");
        }
    }
}
