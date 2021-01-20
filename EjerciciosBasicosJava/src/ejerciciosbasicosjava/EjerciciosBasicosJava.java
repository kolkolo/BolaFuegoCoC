/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosjava;

import java.util.Arrays;

/**
 *
 * @author GreenDawn2 v4
 */
public class EjerciciosBasicosJava {

    
    public boolean ardillas(int bellotas, boolean finde){
    
        if(finde){
        
            if(bellotas >= 40){
            
                return true;
                
            } else {
                
                return false;
            
            }
            
        } else{
            
            if(bellotas >= 40 && bellotas <= 60){
            
                return true;
                
            } else {
                
                return false;
            
            }
        
        }
    
    }
    
    public int multa(int velocidad, boolean cumple){
        
        int multa = 0;
    
        if(cumple == false){
        
            if (velocidad >= 86){
            
                multa = 2;
                return multa;
            
            } else if (velocidad >= 66 && velocidad <= 85){
            
                multa = 1;
                return multa;
            }
            return multa;
        
        } else {
        
            if (velocidad >= 81){
            
                multa = 2;
                return multa;
            
            } else if (velocidad >= 61 && velocidad <= 80){
            
                multa = 1;
                return multa;
            }
            return multa;
        
        
        }
        
    
    }
    
    public boolean vanidoso(int numero){
    
        int multiplo = numero % 11;
        int multiplo1 = (numero - 1) % 11;
        
        if(multiplo == 0 || multiplo1 == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean movil(boolean dormido, boolean madre, boolean mañana){
    
        if(dormido == false){
        
            if(mañana && madre){
            
                return true;
                
            } else if(mañana == false){
            
                return true;
            
            }
            
                return false;
            
        
        }
        
        return false;
    
    }
    
    public boolean diff10(int a, int b, int c){
    
        int diffAB = a - b;
        int diffAC = a - c;
        int diffBC = a - b;
        
        if(diffAB == 10 || diffAB == -10 || diffAC == 10 || diffAC == -10 || diffBC == 10 || diffBC == -10){
        
            return true;
            
        }
    
            return false;
    }
    
    public boolean digits(int a, int b){
    
           int primerDigitA = a/10;
           int segundoDigitA = a % 10;
           int primerDigitB = b/10;
           int segundoDigitB = b % 10;
           
           if(primerDigitA == primerDigitB || primerDigitA == segundoDigitB || segundoDigitA == primerDigitB || segundoDigitA == segundoDigitB){
           
               return true;
           
           }
    
               return false;
    }
    
    public boolean multiplo35(int numero){
    
        int mul5 = numero % 5;
        int mul3 = numero % 3;
        
        if(mul5 == 0 || mul3 == 0){
        
            return true;
        
        }
    
        return false;
    }
    
    public boolean multiplo20 (int numero){
        int multiplo20 = (numero + 1) % 20;
        int multiplo21 = (numero + 2) % 20;

        if(multiplo20 == 0 || multiplo21 == 0){
        
            return true;
        
        }
        
        
            return false;
    }
    
    public int loteria(int a, int b, int c){
    
        if( a == 2 && b == 2 && c == 2){
        
            return 10;
            
        }
        
        if(a == b && b == c){
        
            
            return 5;
        
        }
        
        if(a != b && a != c){
        
            return 1;
        
        }
    
        return 0;
    }
    
    public int suma(int a, int b, boolean dobles){
    
        int combi = a + b;
        
        if(dobles){
        
            if(a == b){
            
                return combi + 1;
                
            }
            
            return combi;
        
        }
    
            return combi;
    }
    
    public int[] maximos(int[] array){
        
        int largo = array.length;
        
        
        if(largo >= 2){
            
            int comparador1 = array[0];
            int comparador2 = array[0];
            
            
            for(int i = 0; i < largo; i++){

                if(array[i] > comparador1){

                    comparador1 = array[i];

                }

                if(array[i] > comparador2 && array[i] < comparador1){

                    comparador2 = array[i];

                }

            }

            int[] resultado = {comparador1, comparador2};
            
            return resultado;
        }
        
        return array;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creamos objeto basico de la clase actual
        EjerciciosBasicosJava ejercicioArdilla = new EjerciciosBasicosJava();
        EjerciciosBasicosJava ejercicioMulta = new EjerciciosBasicosJava();
        EjerciciosBasicosJava ejercicioVanidoso = new EjerciciosBasicosJava();
        EjerciciosBasicosJava ejercicioMovil = new EjerciciosBasicosJava();
        EjerciciosBasicosJava ejercicioDiff10 = new EjerciciosBasicosJava();
        EjerciciosBasicosJava ejercicioDigits = new EjerciciosBasicosJava();
        EjerciciosBasicosJava ejercicioMultiplo35 = new EjerciciosBasicosJava();
        EjerciciosBasicosJava ejercicioMultiplo20 = new EjerciciosBasicosJava();
        EjerciciosBasicosJava ejercicioLoteria = new EjerciciosBasicosJava();
        EjerciciosBasicosJava ejercicioSuma = new EjerciciosBasicosJava();
        EjerciciosBasicosJava ejercicioMaximos = new EjerciciosBasicosJava();
        
        //arrays
        
        int[] array = {40, 20, 30 ,10, 99};
        
        
       System.out.println(ejercicioArdilla.ardillas(50, false));
       System.out.println(ejercicioMulta.multa(65, false));
       System.out.println(ejercicioVanidoso.vanidoso(23));
       System.out.println(ejercicioMovil.movil(false, true, true));
       System.out.println(ejercicioDiff10.diff10(22, 13, 6));
       System.out.println(ejercicioDigits.digits(12, 23));
       System.out.println(ejercicioMultiplo35.multiplo35(10));
       System.out.println(ejercicioMultiplo20.multiplo20(38));
       System.out.println(ejercicioLoteria.loteria(1, 1, 0));
       System.out.println(ejercicioSuma.suma(4, 4, false));
       System.out.println(Arrays.toString(ejercicioMaximos.maximos(array)));
       
    }
    
}
