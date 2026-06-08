public class Professor extends Docente {
    private String especialidade;

     public Professor(String nome, String cpf, String telefone, Double salario, String areaCoordenacao){
    super(nome,cpf,telefone,salario);
    this.especialidade = especialidade;
 }

 public String getEspecialidade(){
    return especialidade;
 }

}