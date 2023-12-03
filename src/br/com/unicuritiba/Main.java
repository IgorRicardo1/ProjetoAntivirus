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
        buscador.procurarArquivos(new File(diretorioInicial), alvo, alvo2, alvo3, alvo4);
        // como ele ta fazendo um a um a busca ta meio demorado, da pra alterar o metodo colocando
        // 4 entradas e verificando se é alguma delas
    }
}
