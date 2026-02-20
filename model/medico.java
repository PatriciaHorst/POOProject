package model;
public abstract class medico extends usuario {

    private String crm;
    private String especialidade;

    public medico(String nome, String cpf, String email, String senha, String crm, String especilidade){
        super(nome,cpf, email, senha);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getCrm(){
        return crm;
    }

    public void setCrm(String crm){
        this.crm = crm;
    }

    public String getespecialidade(){
        return especialidade;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    @Override

    public void exibirInfo(){
        System.out.println("Nome medico: "+nome+"\nCpf : "+cpf+"\nEmail : "+email+"\nCrm "+ crm +"\nEspecialidade: "+especialidade);
    }
      
}
