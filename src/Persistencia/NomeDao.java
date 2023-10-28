package Persistencia;

import ConexãoBD.DatabaseConnection;

import Controle.INomeControle;
import Controle.NomeControle;
import Modelo.NomeModelo;
import Persistencia.INomeDao;
import Tela.ImageView;

import java.sql.*;

public class NomeDao implements INomeDao {
    public NomeModelo buscarPorNome(String nome) {

        final String TABELA_NOME_MODELO = "tabeladepessoas";
        final String COLUNA_NOME = "nome";
        final String COLUNA_IMAGEM = "foto";

        try (Connection conexao = DatabaseConnection.getConnection();
             PreparedStatement statement = conexao.prepareStatement(String.format("SELECT %s, %s FROM %s WHERE %s = ?", COLUNA_NOME, COLUNA_IMAGEM, TABELA_NOME_MODELO, COLUNA_NOME))) {
                statement.setString(1, nome);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        // Usando o novo construtor aqui
                        NomeModelo pessoa = new NomeModelo(resultSet.getString("nome"), resultSet.getBytes("foto"));
                        return pessoa;}}}
        catch (SQLException e) {
               e.printStackTrace();}
        return null;
    }
}
