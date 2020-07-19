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
public class TextoABinario {
    ArrayList<Character> textoOriginal;
    ArrayList<Integer> textoASCII;
    ArrayList<Integer> textoBinary;
    int ascii;

    public TextoABinario(ArrayList<Character> textoOriginal) {
        this.textoOriginal = textoOriginal;
        this.textoBinary = new ArrayList<>();
        transformToBinary();
    }

    public ArrayList<Character> getTextoOriginal() {
        return textoOriginal;
    }

    public void setTextoOriginal(ArrayList<Character> textoOriginal) {
        this.textoOriginal = textoOriginal;
    }

    public ArrayList<Integer> getTextoASCII() {
        return textoASCII;
    }

    public void setTextoASCII(ArrayList<Integer> textoASCII) {
        this.textoASCII = textoASCII;
    }

    public ArrayList<Integer> getTextoBinary() {
        return textoBinary;
    }

    public void setTextoBinary(ArrayList<Integer> textoBinary) {
        this.textoBinary = textoBinary;
    }     
    
    public void transformToBinary () {
        for(int i=0; i<this.textoOriginal.size();i++){
            this.ascii = this.textoOriginal.get(i);
            
            mayorOMenor(this.ascii, 128);
            mayorOMenor(this.ascii, 64);
            mayorOMenor(this.ascii, 32);
            mayorOMenor(this.ascii, 16);
            mayorOMenor(this.ascii, 8);
            mayorOMenor(this.ascii, 4);
            mayorOMenor(this.ascii, 2);
            mayorOMenor(this.ascii, 1);
            
        }        
    }
    
    public void mayorOMenor(int ascii, int numero){
        if(ascii >= numero){
            this.textoBinary.add(1);
            this.ascii = ascii - numero;
        }else{
            this.textoBinary.add(0);
        }
    }
}
