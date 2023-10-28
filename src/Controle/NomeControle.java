package Controle;

import javax.swing.*;
import Tela.ImageView;

import Controle.INomeControle;
import Modelo.NomeModelo;
import Persistencia.NomeDao;
import Persistencia.INomeDao;
import Tela.ImageView;

public class NomeControle implements INomeControle {
    private INomeDao dao = new NomeDao();
    public NomeModelo buscarPorNome(String nome) {
        return dao.buscarPorNome(nome);
    }
}



