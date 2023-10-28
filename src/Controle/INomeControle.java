package Controle;

import Controle.NomeControle;
import Modelo.NomeModelo;
import Persistencia.NomeDao;
import Persistencia.INomeDao;
import Tela.ImageView;

public interface INomeControle {
    NomeModelo buscarPorNome(String nome);
}
