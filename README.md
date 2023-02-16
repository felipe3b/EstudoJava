# 17/02 -> Bate papo retorno de 30 dias																									
Site para construir uma carreira futura como um verdadeiro Eng. de Software																									
- https://roadmap.sh/computer-science/																									
- https://github.com/jwasham/coding-interview-university																									
* Obs: Utilizar mais o roadmap.sh, porém o do github também é muito bom!																									
Meta de 30 dias:																									
Se debruçar nos tópicos (roadmap.sh):																									
- Data Strucutres																									
- Array																									
- LinkedList																									
- HashTable																									
- Asymptotic Notation																									
- E todos os três big-o's		

***Hands on:***																									
* Escrever códigos em java																									
																									
* Eu quero que você escreva um algoritmo de busca com o seguinte data-set 														
HashTable (Criar v):																									
```bash
{																									
"nome": "Mock name",																									
"sobrenome": "Mock name",																									
"idade": 99,																									
"funcao": "mock data",																									
"salario": 999999,																									
"empresa_id" 9999,																									
"empresa_nome": "mock data",																									
"departamento_id": 9687,																									
"departamento_nome": "mock data"																									
}		
```
																							
- Eu quero você leia eles em memória																									
- O Nome da empresa é XPTO Tech																									
- Ela tem o orçamento maximo de folha em 10 milhões / ano																									
																									
																									
- E eu quero que você implemente a seguinte interface		

```Java
public interface EmployeeService {
														
//Retorna um funcionario pelo numero da matricula																									
																								
Employee getEmployeeById(int employeeId);																									
																					
//Retorna uma lista de funcionários, podendo ser ordenados por uma das opções:																									
//- Idade																									
//- Salario																									
//- FUncao																									
//- Nome																									
//- Departamento																									
																								
List<Employee> getEmployeeByDepartment(<Ao seu critério>, Sorting order);																									
																								
//Retorna um MAPA contendo os funcionários agrupados por departamento e estando ordenados por salario																									
																								
Map<String, Employee> getEmployeeByDepartments();																									
																								
//Da aumento para um funcionario baseado em porcentagem																									
																									
void addRaise(int employeeId, double percentage);																									
}
```														
																									
- Na sua classe que implementa, eu quero que você crie um método que dê um dissidio para TODOS os funcionários
- Caso ele não consiga, ele deve retornar uma excessão falando que não orçamento para																									
- Esse método deve sempre retornar quanto de orçamento restou																									
