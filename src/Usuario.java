public class Usuario  extends Docente{

    private String login;
    private int senha;

    public Usuario(String login, int senha, String nome, String cpf, String telefone, double salario, String disciplina){
        super(nome, cpf, telefone, salario, disciplina);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin(){
        return login;
    }

    public int getSenha(){
        return senha;
    }

    
    
}


