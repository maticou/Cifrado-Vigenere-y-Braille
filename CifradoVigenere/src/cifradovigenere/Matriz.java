/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifradovigenere;

import java.util.ArrayList;

/**
 *
 * @author mati_
 */
public class Matriz {
    ArrayList<Integer> textoBrailleBinario; 
    int matriz [][];

    public Matriz(ArrayList<Integer> textoBrailleBinario) {
        this.matriz = new int [3][2];
        this.textoBrailleBinario = textoBrailleBinario;
        construirMatriz();
    }        

    public ArrayList<Integer> getTextoBrailleBinario() {
        return textoBrailleBinario;
    }

    public void setTextoBrailleBinario(ArrayList<Integer> textoBrailleBinario) {
        this.textoBrailleBinario = textoBrailleBinario;
    }

    public int[][] getMatriz() {
        return matriz;
    }
    
    public int getValorMatriz(int i, int j) {
        return this.matriz[i][j];
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }        

    private void construirMatriz() {
        for(int i=0; i<this.textoBrailleBinario.size(); i++){
            if(this.textoBrailleBinario.get(i) == 1){
                switch (i) {
                    case 0:
                        this.matriz[0][0] = this.textoBrailleBinario.get(i);
                        break;
                    case 1:
                        this.matriz[0][1] = this.textoBrailleBinario.get(i);
                        break;
                    case 2:
                        this.matriz[1][0] = this.textoBrailleBinario.get(i);
                        break;
                    case 3:
                        this.matriz[1][1] = this.textoBrailleBinario.get(i);
                        break;
                    case 4:
                        this.matriz[2][0] = this.textoBrailleBinario.get(i);
                        break;
                    case 5:
                        this.matriz[2][1] = this.textoBrailleBinario.get(i);
                        break;
                    default:
                        break;
                }
            }else{
                switch (i) {
                    case 0:
                        this.matriz[0][0] = this.textoBrailleBinario.get(i);
                        break;
                    case 1:
                        this.matriz[0][1] = this.textoBrailleBinario.get(i);
                        break;
                    case 2:
                        this.matriz[1][0] = this.textoBrailleBinario.get(i);
                        break;
                    case 3:
                        this.matriz[1][1] = this.textoBrailleBinario.get(i);
                        break;
                    case 4:
                        this.matriz[2][0] = this.textoBrailleBinario.get(i);
                        break;
                    case 5:
                        this.matriz[2][1] = this.textoBrailleBinario.get(i);
                        break;
                    default:
                        break;
                }
            }
        }  
    }
    
    public void imprimirMatriz(){        
        for(int i=0; i<3; i++){
            for(int k=0; k<2; k++){
                if(this.matriz[i][k] == 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                                
            }
            System.out.println(""); 
        }
    }
}
