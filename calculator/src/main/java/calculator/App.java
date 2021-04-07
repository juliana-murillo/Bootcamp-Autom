package calculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App calculator = new App();
        System.out.println("Multiplication is: " + calculator.mul(5, 8.5));
        System.out.println("Division is: " + calculator.div(5, 8.5));
    }

    public double mul(double Num, double Num2){
        double result;
        result = Num * Num2;
        return result;
    }

    public double div(double Num, double Num2){
        double result;
        result = Num / Num2;
        return result;
    }
}
