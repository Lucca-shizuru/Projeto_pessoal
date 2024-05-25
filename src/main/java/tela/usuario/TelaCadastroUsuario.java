package tela.usuario;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroUsuario extends JFrame{
    private final JTextField Nome;
    private final JTextField Email;
    private final JPasswordField Senha;
    private final JButton botaoSalvar;
    private final JButton botaoCancelar;



    public TelaCadastroUsuario() {
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
        add(new JLabel("Nome:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        Nome = new JTextField(20);
        add(Nome, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Email:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        Email = new JTextField(20);
        add(Email, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Senha:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        Senha = new JPasswordField(20);
        add( Senha, gbc);

        // Adiciona botões de Cadastrar e cancelar
        gbc.gridx = 0;
        gbc.gridy = 4;
        botaoSalvar = new JButton("Cadastrar");
        add(botaoSalvar, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        botaoCancelar = new JButton("Cancelar");
        add(botaoCancelar, gbc);
        // Adiciona botões de salvar e cancelar
        botaoSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarUsuario();
            }
        });

        botaoCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancelarCadastro();
            }
        });

    }

        public void cadastrarUsuario() {
            String nome = Nome.getText();
            String email = Email.getText();
            String senha = new String(Senha.getPassword());
            if (nome.isEmpty() || email.isEmpty() || senha.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                Usuario usuario = new Usuario(nome, email, senha);
                UsuarioDatabase.adicionarUsuario(usuario);
                JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!");
                abrirTeladeLogin();
                dispose();
            }
        }


            public void cancelarCadastro () {
                Nome.setText("");
                Email.setText("");
                Senha.setText("");
                dispose();
            }
            public void abrirTeladeLogin () {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        TelaLogin telaLogin = new TelaLogin();
                        telaLogin.setVisible(true);

                    }
                });

            }


        }

