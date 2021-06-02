class Box4{
    double width;
    double height;
    double depth;

    double Volume(){
        return width*height*depth;
    }
}
public class BoxDemo4 {
    public static void main(String[] args) {
        double vol;
        Box4 mybox1 = new Box4();
        Box4 mybox2 = new Box4();

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        vol=mybox1.Volume();
        System.out.println("Volume is: "+vol);

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        vol=mybox2.Volume();
        System.out.println("Volume is: "+vol);
    }
}
