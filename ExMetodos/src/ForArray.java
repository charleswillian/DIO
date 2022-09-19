public class ForArray {
    public static void ListaFor()
    {
        String alunos[] = {"Felipe","Jonas","Julia","Sato"};

        for (int x=0; x< alunos.length; x++)
        {
            System.out.println("O aluno no indice x= " + x + " é " + alunos[x]);
        }

        for (String aluno:alunos){
            System.out.println("Nome do aluno é " + aluno);
        }
    }
}
