package PacoteJava;

import javax.swing.*;

public class Exercicio2 {
    public static void main(String args[]){
        try{
            double imc=0, p, a;
            String aux="";
            
            aux=JOptionPane.showInputDialog(null,"Insira o peso","Peso",JOptionPane.QUESTION_MESSAGE);
            aux= aux.replace(",",".");
            p=Double.parseDouble(aux);

            if (p<0.5){
                System.exit(0);
            }

            aux=JOptionPane.showInputDialog(null,"Insira a altura","Altura",JOptionPane.QUESTION_MESSAGE);
            aux= aux.replace(",",".");
            a=Double.parseDouble(aux);

            if (a<0.1){
                System.exit(0);
            }

            
            imc=p/(a*a);
            imc*=100;
            imc=Math.ceil(imc);
            imc/=100;
            
            if(imc<18.5){
                JOptionPane.showMessageDialog(null,"IMC: "+imc+"Excesso de magreza","Resultado",JOptionPane.INFORMATION_MESSAGE);
            }
            else if(imc<=25){
                JOptionPane.showMessageDialog(null,"IMC: "+imc+"Peso normal","Resultado",JOptionPane.INFORMATION_MESSAGE);
            }
            else if(imc<=30){
                JOptionPane.showMessageDialog(null,"IMC: "+imc+"Excesso de peso","Resultado",JOptionPane.INFORMATION_MESSAGE);
            }
            else if(imc<=35){
                JOptionPane.showMessageDialog(null,"IMC: "+imc+"Obesidade (Grau 1)","Resultado",JOptionPane.INFORMATION_MESSAGE);
            }
            else if(imc<=40){
                JOptionPane.showMessageDialog(null,"IMC: "+imc+"Obesidade (Grau 2)","Resultado",JOptionPane.INFORMATION_MESSAGE);
            }
            else if(imc>40){
                JOptionPane.showMessageDialog(null,"IMC: "+imc+"Obesidade (Grau 3)","Resultado",JOptionPane.INFORMATION_MESSAGE);
            }

            else{
            JOptionPane.showMessageDialog(null,"Algo de errado não esta certo","Erro",JOptionPane.INFORMATION_MESSAGE);
        };
            
            
        }
        catch(NumberFormatException Ex){
            JOptionPane.showMessageDialog(null,"Algo de errado não esta certo","Erro",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
}
