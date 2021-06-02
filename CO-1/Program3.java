class ComplexNumber{
    int real;
    int image;
}
public class Program3 {
    public static void main(String[] args) {
        ComplexNumber num1=new ComplexNumber();
        ComplexNumber num2=new ComplexNumber();
        num1.real=3;
        num1.image=4;
        num2.real=5;
        num2.image=2;
        
        System.out.println("Addition of complex number:"+(num1.real+num2.real)+"+"+(num1.image+num2.image)+"i");
        
    }
}
