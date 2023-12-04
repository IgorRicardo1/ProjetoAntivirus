package br.com.unicuritiba;

import java.io.File;

import br.com.unicuritiba.utilities.BuscadorDeArquivos;

public class Main {

    public static void main(String[] args) {
        // Onde começa a busca
        String diretorioInicial = "C://";

        // Os arquivos procurados
        String[] alvos = {"execucao-aula-teste.exe", "execucao-aula.exe", "script-aula-teste.bat", "script-aula.bat"};;

        // Instanciando a classe BuscadorDeArquivos
        BuscadorDeArquivos buscador = new BuscadorDeArquivos();

        // Chama o método de busca
        buscador.procurarArquivos(new File(diretorioInicial), alvos);
    }
}
