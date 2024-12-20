import java.util.List;

public class Aluno {
    // Atributos privados
    private String nome;
    private List<Double> notas;

    // Construtor
    public Aluno(String nome, List<Double> notas) {
        this.nome = nome;
        this.notas = notas;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    // Método para calcular a média
    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }
}
