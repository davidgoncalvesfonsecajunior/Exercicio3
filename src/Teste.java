
public class Teste {
    public static void main (String[] args){
          //alunosIF
          AlunoIF A1 = new AlunoIF();
             A1.nome = "David Goncalves";
             A1.curso = "Sistemas de Informacao";
             A1.periodo = 4 ;
                          
          AlunoIF A2 = new AlunoIF();
             A2.nome = "Lucas Cardoso";
             A2.curso = "Sistemas de Informacao";
             A2.periodo = 4 ;
                          
          AlunoIF A3 = new AlunoIF();
             A3.nome = "John Herbert";
             A3.curso = "Sistemas de Informacao";
             A3.periodo = 4 ;
                          
           //Matriculas  
          Matricula M1 = new Matricula();
             M1.campus= "Pirapora";  
             M1.curso = "Sistemas de Informacao";
             M1.aluno = "David Goncalves";
             M1.periodo = 4 ; 
             M1.matricula= 123;
             
          Matricula M2 = new Matricula();
             M2.campus= "Pirapora";  
             M2.curso = "Sistemas de Informacao";
             M2.aluno = "Lucas Cardoso";
             M2.periodo = 4 ;
             M2.matricula= 124;
             
          Matricula M3 = new Matricula();
             M3.campus= "Pirapora";  
             M3.curso = "Sistemas de Informacao";
             M3.aluno = "John Herbert";
             M3.periodo = 4 ;
             M3.matricula= 125;
             
           //Contatos    
           Contato C1 = new Contato();             
             C1.nome = "David Goncalves";
             C1.telefone = "(38)9 8835-2117" ;
             C1.email = "dgfj@aluno.ifnmg.edu.br"; 
             
           Contato C2 = new Contato();             
             C2.nome = "Lucas Cardoso";
             C2.telefone = "(38)9 91420-6333" ;
             C2.email = "lucascardoso701@outlook.com";
             
          Contato C3 = new Contato();             
             C3.nome = "John Herbert";
             C3.telefone = "(38)9 9214-8871" ;
             C3.email = "john.bds@gmail.com";
             
            
          System.out.println("Lista de Alunos Selecionados:  "); 
          
          System.out.println(A1.nome+", telefone: "+ C1.telefone +", Email: "
             + C1.email + ", Curso: " + A1.curso +", matricula: "+ M1.matricula); 
          
          System.out.println(A2.nome+", telefone: "+ C2.telefone +", Email: "
             + C2.email + ", Curso: " + A2.curso +" matricula: "+ M2.matricula);
           
          System.out.println(A3.nome+", telefone: "+ C3.telefone +", Email: "
             + C3.email + ", Curso: " + A3.curso +", matricula: "+ M3.matricula);
     }
}
