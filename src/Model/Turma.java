package Model;
import java.util.ArrayList;

public class Turma {
    private String codigo;
    private Docente docente;
    private ArrayList<Aluno> alunos;


    public Turma(String codigo, Docente docente){
        this.codigo = codigo;
        this.docente = docente;
    }


    public String getCodigo(){
        return codigo;
    }

    public Docente getProfessor(){
        return docente;
    }

   
}