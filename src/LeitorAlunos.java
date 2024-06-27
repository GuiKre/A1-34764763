import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitorAlunos {
    public static List<Aluno> lerAlunos(String nomeArquivo) {
        List<Aluno> alunos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            br.readLine();
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(";");
                if (campos.length == 3) {
                    try {
                        String matricula = campos[0];
                        String nome = campos[1];
                        double nota = Double.parseDouble(campos[2]);
                        Aluno aluno = new Aluno(matricula, nome, nota);
                        alunos.add(aluno);
                    } catch (NumberFormatException e) {
                        System.err.println("Erro ao converter a nota para número: " + campos[2]);
                    }
                } else {
                    System.err.println("Linha fora do formato esperado: " + linha);
                }
            }
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado.");
        }

        return alunos;
    }
}
