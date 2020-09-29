package Atividade03;

import javax.swing.*;

public class Exercício3 {
    public static void main(String args[]){
        int numero[]=new int[10];
        int numera[]=new int[10];
        int multiplicador=0;
        int resto=0;
        String aux="";
        
        aux=JOptionPane.showInputDialog(null,"Escolha um número");
        multiplicador=Integer.parseInt(aux);
        
        for (int i=0;i<10;i++){
            numero[i]=multiplicador++;
            System.out.println(numero[i]);
        }
        
        System.out.println("Segundo vetor:");
        
        //declarando numeras[]
        for (int i=0;i<10;i++){
            
            for (int j=0;j<1;j++){
                if (numero[i]%2==0){
                    //pares
                    numera[j]=numero[i]*2;
                    System.out.println(numera[j]);
                }
                else{
                    //impar
                    numera[j]=numero[i]*3;
                    System.out.println(numera[j]);
                }
            }
        }
    }
}
