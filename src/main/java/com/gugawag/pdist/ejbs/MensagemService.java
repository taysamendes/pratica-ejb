package com.gugawag.pdist.ejbs;

import com.gugawag.pdist.model.Mensagem;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.util.List;

@Stateless(name = "mensagemService")
@Remote
public class MensagemService {

    @EJB
    private MensagemDAO mensagemDAO;

    public void inserir(long id, String nome){
        Mensagem mensagem = new Mensagem(id,nome);
        mensagemDAO.inserir(mensagem);
    }

    public List<Mensagem> listar(){
        return mensagemDAO.listar();
    }


}
