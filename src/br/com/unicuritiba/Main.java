package br.com.unicuritiba;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());

        JPanel checkboxesPanel = new JPanel(new GridLayout(2, 2));

        JCheckBox checkBox1 = new JCheckBox("execucao-aula-teste.exe");
        JCheckBox checkBox2 = new JCheckBox("execucao-aula.exe");
        JCheckBox checkBox3 = new JCheckBox("script-aula-teste.bat");
        JCheckBox checkBox4 = new JCheckBox("script-aula.bat");

        checkboxesPanel.add(checkBox1);
        checkboxesPanel.add(checkBox2);
        checkboxesPanel.add(checkBox3);
        checkboxesPanel.add(checkBox4);

        JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
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
                // Obter os alvos selecionados
                List<String> alvosSelecionados = new ArrayList<>();
                if (checkBox1.isSelected()) {
                    alvosSelecionados.add("execucao-aula-teste.exe");
                }
                if (checkBox2.isSelected()) {
                    alvosSelecionados.add("execucao-aula.exe");
                }
                if (checkBox3.isSelected()) {
                    alvosSelecionados.add("script-aula-teste.bat");
                }
                if (checkBox4.isSelected()) {
                    alvosSelecionados.add("script-aula.bat");
                }

                // Verificar se pelo menos um alvo foi selecionado
                if (alvosSelecionados.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Selecione pelo menos um item para buscar.");
                    return;
                }

                // Chamar o método de busca apenas para os alvos selecionados
                JOptionPane.showMessageDialog(frame, buscador.procurarArquivos(new File(diretorioInicial), alvosSelecionados.toArray(new String[0])));
            }
        });

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        buttonsPanel.add(closeButton);
        buttonsPanel.add(eventButton);

        // Adiciona os painéis ao JFrame
        frame.add(checkboxesPanel, BorderLayout.CENTER);
        frame.add(buttonsPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
