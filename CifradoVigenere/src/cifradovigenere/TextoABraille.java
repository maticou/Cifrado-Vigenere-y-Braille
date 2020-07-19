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
public class TextoABraille {
    ArrayList<Character> textoOriginal;    
    ArrayList<Integer> textoBrailleBinario;    

    public TextoABraille(ArrayList<Character> textoOriginal) {
        this.textoOriginal = textoOriginal; 
        this.textoBrailleBinario = new ArrayList();
        transformarABraille();
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
    
    public void transformarABraille() {
        for(int i=0; i<this.textoOriginal.size(); i++){
            if(null == this.textoOriginal.get(i)){
                
            }
            else switch (this.textoOriginal.get(i)) {
                case 'a':
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    break;
                case 'b':
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    break;
                case 'c':
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    break;
                case 'd':
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    break;
                case 'e':
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    break;
                case 'f':
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    break;
                case 'g':
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    break;
                case 'h':
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    break;
                case 'i':
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    break;
                case 'j':
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    break;
                case 'k':
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    break;
                case 'l':
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    break;
                case 'm':
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    break;
                case 'n':
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    break;
                case 'o':
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    break;
                case 'p':
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    break;
                case 'q':
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    break;
                case 'r':
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    break;
                case 's':
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    break;
                case 't':
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    break;
                case 'u':
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    break;
                case 'v':
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    break;
                case 'w':
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(1);
                    break;
                case 'x':
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    break;
                case 'y':
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    break;
                case 'z':
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(0);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    this.textoBrailleBinario.add(1);
                    break;
                default:
                    break;
            }
        }
    }
}
