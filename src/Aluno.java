public class Aluno {
    private String nome;
    private String matricula;
    private String telefone;
    private double notas;
    private int faltas;


    public Aluno(String nome, String matricula, String telefone, double notas, int faltas){
        this.nome = nome;
        this.matricula = matricula;
        this.telefone = telefone;
        this.notas = notas;
        this.faltas = faltas;
    }


    public String getNome(){
        return nome;
    };

    public String getMatricula(){
        return matricula;
    }

    public String getTelefone(){
        return telefone;
    }
    public Double getNotas(){
        return notas;
    }
    public int getFaltas(){
        return faltas;
    }
}