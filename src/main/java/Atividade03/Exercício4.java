package Atividade03;

import javax.swing.*;

public class Exercício4 {
    public static void main(String args[]){
        double altura[]=new double[10];
        double somaAltura=0;
        double media=0;
        String aux="";
                
        //inserindo a altura
        for (int i=0;i<10; i++){
            aux=JOptionPane.showInputDialog(null,"Escolha a altura:");
            aux= aux.replace(',','.');
            altura[i]=Double.parseDouble(aux);
            somaAltura=altura[i]+somaAltura;
        }
        
        //Calculando média
        media=somaAltura/10;
        
        System.out.println("A média é:"+media);
    }
}
