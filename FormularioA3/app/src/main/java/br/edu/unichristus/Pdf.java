package br.edu.unichristus;

import java.util.ArrayList;
import java.util.List;

public class Pdf {

    private String nome;
    private String descricao;
    private Estado estado;

    //métodos
    public Pdf (String nome, String descricao, Estado estado){
        this.nome = nome;
        this.descricao = descricao;
        this.estado = estado;
    }
}


