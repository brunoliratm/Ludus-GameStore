package Servico;

import Entidade.Adm;
import Repositorio.RepositorioAdm;

public class AdmServico {
    public static boolean verificacaoNoSistema(String cpf){
        return RepositorioAdm.checkAdm(cpf);
    }
    public static Adm verificacaoNoSistema(String cpf, String senha){
        return RepositorioAdm.entrarNoSistema(cpf, senha);
    }
}
