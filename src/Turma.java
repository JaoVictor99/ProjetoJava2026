import java.util.ArrayList;

public class Turma {
    private String codigo;
    private Professor professor;
    private ArrayList<Aluno> alunos;


    public Turma(String codigo, Professor professor){
        this.codigo = codigo;
        this.professor = professor;
    }


    public String getCodigo(){
        return codigo;
    }

    public Professor getProfessor(){
        return professor;
    }
}