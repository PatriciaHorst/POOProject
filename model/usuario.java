package model;

public abstract class Usuario {

    protected String nome;
    protected String cpf;
    protected String email;
    protected String senha;

    public Usuario(String nome, String cpf, String email, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){

        if(cpf.length() != 11){
            System.out.println("Seu CPF é  invalido ;(");
        }else{
            System.out.println("Seu CPF foi validado ;)");
            this.cpf = cpf;
        }
        }
        
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){

            if(verificação.contains("@")){
                this.email = email;
                System.out.println("Seu email foi validado! ;)");
            }else{
                System.out.println("Seu email é invalido ;(");
            }
        }
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha ){
        this.senha = senha;
    }

    public abstract void exibirInfo();

}
