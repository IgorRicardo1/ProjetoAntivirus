package br.com.unicuritiba;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import br.com.unicuritiba.utilities.BuscadorDeArquivos;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            interfaceGrafica();
        });
    }

    private static void interfaceGrafica() {
        JFrame frame = new JFrame("Antivirus DiegoHunter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new GridLayout(5, 1));

        JCheckBox checkBox1 = new JCheckBox("execucao-aula-teste.exe");
        JCheckBox checkBox2 = new JCheckBox("execucao-aula.exe");
        JCheckBox checkBox3 = new JCheckBox("script-aula-teste.bat");
        JCheckBox checkBox4 = new JCheckBox("script-aula.bat");

        JButton closeButton = new JButton("Fechar");
        JButton eventButton = new JButton("Iniciar Procura");

        // Onde começa a busca
        String diretorioInicial = "C://";

        // Os arquivos procurados
        String[] alvos = {"execucao-aula-teste.exe", "execucao-aula.exe", "script-aula-teste.bat", "script-aula.bat"};

        // Instanciando a classe BuscadorDeArquivos
        BuscadorDeArquivos buscador = new BuscadorDeArquivos();

        eventButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                JOptionPane.showMessageDialog(frame, buscador.procurarArquivos(new File(diretorioInicial), alvos));
            }
        });

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(checkBox3);
        frame.add(checkBox4);
        frame.add(closeButton);
        frame.add(eventButton);

        frame.setVisible(true);
    }
}
