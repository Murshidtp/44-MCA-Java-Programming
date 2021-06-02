class Box5 {
    double width;
    double height;
    double depth;

    double volume(){
        return width*height*depth;
    }
    void SetDim(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
}
public class BoxDemo5 {
    public static void main(String[] args) {
        double vol;
        Box5 mybox1 = new Box5();
        Box5 mybox2 = new Box5();

        mybox1.SetDim(10, 20, 15);
        vol=mybox1.volume();
        System.out.println("Volume is : "+vol);

        mybox2.SetDim(3, 6, 9);
        vol=mybox2.volume();
        System.out.println("Volume is : "+vol);
    }
}
