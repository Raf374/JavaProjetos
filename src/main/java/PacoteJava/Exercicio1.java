package PacoteJava;

import javax.swing.*;

public class Exercicio1 {
    public static void main(String args[]){
        try{ 
            double salario, desconto=354.07, sd;
            int alicota = 0;
            String aux="";
        aux=JOptionPane.showInputDialog(null, "Insira o sálario","Salario",JOptionPane.INFORMATION_MESSAGE);
        aux= aux.replace(",",".");
        salario=Double.parseDouble(aux);
        
        if (salario<=965.67) {
            alicota=8;
        } 
        else if (salario>=965.67 && salario<=1609.45){
            alicota=9;
        }
        else if (salario>1609.45){
            alicota=11;
        }
        else{
            System.out.println("Número invalido");
            System.exit(0);
            };

        sd= salario-desconto;
        sd*=100;
        sd=Math.ceil(sd);
        sd/=100;
        
        
        JOptionPane.showMessageDialog(null, "O salario é="+salario+"/n"+"Alicota é "+alicota+"/n"+"O desconto é "+desconto+"/n"+"O slario com desconto é "+sd);
        
        }
        catch(NumberFormatException Ex){
            JOptionPane.showMessageDialog(null,"Favor inserir somente números","Erro",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

}