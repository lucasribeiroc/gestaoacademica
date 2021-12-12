package medias;
import javax.swing.*;
public class Media {
    public static void main (String args []){             
          double mediaSemestral  = 0; 
          double contAprovados = 0; 
          double contReprovados = 0;
          double contAF = 0;
          double contMaior = 0;
          double contMenor = 0;
          double mediaPrimeiroBimestre = 0.0;
          double mediaSegundoBimestre = 0.0;
          double mediaGeral = 0.0;
          double n1b1, n2b1, n3b1, n1b2, n2b2, n3b2;
          double maiorMedia = 0;
          double menorMedia = 10;
          double soma = 0;
          
          
          for(int i = 0; i < 3; i++){         
             String notaProva = JOptionPane.showInputDialog ((i+1)+"º Aluno - Digite a nota da prova do 1º Bimestre");
             n1b1 = Double.parseDouble(notaProva);
                     
             String notaProjeto = JOptionPane.showInputDialog((i+1)+"º Aluno - Digite a nota do projeto do 1º Bimestre"); 
             n2b1 = Double.parseDouble(notaProjeto); 
             
             String notaListaExercicios = JOptionPane.showInputDialog((i+1)+"º Aluno - Digite a nota da lista de exercícios do 1º Bimestre"); 
             n3b1 = Double.parseDouble(notaListaExercicios); 
             
             String notaProva2 = JOptionPane.showInputDialog((i+1)+"º Aluno - Digite a nota da prova do 2º Bimestre"); 
             n1b2 = Double.parseDouble(notaProva2); 
             
             String notaProjeto2 = JOptionPane.showInputDialog((i+1)+"º Aluno - Digite a nota do projeto do 2º Bimestre"); 
             n2b2 = Double.parseDouble(notaProjeto2); 
             
             String notaListaExercicios2 = JOptionPane.showInputDialog((i+1)+"º Aluno - Digite a nota da lista de exercícios do 2º Bimestre"); 
             n3b2 = Double.parseDouble(notaListaExercicios2); 
             
             
             mediaPrimeiroBimestre = ((n1b1 * 5) + (n2b1 * 3) + (n3b1 * 2)) / 10;
             mediaSegundoBimestre = ((n1b2 * 5) + (n2b2 * 3) + (n3b2 * 2)) / 10;
             mediaSemestral = (mediaPrimeiroBimestre + mediaSegundoBimestre) / 2;
             mediaGeral = (mediaPrimeiroBimestre + mediaSegundoBimestre) / 3 ;
             

             if(mediaSemestral >= 8){
                System.out.printf("Aluno nº" +(i+1)+ "%nSua média semestral é: %.1f %nVocê está aprovado!%n%n", (mediaSemestral));  
                contReprovados++;                     
             }
              else  
                if(mediaSemestral >= 5){
                    System.out.printf("Aluno nº" +(i+1)+ "%nSua média semestral é: %.1f %nVocê está de AF%n%n", (mediaSemestral));  
                   contAF++;
                }
              else  
                   if(mediaSemestral < 5){ 
                       System.out.printf("Aluno nº" +(i+1)+ "%nSua média semestral é: %.1f %nVocê está reprovado!%n%n", (mediaSemestral)); 
                      contAprovados++;  
                   }  
             
             if ( mediaSemestral > maiorMedia ) {
                 maiorMedia = mediaSemestral;       
                 ++contMaior;
                 
              }
             
              if(mediaSemestral < menorMedia){
              	menorMedia = mediaSemestral;
              	++contMenor;
              	
              }
             
             
          }
          System.out.println("\nAlunos aprovados: " +contAprovados); 
          System.out.println("Alunos em AF: " +contAF); 
          System.out.println("Alunos reprovados: " +contReprovados);
          System.out.printf("\nMédia geral da turma: %.1f", (mediaGeral));
          System.out.printf("\nMaior média da turma: %.1f", (maiorMedia));
          System.out.printf("\nMenor média da turma: %.1f", (menorMedia));
    }
}