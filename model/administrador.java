package model;
public class administrador extends usuario {

    private String nivelAcesso;

    public administrador(String nome, String cpf, String email, String senha, String nivelAcesso){
        super(nome,cpf, email, senha);
        this.nivelAcesso = nivelAcesso;
    }

    public String getNivelAcesso(){
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso){
        this.nivelAcesso = nivelAcesso;
    }

    @Override

    public void exibirInfo(){
        System.out.println("Nome administrador: "+nome+"\nCpf : "+cpf+"\nEmail : "+email+"\n);
    }
      
}
