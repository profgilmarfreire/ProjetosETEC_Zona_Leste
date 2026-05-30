import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nomes = new ArrayList<>();

        //Adiciona elementos a lista add()
        nomes.add("Professor");
        nomes.add("Gilmar");
        nomes.add("Freire");

       //Acessar um elemento get(indice)
       // System.out.println(nomes.get(2));

    //Alterar um item
    nomes.set(0, "prof");
    //System.out.println(nomes);

    //Remover um item da lista
    //nomes.add("remover este");
    //System.out.println(nomes);
    //nomes.remove(3);    
    //System.out.println(nomes);

    //tamanho da lista
    //System.out.println(nomes.size());

    //6 - apagar a lista
    //nomes.clear();
    //System.out.println(nomes);

    //7 - Verifica se existe
    System.out.println(nomes.contains("Gilmar"));




    }
}
