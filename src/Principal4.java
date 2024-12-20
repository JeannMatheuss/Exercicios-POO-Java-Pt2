import java.util.List;

public class Principal4 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", List.of(7.5, 8.0, 9.0));
        System.out.println("Média do aluno: " + aluno.calcularMedia());
    }
}
