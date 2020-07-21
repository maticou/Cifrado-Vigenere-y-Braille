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
public class BrailleATexto {
    ArrayList<Character> textoOriginal;    
    ArrayList<Integer> textoBrailleBinario;

    public BrailleATexto(ArrayList<Integer> textoBrailleBinario) {
        this.textoOriginal = new ArrayList();
        this.textoBrailleBinario = textoBrailleBinario;
        transformarATexto();
    }

    public ArrayList<Character> getTextoOriginal() {
        return textoOriginal;
    }

    public void setTextoOriginal(ArrayList<Character> textoOriginal) {
        this.textoOriginal = textoOriginal;
    }

    public ArrayList<Integer> getTextoBrailleBinario() {
        return textoBrailleBinario;
    }

    public void setTextoBrailleBinario(ArrayList<Integer> textoBrailleBinario) {
        this.textoBrailleBinario = textoBrailleBinario;
    }        

    private void transformarATexto() {
        for(int i=0; i<this.textoBrailleBinario.size();){
            ArrayList<Integer> miniLista = new ArrayList();
            miniLista.add(this.textoBrailleBinario.get(i+0));
            miniLista.add(this.textoBrailleBinario.get(i+1));
            miniLista.add(this.textoBrailleBinario.get(i+2));
            miniLista.add(this.textoBrailleBinario.get(i+3));
            miniLista.add(this.textoBrailleBinario.get(i+4));
            miniLista.add(this.textoBrailleBinario.get(i+5));
            
            String letra = "";
            for(int j=0; j<miniLista.size(); j++){
                letra += miniLista.get(j);                
            }
            comprobar(letra);
            i += 6;            
        }
    }

    private void comprobar(String letra) {
        if(null == letra){
            
        }
        else switch (letra) {
            case "100000":
                this.textoOriginal.add('a');
                break;
            case "101000":
                this.textoOriginal.add('b');
                break;
            case "110000":
                this.textoOriginal.add('c');
                break;
            case "110100":
                this.textoOriginal.add('d');
                break;
            case "100100":
                this.textoOriginal.add('e');
                break;
            case "111000":
                this.textoOriginal.add('f');
                break;
            case "111100":
                this.textoOriginal.add('g');
                break;
            case "101100":
                this.textoOriginal.add('h');
                break;
            case "011000":
                this.textoOriginal.add('i');
                break;
            case "011100":
                this.textoOriginal.add('j');
                break;
            case "100010":
                this.textoOriginal.add('k');
                break;
            case "101010":
                this.textoOriginal.add('l');
                break;
            case "110010":
                this.textoOriginal.add('m');
                break;
            case "110110":
                this.textoOriginal.add('n');
                break;
            case "100110":
                this.textoOriginal.add('o');
                break;
            case "111010":
                this.textoOriginal.add('p');
                break;
            case "111110":
                this.textoOriginal.add('q');
                break;
            case "101110":
                this.textoOriginal.add('r');
                break;
            case "011010":
                this.textoOriginal.add('s');
                break;
            case "011110":
                this.textoOriginal.add('t');
                break;
            case "100011":
                this.textoOriginal.add('u');
                break;
            case "101011":
                this.textoOriginal.add('v');
                break;
            case "011101":
                this.textoOriginal.add('w');
                break;
            case "110011":
                this.textoOriginal.add('x');
                break;
            case "110111":
                this.textoOriginal.add('y');
                break;
            case "100111":
                this.textoOriginal.add('z');
                break;
            default:
                break;
        }
    } 
}
