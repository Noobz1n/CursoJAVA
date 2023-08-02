public class math_functions {
    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x); //sqrt raiz quadrada
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + x + " = " + B);
        System.out.println("Raiz quadrada de 25 = "+ C);

        A = Math.pow(x, y); //pow é potência
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado a 2.0 = "+ B);
        System.out.println("5.0 elevado a 2.0 = "+ C);

        A = Math.abs(y); //abs significa absoluto, vai transformar o numero em positivo caso ele seja negativo.
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);
    }
}
