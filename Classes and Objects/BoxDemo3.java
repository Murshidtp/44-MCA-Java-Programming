class Box3{
    double width;
    double height;
    double depth;

    void volume(){
        System.out.println("Volume is:");
        System.out.println(width*height*depth);
    }
}
class BoxDemo3{
    public static void main(String[] args) {
        Box3 mybox =new Box3();
        mybox.width=10;
        mybox.height=20;
        mybox.depth=15;

        mybox.volume();
    }
}