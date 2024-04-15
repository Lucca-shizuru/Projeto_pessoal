import tela.usuario.TelaCadastroDeLivros;
import tela.usuario.TelaLogin;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TelaLogin telaLogin = new TelaLogin();
                telaLogin.setVisible(true);

                TelaCadastroDeLivros telaCadastroLivros = new TelaCadastroDeLivros();
                telaCadastroLivros.setVisible(true);

            }
        });




    }
}