package br.com.jovas;

public class Main {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> ListaDuplaEncadeada = new ListaDuplamenteEncadeada<>();

        ListaDuplaEncadeada.add("c1");
        ListaDuplaEncadeada.add("c2");
        ListaDuplaEncadeada.add("c3");
        ListaDuplaEncadeada.add("c4");
        ListaDuplaEncadeada.add("c5");
        ListaDuplaEncadeada.add("c6");
        ListaDuplaEncadeada.add("c7");

        System.out.println(ListaDuplaEncadeada);
        ListaDuplaEncadeada.remove(3);
        ListaDuplaEncadeada.add(3,"99");
        System.out.println(ListaDuplaEncadeada);


    }
}
