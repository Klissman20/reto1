/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int casos;
        int[] costos;
        int[] result;
        Scanner lector = new Scanner(System.in);
        System.out.print("Digite el numero de casos: ");
        casos = lector.nextInt();
        if (casos>20)
           System.out.print("Maximo 20!!!");
        else{
            costos = new int[casos*3];
            result = new int[casos];
            for(int i=0;i<casos;i++){
                System.out.println("Digite salarios caso "+(i+1));
                costos[i]=lector.nextInt();
                costos[i+1]=lector.nextInt();
                costos[i+2]=lector.nextInt();
                if ((costos[i]>costos[i+1] && costos[i]<costos[i+2]) || (costos[i]<costos[i+1] && costos[i+2]>costos[i+2])){
                    result[i]=costos[i];
                }else if ((costos[i+1]>costos[i] && costos[i+1]<costos[i+2]) || (costos[i+1]<costos[i] && costos[i+1]>costos[i+2])){
                    result[i]=costos[i+1];
                }else if ((costos[i+2]>costos[i] && costos[i+2]<costos[i+1]) || (costos[i+2]<costos[i] && costos[i+2]>costos[i+1])){
                    result[i]=costos[i+2];
                }    
            }
            for (int j=0;j<casos;j++){
                System.out.println("Caso "+(j+1)+"= "+result[j]);
            }       
        }
    }
    
}
