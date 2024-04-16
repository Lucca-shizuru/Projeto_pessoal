package tela.usuario;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Avaliacao extends JPanel {
    private int avaliacao;

    public Avaliacao(int avaliacaoInicial) {
        avaliacao = avaliacaoInicial; // Define a avaliação inicial
        setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        for (int i = 1; i <= 5; i++) {
            Estrela estrela = new Estrela(i <= avaliacaoInicial); //Cria uma estrela preenchida se i for menor ou igual à nova avaliação
            add(estrela); //adiciona a estrela
        }

        addMouseListener(new MouseAdapter() { // // Adiciona um ouvinte de mouse para capturar cliques nas estrelas
            @Override
            public void mouseClicked(MouseEvent e) {
                int starWidth = getWidth() / 5;
                int newRating = (int) Math.ceil((double) e.getX() / starWidth);
                setAvaliacao(newRating);
            }
        });

    }

    public int getAvaliacao() { // Método para obter a avaliação atual
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {  // Método para obter a avaliação atual
        this.avaliacao = avaliacao;
        removeAll();
        for (int i = 0; i <= 5; i++) {
            Estrela estrela = new Estrela(i <= avaliacao);
            add(estrela);

        }
        revalidate(); // Força a atualização da exibição das estrelas
        repaint(); // Redesenha as estrelas com a nova avaliação
    }

    private class Estrela extends JPanel {
        private final boolean filled;
        private boolean hovered;

        // Construtor que recebe um booleano indicando se a estrela deve ser preenchida
        public Estrela(boolean filled) {
            this.filled = filled;
            this.hovered = false;
            setPreferredSize(new Dimension(20, 20)); // Define o tamanho preferido da estrela

            // Adiciona um ouvinte de mouse para capturar eventos de entrada e saída do mouse
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    hovered = true; // Define o estado de mouse sobre a estrela como verdadeiro
                    repaint(); // Redesenha a estrela para refletir o novo estado
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    hovered = false; // Define o estado de mouse sobre a estrela como falso
                    repaint(); // Redesenha a estrela para refletir o novo estado
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            // Define as coordenadas dos pontos da estrela
            int[] xPoints = {10, 14, 20, 16, 18, 10, 2, 4, 0, 6};
            int[] yPoints = {0, 6, 6, 10, 16, 12, 16, 10, 6, 6};

            // Define a cor da estrela com base no estado de mouse sobre ela
            if (hovered) {
                g2d.setColor(Color.RED); // Cor da estrela quando o mouse está sobre ela
            } else {
                if (filled) {
                    g2d.setColor(Color.YELLOW); // Estrela preenchida será amarela
                } else {
                    g2d.setColor(Color.GRAY); // Estrela vazia será cinza
                }
            }

            // Desenha a estrela preenchida ou vazia
            if (filled) {
                g2d.fillPolygon(xPoints, yPoints, 10);
            } else {
                g2d.drawPolygon(xPoints, yPoints, 10);
            }
        }
    }
}

