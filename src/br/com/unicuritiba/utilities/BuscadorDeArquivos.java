package br.com.unicuritiba.utilities;

import java.io.File;

public class BuscadorDeArquivos {
      public void procurarArquivos(File diretorio, String alvo) {
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
                        System.out.println("Nome do arquivo: " + arquivo.getName());
                        System.out.println("Arquivo encontrado em: " + arquivo.getAbsolutePath());
                    }
                }
            }
        }
    }
}
