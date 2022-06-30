/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.MCadastroPessoa.services;

import br.com.senactech.MCadastroPessoa.dao.CarroDAO;
import br.com.senactech.MCadastroPessoa.dao.DAOFactory;
import br.com.senactech.MCadastroPessoa.model.Carro;
import java.util.ArrayList;
import java.sql.SQLException;

/**
 *
 * @author eae
 */
public class CarroServicos {

    public void cadCarro(Carro cVO) throws SQLException {
        CarroDAO cDAO = DAOFactory.getCarroDAO();
        cDAO.cadastrarCarro(cVO);
    }

    public ArrayList<Carro> getCarros() throws SQLException {
        CarroDAO cDAO = DAOFactory.getCarroDAO();
        return cDAO.buscarCarros();
    }

    public boolean verPlaca(String placa) throws SQLException {
        CarroDAO cDAO = DAOFactory.getCarroDAO();
        return cDAO.verPlaca(placa);
    }

    public Carro pesquisarPlacaBD(String placa) throws SQLException {
        CarroDAO cDAO = DAOFactory.getCarroDAO();
        return cDAO.getByDocBD(placa);
    }

    public void deletarCarroBD(String placa) throws SQLException {
        CarroDAO cDAO = DAOFactory.getCarroDAO();
        cDAO.deletarCarro(placa);
    }

    public void atualizarCarroBD(Carro cVO) throws SQLException {
        CarroDAO cDAO = DAOFactory.getCarroDAO();
        cDAO.atualizarCarro(cVO);
    }
    
}

/*

    SIGLAS

    • VO = Value Object - Objeto de valor

    • DAO = Data Access Object - Acesso aos dados do objeto

    • Factory = Fábrica

     

    Dentro dessa classe DAO colocaremos todos os códigos de SQL DML(Data

    manipulation language), ou seja, vamos colocar os seguintes códigos:

    • insert

    • select

    • update

    • delete

 */
