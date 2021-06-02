class product{
    String pcode;
    String pname;
    int price;
}
public class Program1 {
    public static void main(String[] args) {
        product p1=new product();
        product p2=new product();
        product p3=new product();
        p1.pcode="p11";
        p1.pname="Pen";
        p1.price=10;

        p2.pcode="p12";
        p2.pname="Book";
        p2.price=20;

        p3.pcode="p13";
        p3.pname="Pencil";
        p3.price=5;
        if(p1.price<p2.price && p1.price<p3.price){
            System.out.println(p1.pname+" have less price");
        }
        else if(p2.price<p1.price && p2.price<p3.price){
            System.out.println(p2.pname+" have less price");
        }
        else{
            System.out.println(p3.pname+" have lowest price");
        }
    }
}
