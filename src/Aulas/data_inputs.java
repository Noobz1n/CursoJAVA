import java.util.Locale;
import java.util.Scanner;

public class data_inputs {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //entrada de dados com string
        String x;
        System.out.print("Digite uma palavra: ");
        x = sc.next();
        System.out.println("Palavra digitada: " + x);

        // entrada de dados com numero inteiro
        int y;
        System.out.print("Digite um numero inteiro: ");
        y = sc.nextInt();
        System.out.println("Numero digitado: " + y);

        // entrada de dados com numero com ponto flutuante
        double ponto_flutuante;
        System.out.print("Digite um numero com ponto flutuante: ");
        ponto_flutuante = sc.nextDouble();
        System.out.println("Numero digitado: " + ponto_flutuante);

        // entrada de dados para pegar o char, primeiro caractere digitado
        char letra;
        System.out.print("Digite um caractere ou uma palavra: ");
        letra = sc.next().charAt(0);
        System.out.println("Primeiro caractere digitado: " + letra);

        // entrada de varios dados
        String nome;
        int numero_inteiro;
        double numero_quebrado;

        System.out.print("Insira os dados (nome, numero inteiro e numero com ponto flutuante): ");
        nome = sc.next();
        numero_inteiro = sc.nextInt();
        numero_quebrado = sc.nextDouble();

        System.out.println("Nome digitado: " + nome);
        System.out.println("Numero inteiro digitado: " + numero_inteiro);
        System.out.println("Numero com ponto flutuante: " + numero_quebrado);


        //como ler uma frase completa
        String palavra, palavra2, palavra3;
        int number;

        System.out.print("Digite primeiro um numero inteiro: ");
        number = sc.nextInt();
        System.out.println("Numero inteiro digitado: " + number);
        sc.nextLine(); // ESSE NEXT LINE FOI PRA LIMPAR A QUEBRA DE LINHA PENDENTE.

        System.out.print("Digite a primeira frase: ");
        palavra = sc.nextLine();
        System.out.println("Primeira frase digitada: " + palavra);

        System.out.print("Digite a segunda frase: ");
        palavra2 = sc.nextLine();
        System.out.println("Segunda frase digitada: " + palavra2);


        System.out.print("Digite a terceira frase: ");
        palavra3 = sc.nextLine();
        System.out.print("Terceira frase digitada: " + palavra3);


        sc.close();
    }


}
