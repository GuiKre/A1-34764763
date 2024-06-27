import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritorResumo {
public static void gravarResumo(String nomeArquivo, int totalAlunos, int aprovados, int reprovados, double menorNota, double maiorNota, double mediaGeral) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo))) {
            bw.write("TotalAlunos;Aprovados;Reprovados;MenorNota;MaiorNota;MediaGeral");
            bw.newLine();
            bw.write(totalAlunos + ";" + aprovados + ";" + reprovados + ";" + menorNota + ";" + maiorNota + ";" + mediaGeral);
        } catch (IOException e) {
            System.out.println("Erro!(EscritorResumo)");
        }
    }
}
