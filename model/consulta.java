package model;
import model.paciente;
import model.medico;

public abstract class consulta {

    protected int codigo;
    private paciente infoPaciente; 
    protected  medico infoMedico; 
    protected String data;
    protected double valor;
    protected String status;

    public consulta (int codigo, paciente infoPaciente, medico infoMedico, String data, double valor, String status){
        this.codigo = codigo;
        this.infoPaciente = infoPaciente;
        this.infoMedico = infoMedico;
        this.data = data; 
        this.valor = valor;
        this.status = status;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public paciente getInfoPaciente() {
        return infoPaciente;
    }

    public void setInfoPaciente(paciente infoPaciente) {
        this.infoPaciente = infoPaciente;
    }

    public medico getInfoMedico() {
        return infoMedico;
    }

    public void setInfoMedico(medico infoMedico) {
        this.infoMedico = infoMedico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public abstract String detalhesConsulta(); 
}
