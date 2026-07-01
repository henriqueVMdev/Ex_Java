
public class EX2{
public static void main(String[] args) {

    itemCardapio item1 = new itemCardapio("refresco do chaves", 2,
            "Suco de limao que parece tamarindo e tem gosto de groselha",2.99);

    itemCardapio item2 = new itemCardapio("Sanduiche de presunto", 3, "Sanduiche de presunto simples", 3.50);

    IO.println("---------------------------------------------------------------------");
    IO.println(item1.getNome());
    IO.println(item1.obtemNomeCategoria());
    IO.println(item1.getPreco());
    IO.println(item1.getDescricao());
    IO.println("---------------------------------------------------------------------");
    IO.println(item2.getNome());
    IO.println(item2.obtemNomeCategoria());
    IO.println(item2.getPreco());
    IO.println(item2.getDescricao());
    item2.definePromocao(2.99);
    IO.println(precoComd)
    }

}