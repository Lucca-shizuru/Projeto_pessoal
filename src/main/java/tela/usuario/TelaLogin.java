package tela.usuario;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TelaLogin extends JFrame {
    private JTextField email;
    private JPasswordField senha;
    private JButton login;

    public TelaLogin() {
        super("Bem vindo ao Read Wise");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,200);
        setLocationRelativeTo(null);
        // Usando GridBagLayout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Adiciona margens entre os componentes

        JLabel labelEmail = new JLabel(" Email: ");
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(labelEmail, gbc);

        email = new JTextField(20); // Define o tamanho do campo de texto
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL; // Estica horizontalmente
        add(email, gbc);

        JLabel labelSenha = new JLabel("Senha ");
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(labelSenha, gbc);

        senha = new JPasswordField(20); // Define o tamanho do campo de senha
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL; // Estica horizontalmente
        add(senha, gbc);

        login = new JButton("Login");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2; // Ocupa duas colunas
        gbc.fill = GridBagConstraints.HORIZONTAL; // Estica horizontalmente
        add(login, gbc);


        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ){
                String emailText = email.getText();
                String senhaText = String.valueOf(senha.getPassword());

                if (emailText.equals("admin1") && senhaText.equals("123Mudar"))
                {
                    JOptionPane.showMessageDialog(TelaLogin.this, "Login bem-sucedido! ");
                }

                else {
                    JOptionPane.showMessageDialog(TelaLogin.this,  "Email ou senha incorretos. Tente novamente.", "Erro de Login", JOptionPane.ERROR_MESSAGE);

                }

            }
        });



    }
}
