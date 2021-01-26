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
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        JavaApplication5 pruebas = new JavaApplication5();
        
        System.out.println(pruebas.palindromo("ACASO HUBO BUHOS ACA"));
        System.out.println(pruebas.isograma("qwertyuiop"));
    }
    
}
