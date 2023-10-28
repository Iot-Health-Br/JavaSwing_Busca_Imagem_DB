package Modelo;

import Controle.INomeControle;
import Controle.NomeControle;
import Persistencia.NomeDao;
import Persistencia.INomeDao;
import Tela.ImageView;

public class NomeModelo {
    private String nome;
    private byte[] foto;

    // Construtor
    public NomeModelo(String nome, byte[] foto) {
        this.nome = nome;
        this.foto = foto;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}

