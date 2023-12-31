public class Employee {
    // Atributos
    private String nome;
    private String sobrenome;
    private double salario;

    // Método construtor
    public Employee (String nome, String sobrenome, double salario) {
	this.nome = nome;
	this.sobrenome = sobrenome;
	if (salario > 0.0) {
	    this.salario = salario;
	}
    }

    // Métodos getters e setters
    public String getNome() {
	return nome;
    }

    public void setNome (String nome) {
	this.nome = nome;
    }

    public String getSobrenome () {
	return sobrenome;
    }

    public void setSobrenome (String sobrenome) {
	this.sobrenome = sobrenome;
    }

    public double getSalario () {
	return salario;
    }

    public void setSalario (double salario) {
	this.salario = salario;
    }
}