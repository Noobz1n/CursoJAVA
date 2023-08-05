package Aulas;

public class string_manipulation {
    public static void main(String[] args){
        String original = "abcde FGHIJ ABC abc DEFG    ";

        String s01 = original.toLowerCase(); // joga tudo pra minusculo
        String s02 = original.toUpperCase(); // joga tudo pra maiusculo
        String s03 = original.trim(); //remove todos os espacos que tem no final
        String s04 = original.substring(2); //vai comecar a palavra aparti do segundo caractere (lembrando que começa no 0)
        String s05 = original.substring(2, 9); // vai do segundo caractere até o nôno
        String s06 = original.replace('a', 'x'); // vai trocar todos os caracteres que tem 'a' por 'x'
        String s07 = original.replace("abc", "xy"); // vai trocar todos os caracteres que tem 'abc' por 'xy'
        int i = original.indexOf("bc"); // vai mostrar o primeiro indice do caractere "bc"
        int j = original.lastIndexOf("bc"); // vai mostrar o ultimo indice do caractere "bc"
        String s = "potato apple lemon";
        String[] vect = s.split(" "); // o split vai recortar as frases e jogar em um vetor, as palavras serao separadas por indice



        System.out.println("Original: -"+ original + "-");
        System.out.println("toLowerCase: -"+ s01 + "-");
        System.out.println("toUpperCase: -"+s02 + "-");
        System.out.println("trim: -"+s03 + "-");
        System.out.println("substring(2): -"+s04 + "-");
        System.out.println("substring(2, 9): -"+s05 + "-");
        System.out.println("replace('a','x'): -"+s06 + "-");
        System.out.println("replace('abc','xy'): -"+s07 + "-");
        System.out.println("indexOf(''bc''): "+ i);
        System.out.println("lastIndexOf(''bc''): "+ j);
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);

    }
}
