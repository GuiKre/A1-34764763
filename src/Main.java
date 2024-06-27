import java.util.List;

public class Main {
    public static void main(String[] args) {
        String nomeArquivoAlunos = "alunos.csv";
        List<Aluno> alunos = LeitorAlunos.lerAlunos(nomeArquivoAlunos);
        GravadorAlunos.GravarAlunos(alunos);
    }
}
