public class Estudante extends Pessoa
{
    public Estudante(String nome, String cpf)
    {
        super(nome, cpf);
        
    }
    private String curso;
    private int matricula;
        
    public int getMatricula()
    {
        return this.matricula;
    }

    public void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }
    
    public String getCurso()
    {
        return this.curso;
    }
    
    public void setCurso(String curso)
    {
        this.curso = curso;
    }
    
    public void setNome(String nome)
    {
        super.setNome(nome);
    }
}
