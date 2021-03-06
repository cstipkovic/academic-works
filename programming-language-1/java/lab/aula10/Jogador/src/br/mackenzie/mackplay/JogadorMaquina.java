package br.mackenzie.mackplay;

public class JogadorMaquina extends Jogador {
    
    private String identificacao;
    private int numeroProcessadore;

    @Override
    public boolean alteraSenha(String login, String senha) {
        if (super.getLogin() != "") {
            super.setSenha(senha);
            super.setLogin(login);
            return true;
        }
        
        return false;
    }

    @Override
    public boolean validaSenha(String senha) {
        if (super.getSenha() == senha) {
            return true;
        }
        
        return false;
    }
    
    
}
