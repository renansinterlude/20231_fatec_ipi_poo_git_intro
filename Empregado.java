public class Empregado {
    //variavel de instancia (objeto). cada objeto tem sua propria copia
    private String nome; // encapsulou variavel nome, outras classes nao conseguem acessar ela, apenas Empregado
    private int tipo; // representar tipos com variaveis // polimorfismo dinamico
    private int idade;
    private double salario;
    private double comissao;
    private double bonus;

    public double calcularSalario(){
        if (tipo == 0) 
            return salario;
        if (tipo == 1)
            return salario + salario * comissao;
        if (tipo == 2)
            return salario + bonus;
        return 0;
    }

    public String getNome(){
        return nome;
    }
    // metodo nao usa kamelcase

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

}