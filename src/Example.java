import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String[] args) {

//        for (Employees as : Employees.values()){
//            System.out.println("ID Funcionario: " + as.getFuncionarioId() +" Nome: " + as.getNome() +
//                    " Sobrenome: " + as.getSobreNome() + " Idade: " + as.getIdade() +
//                    " Funcao: " + as.getFuncao() + " Salario: " + as.getSalario() +" ID Empresa: " + as.getEmpresaId() +
//                    " Nome Empresa: " + as.getEmpresaNome() + " ID Departamento: " + as.getDepartamentoId() +
//                    " Nome Departamento: " + as.getDepartamentoNome());
//        }

        EmployeeServiceImpl employees = new EmployeeServiceImpl();
        String userA = employees.teste("teste intercace 1");
//        System.out.println(userA);
//        System.out.println(employees.teste("teste interface 2"));

        List<Employees> funcionarios = new ArrayList<>();
        for (Employees a: Employees.values()){
//            System.out.println(a);
            funcionarios.add(a);
        }

        for (Employees funcionario: funcionarios){
            System.out.println(funcionario.getNome() + " " + funcionario.getFuncionarioId());
        }
        int idFuncionario = 2;

        for (Employees funcionario: funcionarios){
            int a = funcionario.getFuncionarioId();
            System.out.println( "Verificando valores : " + a + " " + funcionario.getFuncionarioId());
            if( a == idFuncionario ) {
                System.out.println("Funcionario OK " + funcionario.getNome() + " " + funcionario.getFuncionarioId());
            } else {
                System.out.println("Funcionario com ID: " + idFuncionario + " nao existe.");
            }
        }





    }
}