package testes;

import java.util.List;

import br.fiap.challenge.DAO.LojaDAO;
import br.fiap.challenge.model.LojaModel;

public class teste {

	public static void main(String[] args) {
		
		LojaDAO Loja = new LojaDAO();
		
		
		List<LojaModel> L = Loja.getLoja(1);
		
		for(LojaModel item : L){
            System.out.print(item.getNome());
        }

	}

}
