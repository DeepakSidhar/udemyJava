public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
//Method named add with two parameters real and imaginary of type double,
// it needs to add parameters to fields. In other words, it needs to do a complex number add operation as described above.
    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;

    }
//Method named add with one parameter of type ComplexNumber. It needs to add the ComplexNumber parameter to the corresponding instance variables.
    public void add(ComplexNumber complexNumber){
        add(complexNumber.getReal(), complexNumber.getImaginary());

    }

    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;

    }

    public void subtract(ComplexNumber complexNumber){
        subtract(complexNumber.getReal() , complexNumber.getImaginary());

    }
}
