
public class Alunos
{
    private String nome;
    private int id;
    private double media;
    protected double nota1;
    protected double nota2;
    
    public void AddAluno (String nome){
        System.out.println("Informe o aluno:");
    }
    
    public void MudaId (){
        Id[] id1 = new id2();
        id2.mudaid("Mude a Id:");
    }
    
    public void MudaAluno (){
        Nome[] nomes = new nome();
        nomes.mudanome("Mude o nome:");
    }
    
    public double AddNotas (){
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
    }
    
    private double Media (double nota1, double nota2, double media){
        media = (nota1 + nota2)/2;
        return media;
    }
    
}
