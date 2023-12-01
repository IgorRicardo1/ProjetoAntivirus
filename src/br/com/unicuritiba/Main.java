package br.com.unicuritiba;
///teste
import java.io.File;

public class Main {

    public static void main(String[] args) {
        // Onde começa a busca
        String diretorioInicial = "C://";

        // Os arquivos procurados
        String alvo = "arquivo do teste.txt";

        // Chama o método de busca
        procurarArquivos(new File(diretorioInicial), alvo);
    }

    public static void procurarArquivos(File diretorio, String alvo) {
        // Procura os arquivos e pastas na pasta atual
        File[] arquivos = diretorio.listFiles();

        if (arquivos != null) {
            for (File arquivo : arquivos) {
                if (arquivo.isDirectory()) {
                    // Se for uma pasta, chama de novo o método para dentro dela
                    procurarArquivos(arquivo, alvo);
                } else {
                    // Se for um arquivo, verifica se o nome está correto
                    if (arquivo.getName().endsWith(alvo)) {
                        System.out.println("Arquivo encontrado em: " + arquivo.getAbsolutePath());
                    }
                }
            }
        }
    }
}
