package src;

import java.util.Scanner;

public class ClienteEspecialista implements IComentarista{

    @Override
    public void addComentario(String comentario, Avaliacao avaliacao) {
        avaliacao.addComentario(comentario);
    }
    
}
