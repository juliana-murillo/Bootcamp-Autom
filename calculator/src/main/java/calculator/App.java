package calculator;


public class App 
{
    public static void main( String[] args )
    {
        App calculator = new App();
        System.out.println("Sum is: " + calculator.add(5, 8.5));
        System.out.println("Substraction is: " + calculator.sub(5, 8.5));
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
    public double add(double Num, double Num2){
        double result;
        result = Num + Num2;
        return result;
    }

    public double sub(double Num, double Num2){
        double result;
        result = Num - Num2;
        return result;
    }
    
}
