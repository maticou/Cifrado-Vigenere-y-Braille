/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifradovigenere;

import java.io.UnsupportedEncodingException;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mati_
 */
public class CifradoVigenere {

    static public char matriz[][] = new char[26][26];
    static ArrayList<Character> listaTextoOriginal;
    static ArrayList<Character> listaClaveOriginal;
    static ArrayList<Character> listaOrdenOriginal;
    static ArrayList<Character> listaTextoCifrado;
    static ArrayList<Integer> listaTextoBinario;
    static ArrayList<Integer> listaTextoBraille;
    static ArrayList<Matriz> listaDeMatrices;
    static public ArrayList<Character> listaDeLetras;
    static public ArrayList<Character> listaDeLetras2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        while(true){
            Scanner in = new Scanner(System.in);
            System.out.println("\nElija el número de la acción a realizar: ");
            System.out.print("\n1.- Cifrar texto \n");
            System.out.print("2.- Descifrar texto \n");
            System.out.print("3.- Salir \n");
            
            listaTextoOriginal = new ArrayList<>();
            listaClaveOriginal = new ArrayList<>();
            listaOrdenOriginal = new ArrayList<>();
            listaTextoCifrado = new ArrayList<>();
            listaTextoBinario = new ArrayList();
            listaTextoBraille = new ArrayList();
            listaDeMatrices = new ArrayList();
            listaDeLetras = new ArrayList<>();
            listaDeLetras2 = new ArrayList<>();
            
            llenarLista();
            llenarLista2();
            llenarMatriz();
            //mostrarMatriz();
            
            if(in.hasNextInt()){
                int opcion = in.nextInt();  
                if(opcion>0 && opcion<4){
                   switch(opcion){
                        case 1: cifrar();
                                break;
                        case 2: descifrar();
                                break;
                        case 3: exit(0);
                                break;                               
                    } 
                    System.out.println(""); 
                }else{
                    System.out.println("\nINGRESE UN NÚMERO VÁLIDO!!!\n");
                }
            }else{
                System.out.println("\nINGRESE UN NÚMERO VÁLIDO!!!\n");
            }
        }                           
    }

    private static void llenarMatriz() {
        for(int i=0; i<26; i++){
            for(int j=0; j<26; j++){
                matriz[i][j] = listaDeLetras.get(i+j);
            }
        }
    }    

    private static void cifrar() {
        String texto = "";        
        Scanner text = new Scanner(System.in);
        System.out.println("\nIngrese la palabra a cifrar (SOLO SE PERMITEN LETRAS DEL ALFABETO INGLÉS)\n");
        if(text.hasNextLine()){
            texto = text.nextLine();
            for (char c : texto.toCharArray()) {
                if((c>64 && c<91) || (c>96 && c<123)){
                    listaTextoOriginal.add(Character.toLowerCase(c));
                }else{
                    System.out.println("\nINGRESE UNA PALABRA SOLO CON LETRAS VÁLIDAS!!!\n");
                    exit(0);
                }                
            } 
            
            String clave = "";        
            Scanner text2 = new Scanner(System.in);
            System.out.println("\nIngrese la clave para cifrar (SOLO SE PERMITEN LETRAS DEL ALFABETO INGLÉS)\n");
            if(text2.hasNextLine()){
                clave = text2.nextLine();
                for (char c : clave.toCharArray()) {
                    if((c>64 && c<91) || (c>96 && c<123)){
                        listaClaveOriginal.add(Character.toLowerCase(c));
                    }else{
                        System.out.println("\nINGRESE UNA PALABRA SOLO CON LETRAS VÁLIDAS!!!\n");
                        exit(0);
                    }                
                } 
                
                int claveSize = listaClaveOriginal.size();
                int contador = 0;
                for(int a=claveSize; a<listaTextoOriginal.size(); a++){
                    if(contador < claveSize){
                        listaClaveOriginal.add(listaClaveOriginal.get(contador));
                        contador++;
                    }else{
                        contador = 0;
                        listaClaveOriginal.add(listaClaveOriginal.get(contador));
                        contador++;
                    }
                }

                String orden = "";        
                Scanner text3 = new Scanner(System.in);
                System.out.println("\nIngrese el string de orden para cifrar (SOLO SE PERMITEN NÚMEROS DEL 0-9, SIN ESPACIOS Y EN LAS UNIDADES)\n");
                if(text3.hasNextLine()){
                    orden = text3.nextLine();
                    for (char c : orden.toCharArray()) {
                        if((c>47 && c<58)){
                            listaOrdenOriginal.add(c);
                        }else{
                            System.out.println("\nINGRESE SOLO NÚMEROS VÁLIDOS!!!\n");
                            exit(0);
                        }                
                    }                                           
                    System.out.println("");
                    int indexX = 0;
                    int indexY = 0;
                    for(int i=0; i<listaTextoOriginal.size();i++){
                        indexX = listaDeLetras2.indexOf(listaTextoOriginal.get(i));
                        indexY = listaDeLetras2.indexOf(listaClaveOriginal.get(i));
                        listaTextoCifrado.add(matriz[indexX][indexY]);
                        indexX = 0;
                        indexY = 0;
                    }
                    
                    /*mostrarLista(listaTextoOriginal, "listaTextoOriginal");
                    mostrarLista(listaClaveOriginal, "listaClaveOriginal");
                    mostrarLista(listaOrdenOriginal, "listaOrdenOriginal");
                    mostrarLista(listaTextoCifrado, "listaTextoCifrado");*/
                    
                    listaTextoBinario = new TextoABinario(listaTextoCifrado).getTextoBinary();
                    listaTextoBraille = new TextoABraille(listaTextoCifrado).getTextoBrailleBinario();
                    
                    mostrarLista(listaOrdenOriginal, "String de orden",0);
                    mostrarLista(listaTextoCifrado, "Mensaje cifrado",0);
                    mostrarLista(listaTextoBinario, "Mensaje cifrado en binario",1);
                    mostrarLista(listaTextoBraille, "Mensaje Braille en binario",0);
                    
                    int ciclos = listaTextoBraille.size()/6;
                    
                    for(int b=0; b<ciclos; b++){
                        ArrayList<Integer> miniLista = new ArrayList();
                        miniLista.add(listaTextoBraille.get((b*6)+0));
                        miniLista.add(listaTextoBraille.get((b*6)+1));
                        miniLista.add(listaTextoBraille.get((b*6)+2));
                        miniLista.add(listaTextoBraille.get((b*6)+3));
                        miniLista.add(listaTextoBraille.get((b*6)+4));
                        miniLista.add(listaTextoBraille.get((b*6)+5));
                        listaDeMatrices.add(new Matriz(miniLista));
                    }
                    
                    System.out.println(""); 
                    for(int d=0; d<listaDeMatrices.size(); d++){
                        listaDeMatrices.get(d).imprimirMatriz();
                        System.out.println("");
                    }
                    
                    
                }else{
                    System.out.println("\nINGRESE UNA PALABRA VÁLIDA!!!\n");
                } 
            }else{
                System.out.println("\nINGRESE UNA PALABRA VÁLIDA!!!\n");
            }   
        }else{
            System.out.println("\nINGRESE UNA PALABRA VÁLIDA!!!\n");
        }                                               
    }

    private static void descifrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        
    private static void llenarLista() {
        for(int i=0; i<2; i++){
            listaDeLetras.add('a');listaDeLetras.add('b');listaDeLetras.add('c');
            listaDeLetras.add('d');listaDeLetras.add('e');listaDeLetras.add('f');
            listaDeLetras.add('g');listaDeLetras.add('h');listaDeLetras.add('i');
            listaDeLetras.add('j');listaDeLetras.add('k');listaDeLetras.add('l');
            listaDeLetras.add('m');listaDeLetras.add('n');
            listaDeLetras.add('o');listaDeLetras.add('p');listaDeLetras.add('q');
            listaDeLetras.add('r');listaDeLetras.add('s');listaDeLetras.add('t');
            listaDeLetras.add('u');listaDeLetras.add('v');listaDeLetras.add('w');
            listaDeLetras.add('x');listaDeLetras.add('y');listaDeLetras.add('z');
        }
    }
    
    private static void llenarLista2() {
        listaDeLetras2.add('a');listaDeLetras2.add('b');listaDeLetras2.add('c');
        listaDeLetras2.add('d');listaDeLetras2.add('e');listaDeLetras2.add('f');
        listaDeLetras2.add('g');listaDeLetras2.add('h');listaDeLetras2.add('i');
        listaDeLetras2.add('j');listaDeLetras2.add('k');listaDeLetras2.add('l');
        listaDeLetras2.add('m');listaDeLetras2.add('n');
        listaDeLetras2.add('o');listaDeLetras2.add('p');listaDeLetras2.add('q');
        listaDeLetras2.add('r');listaDeLetras2.add('s');listaDeLetras2.add('t');
        listaDeLetras2.add('u');listaDeLetras2.add('v');listaDeLetras2.add('w');
        listaDeLetras2.add('x');listaDeLetras2.add('y');listaDeLetras2.add('z');
    }
    
    private static void mostrarMatriz() {
        for(int i=0; i<26; i++){
            for(int j=0; j<26; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private static void mostrarLista(ArrayList lista, String nombre, int bandera) {
        if(bandera == 1){
            System.out.print(nombre+": ");
            int contador = 0;
            for(int i=0; i<lista.size(); i++){
                if(contador == listaTextoOriginal.size()){
                    System.out.print(" ");
                    contador = 0;
                }
                System.out.print(lista.get(i));
                contador++;
            }
            System.out.println("");
        }else{
            System.out.print(nombre+": ");
            for(int i=0; i<lista.size(); i++){
                System.out.print(lista.get(i));
            }
            System.out.println("");
        }        
    }  
}
