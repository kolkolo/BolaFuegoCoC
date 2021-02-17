/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Arrays;

/**
 *
 * @author GreenDawn2 v4
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    
    
    public boolean palindromo(String str){
     
        String auxiliar = "";
        
        int largo = str.length();
        char vacio = ' ';
        
        for (int i = 0; i < largo; i++){
        
            if(str.charAt(i) == vacio){
            
                
            
            } else {
            
                auxiliar = auxiliar + str.charAt(i);
            
            }
        
        }
        
        int largoAux = auxiliar.length();
        int x = largoAux - 1;
        int mitad = largoAux/2;
        int comprobador = 0;
        
        for(int i = 0; i < mitad; i++){
        
            if(auxiliar.charAt(i) == auxiliar.charAt(x)){
            
                comprobador = comprobador + 1;
                x = x - 1;
                
            } else {
            
                return false;

            }
        
        }
        
        if(comprobador == mitad){
        
            return true;
        
        } else {
        
            return false;
        
        }
    }
    
    
    public boolean isograma(String str){
    
        int largo = str.length();
        int indexMax = largo - 1;
        
        for (int i = 0; i < largo; i ++){
        
                    for (int x = indexMax; x > i;x --){
        
                        if(str.charAt(i) == str.charAt(x)){
                            
                            return false;
                            
                        }
        
                    }
        
        }
        
        
        return true;
    }
    
    public String primeraLetra(String str){
        
        //char letraPrimera = ' ';
        //int dondeMirar = 0;
        
         //if(str.charAt(dondeMirar) == ' '){
         
            // dondeMirar = 1;
         
         //} else if (str.charAt(dondeMirar) == 'y' && str.charAt(dondeMirar + 1) == ' '|| str.charAt(dondeMirar) == 'e' && str.charAt(dondeMirar + 1) == ' '|| str.charAt(dondeMirar) == 'd' && str.charAt(dondeMirar + 1) == 'e' && str.charAt(dondeMirar + 2) == ' '|| str.charAt(dondeMirar) == 'l' && str.charAt(dondeMirar + 1) == 'a' && str.charAt(dondeMirar + 2) == 's' && str.charAt(dondeMirar + 3) == ' '|| str.charAt(dondeMirar) != 'l' && str.charAt(dondeMirar + 1) != 'a' && str.charAt(dondeMirar + 2) == ' '){
         
           //  return "";
         
         ///} else {
         
            // letraPrimera = str.charAt(dondeMirar);
             
         //}
        
        //String resultado = Character.toString(letraPrimera);
        //return resultado;
        
        String strNoSpaces = str.replaceAll(" ", "");
        
        if(strNoSpaces.equals("de") || strNoSpaces.equals("la") || strNoSpaces.equals("las") || strNoSpaces.equals("y") || strNoSpaces.equals("e")){
        
            return "";
            
        }
        
        String primLet = strNoSpaces.substring(0, 1);
        return primLet;
    }
    
    public String acronimo(String str){
    
        String[] palabras = str.split(" ");
        String resultado = "";
        int largoPalabras = palabras.length;
        
        for(int i = 0; i < largoPalabras; i ++){
                  
                resultado = resultado + primeraLetra(palabras[i]);  
        
        }
        
        
        
        return resultado;
    }
    
    public boolean escaleraPalabras(char[][] array){
        
        int largoTotal = array.length;
        int letrasDistintas = 0;
        
        for(int i = 0; i <= largoTotal - 2; i++){
            //Si el largo de las palabras es distinto, no pueden ser cascada
            //if(array[i].length != array[i + 1].length ){
              //  return false; 
            //}
            //Compramaos las letras
            for(int y = 0; y <= array[i].length - 1; y++){
            
                if(array[i][y] == array[i + 1][y]){
                
                } else {
                
                    letrasDistintas++;
                
                }
                
            
            }
            
        
        }
        
        if(letrasDistintas == array.length - 1){
        
            return true;
            
        }
        
        
        return false;
    }
    
    public int costeErroresADN(String uno, String dos){
        int largo = uno.length();
        char A = 'A';
        char T = 'T';
        char C = 'C';
        char G = 'G';
        char guion = '-';
        int coste = 0;
        
        for(int i = 0; i < largo; i++){
        
            if(uno.charAt(i) == guion || dos.charAt(i) == guion){
            
                coste = coste + 2;
                
            }
            if(uno.charAt(i) == A && dos.charAt(i) != T){
            
                coste = coste + 1;
            
            }
            if(uno.charAt(i) == T && dos.charAt(i) != A){
            
                coste = coste + 1;
            
            }
            if(uno.charAt(i) == C && dos.charAt(i) != G){
            
                coste = coste + 1;
            
            }
            if(uno.charAt(i) == G && dos.charAt(i) != C){
            
                coste = coste + 1;
            
            }
            
                coste = coste;
        
        }
        
        
        return coste;
    }
    
    public boolean checkCurrentSpace(boolean[][] camion, int x, int y, int anchoCaja, int altoCaja){
        
        int vecesCorrectas = 0;
        int vecesNecesarias = anchoCaja * altoCaja;
        
        for(int horizontal = 0; horizontal < anchoCaja; horizontal++){
            for(int vertical = 0; vertical < altoCaja; vertical++){
                if(!camion[x + horizontal][y + vertical]){
                    vecesCorrectas = vecesCorrectas + 1;
                } else {
                    return false;
                }
            }
        } 
        
        if(vecesCorrectas == vecesNecesarias){
            return true;
        } 
        
        return false;
    }
    
    public boolean checkIfBoxFits(boolean[][] camion, int anchoCaja, int altoCaja){
        int anchoCamion = camion[0].length;
        int altoCamion = camion.length;
        
        for(int y = 0; y < altoCamion; y++){
            for(int x = 0; x < anchoCamion; x++){
                if(!camion[y][x]){
                    boolean cabeAqui = checkCurrentSpace(camion, x, y, anchoCaja, altoCaja);
                    if(cabeAqui){
                        return true;
                    }
                }
            }
        }
    
    
        return false;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean[][] camion = {  {true, true, true, false, false, true, true, true},
                                {true, true, true, false, false, true, true, true},
                                {true, true, true, false, false, true, true, true},
                                {true, true, true, true, true, true, false, true},
                                {true, true, true, true, true, true, false, true}};
        
        JavaApplication5 pruebas = new JavaApplication5();
        char [][] listaPalabras = {{'P', 'A', 'T', 'A'},{'P', 'A', 'T', 'O'},{'P', 'A', 'T', 'O'},{'R', 'A', 'M', 'O'},{'G', 'A', 'M', 'O'},{'G', 'A', 'T', 'O'},{'M', 'A', 'T', 'O'},};
        System.out.println(pruebas.palindromo("ACASO HUBO BUHOS ACA"));
        System.out.println(pruebas.isograma("qwertyuiop"));
        System.out.println(pruebas.acronimo("Asociacion de Padres de Alumnos y Profesores"));
        System.out.println(pruebas.escaleraPalabras(listaPalabras));
        System.out.println(pruebas.costeErroresADN("AA-C","TTTG"));
        System.out.println(pruebas.checkIfBoxFits(camion, 2, 2));
    }
    
}
