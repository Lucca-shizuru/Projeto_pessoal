package tela.usuario;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TelaFeed extends JFrame {
    private JPanel panel;

    public TelaFeed() {
        setTitle("Feed de Livros");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(panel);
        add(scrollPane, BorderLayout.CENTER);

        atualizarFeed();
    }

    public void atualizarFeed() {
        panel.removeAll();
        List<Livro> livros = LivroDatabase.getLivros();
        for (Livro livro : livros) {
            JPanel livroPanel = new JPanel();
            livroPanel.setLayout(new BoxLayout(livroPanel, BoxLayout.Y_AXIS));
            livroPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

            JLabel tituloLabel = new JLabel("Título: " + livro.getTitulo());
            JLabel autorLabel = new JLabel("Autor: " + livro.getAutor());
            JLabel generoLabel = new JLabel("Gênero: " + livro.getGenero());
            JLabel avaliacaoLabel = new JLabel("Avaliação: " + livro.getAvaliacao());

            livroPanel.add(tituloLabel);
            livroPanel.add(autorLabel);
            livroPanel.add(generoLabel);
            livroPanel.add(avaliacaoLabel);

            panel.add(livroPanel);
        }
        panel.revalidate();
        panel.repaint();
    }
}