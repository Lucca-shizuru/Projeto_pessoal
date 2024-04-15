package tela.usuario;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class TelaCadastroDeLivros extends JFrame{
        private JTextField Titulo;
        private JTextField Autor;
        private JTextField Genero;
        private JButton botaoSalvar;
        private JButton botaoCancelar;

        public TelaCadastroDeLivros() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(400,200);
            setLocationRelativeTo(null);
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 5, 5, 5);
            gbc.fill = GridBagConstraints.HORIZONTAL;

            // Adiciona componentes à tela com GridBagConstraints
            gbc.gridx = 0;
            gbc.gridy = 0;
            add(new JLabel("Título:"), gbc);

            gbc.gridx = 1;
            gbc.gridy = 0;
            Titulo = new JTextField(20);
            add(Titulo, gbc);

            gbc.gridx = 0;
            gbc.gridy = 1;
            add(new JLabel("Autor:"), gbc);

            gbc.gridx = 1;
            gbc.gridy = 1;
            Autor = new JTextField(20);
            add(Autor, gbc);

            gbc.gridx = 0;
            gbc.gridy = 3;
            add(new JLabel("Gênero:"), gbc);

            gbc.gridx = 1;
            gbc.gridy = 3;
            Genero= new JTextField(20);
            add(Genero, gbc);

            // Adiciona botões de salvar e cancelar
            gbc.gridx = 0;
            gbc.gridy = 4;
            botaoSalvar = new JButton("Salvar");
            add(botaoSalvar, gbc);

            gbc.gridx = 1;
            gbc.gridy = 4;
            botaoCancelar = new JButton("Cancelar");
            add(botaoCancelar, gbc);

            // Adiciona botões de salvar e cancelar
            botaoSalvar = new JButton("Salvar");
            botaoSalvar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String titulo = Titulo.getText();
                    String autor = Autor.getText();
                    String genero = Genero.getText();


                    // Verifica se todos os campos foram preenchidos
                    if (titulo.isEmpty() || autor.isEmpty() || genero.isEmpty()) {
                        JOptionPane.showMessageDialog(TelaCadastroDeLivros.this, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        // Aqui você pode realizar a lógica para salvar os dados do livro, por exemplo, gravá-los em um banco de dados
                    }

                }
            });
            botaoCancelar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });


        }
}
