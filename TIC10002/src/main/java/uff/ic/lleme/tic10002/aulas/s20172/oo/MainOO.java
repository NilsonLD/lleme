package uff.ic.lleme.tic10002.aulas.s20172.oo;

import uff.ic.lleme.tic10002.aulas.s20172.Lista.ListaEstaticaDeEmpregados;
import uff.ic.lleme.tic10002.aulas.s20172.Lista.ListaDeEmpregado;

public class MainOO {

    public static void main(String[] args) {
        ListaDeEmpregado lista = new ListaEstaticaDeEmpregados();
        lista.inserir(null);

        Aluno a = new Aluno();
        a.nome = "Luiz";
    }
}
