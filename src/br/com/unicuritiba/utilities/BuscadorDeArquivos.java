package br.com.unicuritiba.utilities;

import java.io.File;

public class BuscadorDeArquivos {
	public String procurarArquivos(File diretorio, String[] alvos) {
        StringBuilder resultado = new StringBuilder();

        // Procura os arquivos e pastas na pasta atual
        File[] arquivos = diretorio.listFiles();

        if (arquivos != null) {
            for (File arquivo : arquivos) {
                if (arquivo.isDirectory()) {
                    // Se for uma pasta, chama de novo o método para dentro dela
                    resultado.append(procurarArquivos(arquivo, alvos));
                } else {
                    // Se for um arquivo, verifica se o nome está correto
                    for (String alvo : alvos) {
                        if (arquivo.getName().endsWith(alvo)) {
                            resultado.append("---------------------------------------------------\n");
                            resultado.append("Nome do arquivo: ").append(arquivo.getName()).append("\n");
                            resultado.append("Arquivo encontrado em: ").append(arquivo.getAbsolutePath()).append("\n");
                            break;
                        }
                    }
                }
            }
        } else {
            System.out.println("Nenhum arquivo encontrado no diretório: " + diretorio.getAbsolutePath());
           
        }

        return resultado.toString();
    }
}

