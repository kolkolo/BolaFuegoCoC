/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolafuegococ;

/**
 *
 * @author GreenDawn2 v4
 */
public class BolaFuegoCoC {

    /**
     * @param args the command line arguments
     */
    
    public int[][] casillasBolaAfectadas(int[] bolaFuego){
        int x = bolaFuego[2];
        int y = bolaFuego[3];
        
        int[][] casillasAfectadas = {
            {x - 1, y - 1, 1},{x, y - 1, 2},{x + 1, y - 1, 1},
            {x - 1, y, 2},{x, y, 4},{x + 1, y, 2},
            {x - 1, y + 1, 1},{x, y + 1, 2},{x + 1, y + 1, 1},
        };
        
        return casillasAfectadas;
    }
    
    public int[] actualizarVida(int[] personaje, int daño){
    
        personaje[1] = personaje[1] - daño;

        return personaje;
    }

    
    public boolean chequeaAtaque(int[][] piezas, int ataque){
    
        int[] ataqueActual = piezas[ataque];
        int[][] casillasAfectadas = new int[9][3];
        
        if(ataqueActual[0] == 256){
            casillasAfectadas = casillasBolaAfectadas(ataqueActual);
            for(int i = 0; i < casillasAfectadas.length; i++){
                for(int j = 0; j < piezas.length; j++){
                    //Pieza de 1 x 1
                    if(piezas[j][2] == casillasAfectadas[i][0] && piezas[j][3] == casillasAfectadas[i][1] && piezas[j][6] != 1){
                        piezas[j] = actualizarVida(piezas[j], casillasAfectadas[i][2]);
                    }
                    //Pieza mayor en X
                    if(piezas[j][2] == casillasAfectadas[i][0] && piezas[j][3] == casillasAfectadas[i][1] && piezas[j][6] != 1 && piezas[j][4] > 1){
                        for(int q = 0; q < piezas[j][4] && q <= 2; q++){
                           piezas[j] = actualizarVida(piezas[j], casillasAfectadas[i + (q * 3)][2]); 
                        }
                    }
                    //Pieza mayor en Y
                    if(piezas[j][2] == casillasAfectadas[i][0] && piezas[j][3] == casillasAfectadas[i][1] && piezas[j][6] != 1 && piezas[j][5] > 1){
                        for(int q = 0; q < piezas[j][4] && q <= 2; q++){
                           piezas[j] = actualizarVida(piezas[j], casillasAfectadas[i + q][2]); 
                        }
                    }
                }
            }
            for(int q = 0; q < piezas.length; q++){
                if(piezas[q][1] <= 0 && piezas[q][0] < 255){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
            int[][] piezas = {
            {256, 0, 5, 6, 1, 1, 0},
            {1, 5, 5, 6, 1, 1, 0},
            {2, 4, 6, 6, 1, 1, 0},
            {3, 10, 4, 5, 1, 1, 1}
            };
        BolaFuegoCoC bola1 = new BolaFuegoCoC();
        System.out.println(bola1.chequeaAtaque(piezas, 0));
        System.out.println(piezas[1][1]);
        System.out.println(piezas[2][1]);
        System.out.println(piezas[3][1]);
    }
    
}
