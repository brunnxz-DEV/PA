import javax.swing.JOptionPane;

public class aluno {
    private int matricula;
    private String nome;
    private int idade;
    private curso curso;

    //Construtor

    public aluno(int matricula, String nome, int idade, int codigo, String nomeCurso, int duracao){
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.setCurso(codigo, nomeCurso, duracao);
    }

    //Métodos

    public void exibirDados(){
        JOptionPane.showMessageDialog(null, "Aluno" +
                "\nMatricula: "+this.getMatricula() +
                "\nNome: "+this.getNome() +
                "\nIdade "+this.getIdade() +
                "\n\nCurso"+
                "\nCódigo: "+this.curso.getCodigo()+
                "\nNome do curso: "+this.curso.getNome()+
                "\nDuração: "+this.curso.getDuracao()+ "anos");

    }

    //Métodos acessores


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCurso(int c, String nc, int d) {
        this.curso = new curso(c,nc,d);
    }
}
