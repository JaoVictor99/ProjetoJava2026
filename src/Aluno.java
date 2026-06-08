public class Aluno {
    private String nome;
    private String matricula;
    private String telefone;


    public Aluno(String nome, String matricula, String telefone){
        this.nome = nome;
        this.matricula = matricula;
        this.telefone = telefone;
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
}