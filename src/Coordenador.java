public class Coordenador extends Docente {
    private String areaCoordenacao;

 public Coordenador(String nome, String cpf, String telefone, Double salario, String areaCoordenacao){
    super(nome,cpf,telefone,salario);
    this.areaCoordenacao = areaCoordenacao;
 }

 public String getAreaCoordenacao(){
    return areaCoordenacao;


 }
}