public class IdadePessoa {
    private int idade;
    private String nome;

    

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void verificaIdade () {
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade");
        }
        else {
            System.out.println(nome + " é menor de idade");
        }
    }
}
