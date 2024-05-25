package tela.usuario;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Avaliacao extends JPanel {
    private int avaliacao;
    private JLabel[] estrelas;

    public Avaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
        setLayout(new FlowLayout(FlowLayout.LEFT, 2, 0)); // Ajusta o espaçamento entre as estrelas

        estrelas = new JLabel[5];
        for (int i = 0; i < 5; i++) { //for e estilizacao da avaliacao por estrelas
            estrelas[i] = new JLabel("★");
            estrelas[i].setFont(new Font("SansSerif", Font.PLAIN, 24)); // Aumenta o tamanho da estrela
            estrelas[i].setForeground(i < avaliacao ? Color.YELLOW : Color.GRAY);

            final int estrelaIndex = i;
            estrelas[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    setAvaliacao(estrelaIndex + 1);
                    updateStars();
                }
            });

            add(estrelas[i]);
        }
    }

    private void updateStars() {
        for (int i = 0; i < estrelas.length; i++) {
            estrelas[i].setForeground(i < avaliacao ? Color.YELLOW : Color.GRAY);
        }
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
}