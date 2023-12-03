package br.com.unicuritiba;

import java.io.File;

import br.com.unicuritiba.utilities.BuscadorDeArquivos;

public class Main {

    public static void main(String[] args) {
        // Onde começa a busca
        String diretorioInicial = "C://";

        // Os arquivos procurados
        String alvo = "execucao-aula-teste.exe";
        String alvo2 = "execucao-aula.exe";
        String alvo3 = "script-aula-teste.bat";
        String alvo4 = "script-aula.bat";

        // Instanciando a classe BuscadorDeArquivos
        BuscadorDeArquivos buscador = new BuscadorDeArquivos();

        // Chama o método de busca
        buscador.procurarArquivos(new File(diretorioInicial), alvo);
        buscador.procurarArquivos(new File(diretorioInicial), alvo2);
        buscador.procurarArquivos(new File(diretorioInicial), alvo3);
        buscador.procurarArquivos(new File(diretorioInicial), alvo4);
    }
}
