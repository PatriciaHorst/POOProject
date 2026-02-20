package model;
import java.util.List;
import java.util.ArrayList;

public class paciente extends usuario {

     List<consulta> historicoConsultas = new ArrayList<>();

     public paciente(String nome, String cpf, String email, String senha){
          super(nome,cpf, email, senha);
      }

      public void exibirInfo(){
          System.out.println("Nome paciente: "+nome+"\nCpf : "+cpf+"\nEmail : "+email+"\n);
      }
  
}
