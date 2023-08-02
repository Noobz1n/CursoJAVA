import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        String nome = "Victor";
        int idade = 19;
        double renda = 4000.00;

        int y = 32;
        double x = 14.10893;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.println("Olá, Mundo!");
        System.out.println(y);
        Locale.setDefault(Locale.US); //definir a localidade do programa pra United States
        System.out.printf("%.4f%n", x); // aqui já ta usando o "." pra numeros com ponto flutuante
        System.out.printf("RESULTADO = %.2f metros%n", x); //concatenando um elemento
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); //concatenando varios elementos


    }
}