package tela.usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDatabase {
    private static List<Usuario> usuarios = new ArrayList<>();

    public static void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public static Usuario buscarUsuarioPorEmailESenha(String email, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                return usuario;
            }
        }
        return null;
    }

    public static List<Usuario> getUsuarios() {
        return usuarios;
    }
}

