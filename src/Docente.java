public class Docente {
    private String nome;
    private String cpf;
    private String telefone;
    private double salario;

    public Docente(String nome, String cpf, String telefone, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.salario = salario;
    };

    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getTelefone(){
        return telefone;
    }
    public double getSalario(){
        return salario;
    }



}

