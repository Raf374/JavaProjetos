package Atividade03;

import javax.swing.*;

public class Exercício1 {
   public static void main(String[] args) {
        String aux="";
        double alturaMedia=0.0, menorAltura=10000.0, maiorAltura=0;
        int velho=0, nova=1000, nMulheres=0;
        //mudar numero dos vetores connforme quantidade de pessoas
        double altura[]=new double[50];
        int idade[]=new int[50];
        String genero[]=new String[50];
        
        
        for (int i = 0; i < 3; i++) {
            //Genero
            genero[i]=JOptionPane.showInputDialog(null,"Insira Genero nº"+i+":\n m=Masculino f=Feminino");
            
            //Contador feminino
            if(genero[i].equalsIgnoreCase("f")){
                nMulheres++;
            }
            
            //Altura
            aux=JOptionPane.showInputDialog(null,"Insira sua Altura nº"+i);
            aux=aux.replace(",",".");
            altura[i]=Double.parseDouble(aux);
            
            //somando altura para media feminino
            if (genero[i].equalsIgnoreCase("f")){
                alturaMedia=alturaMedia+altura[i];
            }
            
                        
            //definindo alturas
            //maior
            if (altura[i]>maiorAltura){
                maiorAltura=altura[i];  
                    }
            //mennor
            if (altura[i]<menorAltura){
                menorAltura=altura[i];
            }
            
            //Idade
            aux=JOptionPane.showInputDialog(null,"Insira sua Idade nº"+i);
            idade[i]=Integer.parseInt(aux);

           //idade homem mais velho
           if (genero[i].equalsIgnoreCase("m")){
               if (idade[i]>velho){
                   velho=idade[i];
               }
           }
            
           //mulher mais nova
           if (genero[i].equalsIgnoreCase("f")){
               if (idade[i]<nova){
                   nova=idade[i];
               }
           }
         
        //media feminino
        alturaMedia=alturaMedia/nMulheres;

            
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Pessoa: "+i+"Altura: "+altura[i]+"/Idade: "+idade[i]+"/Genero: "+genero[i]+"\n");
        }
        
        //media altura feminino
        
        System.out.println("Maior altura: "+maiorAltura+"\nMenor altura: "+menorAltura+"\nMedia Altura mulher: "+alturaMedia+
                "\nHomen  mais vcelho: "+velho+"\nMulher mais nova: "+nova);
    }
}
