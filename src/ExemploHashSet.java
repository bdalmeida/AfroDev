import java.util.LinkedHashSet;

public class ExemploHashSet {
    public static void main(String[] args) {


    LinkedHashSet<String> exemploHashSet = new LinkedHashSet<String>();

    //Adicionando elementos no LikedHashSet
    exemploHashSet.add("Z");
    exemploHashSet.add("PQ");
    exemploHashSet.add("N");
    exemploHashSet.add("N");
    exemploHashSet.add("S");
    exemploHashSet.add("O");
    exemploHashSet.add("KK");
    exemploHashSet.add("FGH");
    System.out.println(exemploHashSet);
    System.out.println("Tamanho : " + exemploHashSet.size());

    //Exemplo LinkedHashSet com Inteiros

        LinkedHashSet<Integer> exemploHashSet2 = new LinkedHashSet<Integer>();

        //Adicionando elementos no LikedHashSet
        exemploHashSet2.add(99);
        exemploHashSet2.add(7);
        exemploHashSet2.add(0);
        exemploHashSet2.add(67);
        exemploHashSet2.add(0);
        exemploHashSet2.add(89);
        exemploHashSet2.add(66);

        System.out.println(exemploHashSet2);
        System.out.println("Tamanho :  " + exemploHashSet2.size());

    }
}
