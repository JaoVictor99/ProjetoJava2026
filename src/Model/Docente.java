package Model;
public class Docente {
    private String nome;
    private String cpf;
    private String telefone;
    private double salario;
    private String disciplina;


    public Docente(String nome, String cpf, String telefone, double salario, String disciplina){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.salario = salario;
        this.disciplina = disciplina;
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

    public String getDisciplina(){
    return disciplina;
 }



}

