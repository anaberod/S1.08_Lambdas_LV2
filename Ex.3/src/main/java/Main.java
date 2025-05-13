public class Main {
    public static void main(String[] args) {

        float a = 10f;
        float b = 6.7f;

        Operation sum = () -> a + b;
        Operation subtract = () -> a - b;
        Operation multiply = () -> a * b;
        Operation divide = () -> a / b;

        System.out.println("Sum: " + sum.operation());
        System.out.println("Subtraction: " + subtract.operation());
        System.out.println("Multiplication: " + multiply.operation());
        System.out.println("Division: "+ divide.operation());





    }
}
