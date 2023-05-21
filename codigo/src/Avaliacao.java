package src;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Avaliacao {
    private LocalDateTime data;
    private int avaliacao;
    private String comentario;
    private Midia midiaAvaliada;

    public Avaliacao(int avaliacao, String comentario, Midia midiaAvaliada) {
        this.avaliacao = avaliacao;
        this.comentario = comentario;
        this.data = LocalDateTime.now();
        this.midiaAvaliada = midiaAvaliada;
    }

    public Avaliacao(int avaliacao, Midia midiaAvaliada) {
        this.avaliacao = avaliacao;
        this.comentario = null;
        this.data = LocalDateTime.now();
        this.midiaAvaliada = midiaAvaliada;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public String getComentario() {
        if (comentario == null) {
            return "Sem comentário";
        }
        return comentario;
    }

    @Override
    public String toString() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedData = data.format(formatter);
        StringBuilder sb = new StringBuilder();
        sb.append("Avaliação: ").append(avaliacao).append("\n");
        if (comentario != null) {
            sb.append("Comentário: ").append(getComentario()).append("\n");
        }
        sb.append("Data: ").append(formattedData).append("\n");
        return sb.toString();
    }
}
