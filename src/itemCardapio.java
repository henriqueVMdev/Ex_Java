public class itemCardapio {
    public itemCardapio(String nome, int categoria, String descricao, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
        boolean emPromocao;
        double precoComDesconto;
    }

    private String nome;
    public String getNome() {return nome;}

    private int categoria;

    private String descricao;
    public String getDescricao() {return descricao;}

    private double preco;
    public double getPreco() {return preco;}

    private boolean emPromocao;

    private double precoComDesconto;

   String obtemNomeCategoria() {
        String nomeCategoria;
       switch (categoria) {
           case 1:
               nomeCategoria = "Entradas";
               break;
           case 2:
               nomeCategoria = "Bebidas";
               break;
           case 3:
               nomeCategoria = "Pratos principais";
               break;
           case 4:
               nomeCategoria = "Sobremesas";
               break;
           default:
               nomeCategoria = "Categoria invalida";

       }
       return nomeCategoria;
   }
   double calculaPorcentagemDesconto(){
        return (preco - precoComDesconto) / preco * 100;
   }

   void definePromocao(double precoComDesconto){
        emPromocao = true;
        this.precoComDesconto = precoComDesconto;
   }

}