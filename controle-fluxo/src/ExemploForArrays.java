public class ExemploForArrays {
    public static void main(String[] args) {
        
        //Em arrays, o indicie de inicio é 0.
        String alunos[] = {"Guttenberg","Jonas","Felipe","Viadilson"};

        for(int contador = 0; contador < alunos.length; contador++){
            System.out.println("O aluno do indice contador = " + contador + " é " + alunos[contador]);
        }
    }
}
