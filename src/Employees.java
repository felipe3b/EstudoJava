public enum Employees {

    EMPLOYEE1(1,"Felipe","Soares", 39,"Desenvolvedor",
            5000, 1111,"XPTO Tech", 2222, "TI"),
    EMPLOYEE2(2,"Isabela","Soares", 22,"Estagiaria",
                      1000, 1111,"XPTO Tech", 2222, "TI"),
    EMPLOYEE3(3,"Damaris","Baumgart",46,"Administrativa",
            10000,1111,"XPTO Tech",3333,"Financeiro");
    private final int funcionarioId;
    private final String nome;
    private final String sobreNome;
    private final int idade;
    private final String funcao;
    private final int salario;
    private final int empresaId;
    private final String empresaNome;
    private final int departamentoId;
    private final String departamentoNome;
    Employees(int funcionarioId, String nome, String sobreNome, int idade, String funcao,
              int salario, int empresaId, String empresaNome, int departamentoId, String departamentoNome) {
        this.funcionarioId = funcionarioId;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
        this.funcao = funcao;
        this.salario = salario;
        this.empresaId = empresaId;
        this.empresaNome = empresaNome;
        this.departamentoId = departamentoId;
        this.departamentoNome = departamentoNome;
    }


    public int getFuncionarioId() {
        return funcionarioId;
    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public int getIdade() {
        return idade;
    }

    public String getFuncao() {
        return funcao;
    }

    public int getSalario() {
        return salario;
    }

    public int getEmpresaId() {
        return empresaId;
    }

    public String getEmpresaNome() {
        return empresaNome;
    }

    public int getDepartamentoId() {
        return departamentoId;
    }

    public String getDepartamentoNome() {
        return departamentoNome;
    }

}



