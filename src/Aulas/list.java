package Aulas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class list {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();

        list.add("Victor"); // add adiciona na lista
        list.add("Silvia");
        list.add("Gaspar");
        list.add("Viviane");
        list.add(2, "Teste"); //adicionando na lista e indicando o indice que vai ficar o item adicionado

        System.out.println("Tamanho da lista: " + list.size()); //mostra o tamanho da lista

        for (String x : list){
            System.out.println(x);
        }

       // list.remove("Gaspar"); pode remover oq botou ou por indice
        System.out.println("---------------------------------");
        list.removeIf(x -> x.charAt(0) == 'V'); //Aqui remove todas os itens da lista que começa com 'V'


        for (String x : list){
            System.out.println(x);
        }

        System.out.println("---------------------------------");

        System.out.println("Index of Gaspar: " + list.indexOf("Gaspar")); //se tiver, retorna o indice
        System.out.println("Index of Victor: " + list.indexOf("Victor")); //se nao tiver, retorna o indice -1

        System.out.println("---------------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'G').toList(); // aqui ele vai gerar uma lista apenas com os itens que comeca com 'G'

        for (String x : result){
            System.out.println(x);
        }

        System.out.println("---------------------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'S').findFirst().orElse(null);

        System.out.println(name);












    }
}
