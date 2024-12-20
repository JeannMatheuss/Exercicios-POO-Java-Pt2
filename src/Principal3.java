public class Principal3 {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 2000.00);
        produto.aplicarDesconto(10);
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço com desconto: " + produto.getPreco());
    }
}
