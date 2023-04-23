package src;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Serie {

    private String nome;
    private ArrayList<String> idioma;
    private ArrayList<String> genero;
    private LocalDate data;
    private String identificador;
    private int assistidaPorClientes;

    public Serie(String nome,  String identificador, LocalDate data) {
        this.nome = nome;
        this.idioma = new ArrayList<>();
        this.genero = new ArrayList<>();
        this.identificador = identificador;
        this.assistidaPorClientes = 0;
        this.data = data;
    }

    public Serie(String nome, ArrayList<String> idioma, ArrayList<String> genero, String identificador,
            int assistidaPorClientes, LocalDate data) {
        this.nome = nome;
        this.idioma = idioma;
        this.genero = genero;
        this.identificador = identificador;
        this.assistidaPorClientes = assistidaPorClientes;
        this.data = data;
    }

    public String getData(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return  data.format(formatter);
    }

    public void adicionaAssistido() {
        this.assistidaPorClientes++;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<String> getIdioma() {
        return idioma;
    }

    public ArrayList<String> getGenero() {
        return genero;
    }

    public String getIdentificador() {
        return identificador;
    }

    public int getAssistidaPorClientes() {
        return assistidaPorClientes;
    }

}