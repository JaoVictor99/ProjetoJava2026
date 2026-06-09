public class Curso {
    private String nome;
    private Coordenador coordenador;


    public Curso(String nome, Coordenador coordenador){
        this.nome = nome;
        this.coordenador = coordenador;
    }


    public String getNome(){
        return nome;
    }

    public Coordenador getCoordenador(){
        return coordenador;

    }
}