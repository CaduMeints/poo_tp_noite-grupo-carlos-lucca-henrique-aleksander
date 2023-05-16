package src;

import java.util.*;

public class Cliente {
    private String nome;
    private String senha;
    private String nomeUsuario;
    private ArrayList<Midia> midiasFuturas;
    private ArrayList<Midia> midiasAssistidas;

    public Cliente(String nome, String senha, String nomeUsuario) {
        this.nome = nome;
        this.senha = senha;
        this.nomeUsuario = nomeUsuario;
        this.midiasFuturas = new ArrayList<>();
        this.midiasAssistidas = new ArrayList<>();
    }

    public void adicionarMidiaFutura(Midia midia) {
        boolean contemMidia = midiasFuturas.contains(midia);
        if (!contemMidia) {
            this.midiasFuturas.add(midia);
        }

    }

    public String getNome() {
        return nome;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void terminarMidia(Midia midia) {
        if (!midiasAssistidas.contains(midia)) {
            this.midiasAssistidas.add(midia);
            midia.adicionaAssistido();
        }
    }

    public Midia buscarMidia(Midia midia) {

        for (Midia m : this.midiasFuturas) {
            if (m.equals(midia)) {
                return m;
            }
        }
        for (Midia m : this.midiasAssistidas) {
            if (m.equals(midia)) {
                return m;
            }
        }
        return null;
    }

    public ArrayList<Midia> getMidiasAssistidas() {
        return midiasAssistidas;
    }

    public ArrayList<Midia> getMidiasFuturas() {
        return midiasFuturas;
    }

    public String getSenha() {
        return senha;
    }

}