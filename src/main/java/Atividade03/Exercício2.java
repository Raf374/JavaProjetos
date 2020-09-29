package Atividade03;

import javax.swing.*;

public class Exercício2 {
    public static void main(String[] args){
        String aux="";
        //mudar numero dos vetores connforme quantidade de pessoas
        int nMulheres=0, trinta=0, castanho=0;
        int idade[]=new int[3];
        double porcentagem;
        String cabelo[]=new String[300];
        String genero[]=new String[300];

        
        
        for (int i = 0; i < 300; i++) {
            //Genero
            genero[i]=JOptionPane.showInputDialog(null,"Insira Genero nº"+i+":\n m=Masculino f=Feminino");
            
            //Contador feminino
            if(genero[i].equalsIgnoreCase("f")){
                nMulheres++;
            }
            
            //Idade
            aux=JOptionPane.showInputDialog(null,"Insira sua Idade nº"+i);
            idade[i]=Integer.parseInt(aux);

            //contador de 30 anos
            if (idade[i]>=30){
                trinta++;
            }
            
            //Cabelo
            cabelo[i]=JOptionPane.showInputDialog(null,"Isira a letra inicial da cor do seu cabelo nº"+i);
            if(cabelo[i].equalsIgnoreCase("c")){
                castanho++;
            }
        }
        
        //Porcentagem castanho
        //*trocar valor conforme numero de pessoas
        porcentagem=(trinta*100)/300;
        
        for (int i = 0; i < 300; i++) {
            System.out.println("Pessoa:"+i+" /Idade:"+idade[i]+" /Genero:"+genero[i]+" /Cabelo:"+cabelo[i]);
        }
        
        //Ressultado final
        
        System.out.println("Números de mulheres:"+nMulheres+" \nPessoas com mais de 30 anos:"+porcentagem+"% \nQuantidade cabelos castanhos:"+cabelo);           
        
    }
}
