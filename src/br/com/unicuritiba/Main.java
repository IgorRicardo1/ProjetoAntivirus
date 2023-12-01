package br.com.unicuritiba;
///teste do teste
import java.io.File;

import br.com.unicuritiba.utilities.BuscadorDeArquivos;

public class Main {

    public static void main(String[] args) {
        // Onde começa a busca
        String diretorioInicial = "C://";

        // Os arquivos procurados
        String alvo = "arquivo do teste.txt";

        // Instanciando a classe BuscadorDeArquivos
        BuscadorDeArquivos buscador = new BuscadorDeArquivos();

        // Chama o método de busca
        buscador.procurarArquivos(new File(diretorioInicial), alvo);
    }
}
