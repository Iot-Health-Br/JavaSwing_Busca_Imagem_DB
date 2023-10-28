package Persistencia;

import Controle.INomeControle;
import Controle.NomeControle;
import Modelo.NomeModelo;
import Persistencia.NomeDao;
import Tela.ImageView;

public interface INomeDao {
    NomeModelo buscarPorNome(String nome);
}
