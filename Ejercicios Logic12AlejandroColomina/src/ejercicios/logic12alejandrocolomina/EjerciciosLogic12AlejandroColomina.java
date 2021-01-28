/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.logic12alejandrocolomina;

/**
 *
 * @author GreenDawn2 v4
 */
public class EjerciciosLogic12AlejandroColomina {

    
    
    //Logic 1 ejercicios
    
    //Ejercicio 1.1
    
    public boolean cigarParty(int cigars, boolean isWeekend) {

        if (isWeekend && cigars >= 40){

            return true;

        }
        if (cigars >= 40 && cigars <= 60){

            return true;

        } 

            return false;

      }
    
    //Ejercicio 1.2
    
    public int dateFashion(int you, int date) {
  
  
        if(you >= 8 || date >= 8){

          if(you <= 2 || date <= 2){

            return 0;

          } else {

            return 2;

          }

        } else {

           if(you <= 2 || date <= 2){

            return 0;

          } else {

            return 1;

          }

        }
     }
    
    //Ejercicio 1.3
    
    public boolean squirrelPlay(int temp, boolean isSummer) {

        if(isSummer == true){

          if(temp >= 60 && temp <= 100){

            return true;

          } else {

            return false;

          }

        } else {

          if(temp >= 60 && temp <= 90){

            return true;

          } else {

            return false;

          }

        }

      }
    
    //Ejercicio 1.4
    
    public int caughtSpeeding(int speed, boolean isBirthday) {
  
        int minTick = 61;
        int minBigTick = 81;

        if(isBirthday == false){

          if(speed < minTick){

            return 0;

          } else if (speed >= minTick && speed <= minBigTick){

            return 1;

          } else {

            return 2;

          }

        } else {

          if(speed < minTick + 5){

            return 0;

          } else if (speed >= minTick + 5 && speed <= minBigTick + 5){

            return 1;

          } else {

            return 2;

          }

    }

  
}

    //Ejercicio 1.5
    
    public int sortaSum(int a, int b) {
  
        int sum = a + b;

        if(sum >= 10 && sum <= 19){

          return 20;

        } else {

          return sum;

        }
    }

    //Ejercicio 1.6
    
    public String alarmClock(int day, boolean vacation) {
  
        if(vacation == true){

          if(day >= 1 && day <= 5){

            return "10:00";

          } else {

            return "off";

          }


        } else {

          if(day >= 1 && day <= 5){

            return "7:00";

          } else {

            return "10:00";

          }

        }

    }

    //Ejercicio 1.7
    
    public boolean love6(int a, int b) {

        int sum = a + b;
        int rest = Math.abs(a - b);

        if (a == 6 || b == 6 || sum == 6 || rest == 6){

          return true;

        } else {

          return false;

        }

    }
    
    //Ejercicio 1.8
    
    public boolean in1To10(int n, boolean outsideMode) {
  
        if (outsideMode == true){

          if(n <= 1 || n >= 10){

            return true;

          } else {

            return false;

          }

        } else {

          if(n >= 1 && n <= 10){

            return true;

          } else {

            return false;

          }

        }


    }
    
    //Ejercicio 1.9
    
    public boolean specialEleven(int n) {
  
        int res = n % 11;
        int resMen = (n - 1) % 11;

        if(res == 0 || resMen == 0){

          return true;

        } else {

          return false;

        }

    }

    //Ejercicio1.10
    
    public boolean more20(int n) {
  
        int menosUno = (n % 20) - 1;
        int menosDos = (n % 20) - 2;

        if(menosUno == 0 || menosDos == 0){

          return true;

        } else {

          return false;

        }

    }

    //Ejercicio 1.11
    
    public boolean old35(int n) {
  
        int mTres = n % 3;
        int mCinco = n % 5;

        if(mTres == 0 || mCinco == 0){

          if(mTres == 0 && mCinco == 0){

            return false;

          } else {

            return true;

          }


        } else {

          return false;

        }


    }
    
    //Ejercicio 1.12
    
    public boolean less20(int n) {
  
        int menosUno = (n + 1) % 20;
        int menosDos = (n + 2) % 20;

        if(menosUno == 0 || menosDos == 0){

          return true;

        } else {


          return false;

        }

    }
    
    //Ejercicio 1.13
    
    public boolean nearTen(int num) {
  
        for(int i = -2; i < 3; i++){

          int restado = (num - i) % 10;

          if(restado == 0){

            return true;

          }

        }
        return false;


    }
    
    //Ejercicio 1.14
    
    public int teenSum(int a, int b) {
  
        int sum = a + b;

        if( a >= 13 && a <= 19 || b >= 13 && b <= 19){

          return 19;

        } else {

          return sum;

        }

    }
    
    //Ejercicio 1.15
    
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  
        if(isAsleep){

          return false;

        } else {

          if(isMorning){

            if(isMom){

              return true;

            } else {

              return false;

            }


          } else {

            return true;

          }

        }


    }

    //Ejercicio 1.16
    
    public int teaParty(int tea, int candy) {
  
        double teaCan = tea / candy;
        double canTea= candy / tea;

        if(tea < 5 || candy < 5){

          return 0;

        } else {

          if(canTea >= 2 || teaCan >= 2){

            return 2;

          } else {

            return 1;

          }

        }

    }

    //Ejercicio 1.17
    
    public String fizzString(String str) {
        int largo = str.length();
        String primero = str.substring(0,1);
        String ultimo = str.substring(largo - 1, largo);

        boolean f = primero.matches("f");
        boolean b = ultimo.matches("b");

        if( f == true && b == true){

          return "FizzBuzz";

        } else if(f == true && b == false){

          return "Fizz";

        } else if(f == false && b == true){

          return "Buzz";

        } else {

          return str;

        }


    }
    
    //Ejercicio 1.18
    
    public String fizzString2(int n) {
        int div3 = n % 3;
        int div5 = n % 5;

        if(div3 == 0 && div5 == 0){

            return "FizzBuzz!";

        }

        if(div3 == 0){

          return "Fizz!";

        }

        if(div5 == 0){

          return "Buzz!";

        }

        return n + "!";

    }
    
    //Ejercicio 1.19
    
    public boolean twoAsOne(int a, int b, int c) {
        int sumaAB = a+ b;
        int sumaBC = b + c;
        int sumaAC = a + c;

        if(sumaAB == c || sumaAC == b || sumaBC == a){

          return true;

        }

        return false;

    }

    //Ejercicio 1.20
    
    public boolean inOrder(int a, int b, int c, boolean bOk) {
  
        if(bOk){

          if(c > b){

            return true;

          }

          return false;

        }

        if(c > b && b > a){

          return true;

        }

          return false;

    }
    
    //Ejercicio 1.21
    
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  
        if(equalOk){

          if(c >= b && b >= a){

            return true;

          }

          return false;

        }

          if(c > b && b > a){

            return true;

          }

          return false;

    }
    
    //Ejercicio 1.22
    
    public int numFin(int n){

          if(n >= 10){

            return n % 10;

          }

            return n;

    }


    public boolean lastDigit(int a, int b, int c) {

          int numA = numFin(a);
          int numB = numFin(b);
          int numC = numFin(c);

          if(numA == numB || numB == numC || numA == numC){

            return true;

          }

            return false;

    }
    
    //Ejercicio 1.23
    
    public boolean restar(int a, int b){
  
        if( Math.abs(a - b) >= 10){

          return true;

        }

        return false;
  
    }

    public boolean lessBy10(int a, int b, int c) {

      boolean AB = restar(a, b);
      boolean AC = restar(a, c);
      boolean BC = restar(b, c);

      if(AB || AC || BC){

        return true;

      }

      return false;

    }
    
    //Ejercicio 1.24
    
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        
        int suma = die1 + die2;

        if(noDoubles){

          if(die1 == die2 && die1 != 6){

            return suma + 1;

          }

         if(die1 == die2 && die1 == 6){

            return die1 + 1;

          }


           return suma;

        }

        return suma;


    }

    
    //Ejercicio 1.25
    
    public int[] ordenadosMasMenos(int a, int b){
  
        int[] array = {0, 0};

        if(a > b){

          array[0] = a;

          array[1] = b;

          return array;

        } else {

          array[0] = b;

          array[1] = a;

          return array;


        }

      }

    public int maxMod5(int a, int b) {
  
    int[] masMenos = ordenadosMasMenos(a, b);

    int aDiv5 = a % 5;
    int bDiv5 = b % 5;



    if(a == b){

      return 0;

    }

    if(aDiv5 == bDiv5){

      return masMenos[1];

    }

      return masMenos[0];

  }
    
    //Ejercicio 1.26
    
    public int redTicket(int a, int b, int c) {
  
        if(a == b && b == c && a == 2){

          return 10;

        }

        if(a == b && b == c){

          return 5;

        }

        if(a != b && a!= c){

          return 1;

        }

          return 0;

      }
    
    //Ejercicio 1.27
    
    public int greenTicket(int a, int b, int c) {
  
        if(a != b && b != c && a  != c){

          return 0;

        }

        if(a == b && b ==c){

          return 20;

        }

        if(a == b || b == c || a == c){

          return 10;

        }


        return 0;

      }

    //Ejercicio 1.28
    

    public boolean diezMas(int a, int b){

          int dif = Math.abs(a - b);

          if(dif >= 10){

            return true;

          }

            return false;

        }

    public int blueTicket(int a, int b, int c) {

          int ab = a + b;
          int bc = b + c;
          int ac = a + c;

          boolean difAbBc = diezMas(ab, bc);
          boolean difAbAc = diezMas(ab, ac);
          boolean difBcAc = diezMas(ac, bc);

          if(ab == 10 || bc == 10 || ac == 10){

            return 10;

          }

          if(difAbBc || difAbAc || difBcAc){

            return 5;

          }

            return 0;

        }

    //Ejercicio 1.29
    
    
    public int[] digitDivider(int a){

      int[] array = {0, 0};

      int uno = a / 10;
      int dos = a % 10;

      array[0] = uno;
      array[1] = dos;

      return array;

    }

    public boolean shareDigit(int a, int b) {

      int[] aDivid = digitDivider(a);
      int[] bDivid = digitDivider(b);

      if(aDivid[0] == bDivid[0] || aDivid[1] == bDivid[0] || aDivid[0] == bDivid[1] || aDivid[1] == bDivid[1]){

        return true;

      }

        return false;

    }

    //Ejercicio 1.30
    
    public int sumLimit(int a, int b) {

        int suma = a + b;

        String aLetra = String.valueOf(a);
        String sumaLetra = String.valueOf(suma);

        int largoA = aLetra.length();
        int largoSuma = sumaLetra.length();

        if(largoA == largoSuma){

          return suma;

        }

          return a;

      }

    
    //Logic 2 ejercicios
    
    //Ejercicio 2.1
    
    public boolean makeBricks(int small, int big, int goal) {
  
        int valorGrande = big * 5;
        int cantidadDeBig = big;
        int valorSmol = small * 1;
        int cantidadDeSmol = small;
        int sumaValores = valorGrande + valorSmol;

        if(goal > valorGrande){

          if(sumaValores >= goal){

            return true;

          } else {

            return false;

          }

        } else if (goal == valorGrande){

          return true;

        } else {

          boolean algunaValida = false;
          for(int i = big; i >= 0; i--){
            cantidadDeBig = cantidadDeBig - 1;
            int valorCantidadDeBig = cantidadDeBig * 5;

            if (valorCantidadDeBig <= goal){

              if(valorCantidadDeBig + valorSmol >= goal){

                algunaValida = true;

              } 
            } else if(valorCantidadDeBig == goal){

              algunaValida = true;

            }
          }

          if(algunaValida){

            return true;

          } else {

            return false;

          }

        }


      }
    
    //Ejercicio 2.2
    
    public int loneSum(int a, int b, int c) {
  
        int suma = a + b + c;

        if(a == b && b == c){

          return 0;

        } else if( a == b){

          return c;

        } else if(b == c){

          return a;

        } else if(a == c){

          return b;

        } else {

          return suma;

        }


      }

    //Ejercicio 2.3
    
    public int luckySum(int a, int b, int c) {
 
        int suma = a + b +c;

        if(a == 13 || b == 13 || c == 13){

          if(a == 13){

            return 0;

          }

          if(b == 13){

            return a;

          }

          if(c == 13){

            return a + b;

          }

         }else {

          return suma;

        }

        return suma;

      }
    
    //Ejercicio 2.4
    
    public int fixTeen(int n){

      if(n >= 13 && n <= 19){

        if(n == 15 || n == 16){

          return n;

        }

          return 0;

      }

      return n;

    }

    public int noTeenSum(int a, int b, int c) {

      int aTeen = fixTeen(a);
      int bTeen = fixTeen(b);
      int cTeen = fixTeen(c);

      return aTeen + bTeen + cTeen;

    }

    //Ejercicio 2.5
    
    public int round10(int n){

      int numeroPrimero = n / 10;
      int numeroSegundo = n % 10;

      if(numeroSegundo >= 5){

        return (numeroPrimero + 1) * 10;

      } else {

        return numeroPrimero * 10;

      }

    }

    public int roundSum(int a, int b, int c) {

      int aRounded = round10(a);
      int bRounded = round10(b);
      int cRounded = round10(c);


      return aRounded + bRounded + cRounded;
    }

    //Ejercicio 2.6
    
    public boolean closeFar(int a, int b, int c) {

     int ab = Math.abs(a - b);
     int bc = Math.abs(c - b);
     int ac = Math.abs(a - c);

      if(ab <= 1 && ac >= 2 && bc >= 2){

        return true;

      }

        if(ac <= 1 && ab >= 2 && bc >= 2){

        return true;

      }

      return false;

    }
    
    //Ejercicio 2.7
    
    public int noNegatives(int n){

        if (n < 0){

          return 1000;

        }

        return n;

      }

    public int blackjack(int a, int b) {

        int a21 = 21 - a;
        int b21 = 21 - b;
        int aNoNeg = noNegatives(a21);
        int bNoNeg = noNegatives(b21);

        if(a21 < 0 && b21 < 0){

          return 0;

        }

        if(aNoNeg < bNoNeg){

          return a;

        }

        if(aNoNeg > bNoNeg){

          return b;

        }

        return a;

      }
    
    //Ejercicio 2.8
    
    public int[] ordenante(int a, int b, int c){

    int[] array = {0, 0, 0};

    if(a > b && a > c){

      if(b > c){

        array[0] = a;
        array[1] = b;
        array[2] = c;

        return array;

      }

        array[0] = a;
        array[1] = c;
        array[2] = b;

        return array;

    }

    if(b > c && b > a){

      if(c > a){

        array[0] = b;
        array[1] = c;
        array[2] = a;

        return array;

      }

        array[0] = b;
        array[1] = a;
        array[2] = c;

        return array;

    }

    if(c > b && c > a){

      if(b > a){

        array[0] = c;
        array[1] = b;
        array[2] = a;

        return array;

      }

        array[0] = c;
        array[1] = a;
        array[2] = b;

        return array;

    }

    if(a == b && b == c){

        array[0] = c;
        array[1] = a;
        array[2] = b;

        return array;

    }

    if(a == b && b > c){

        array[0] = a;
        array[1] = b;
        array[2] = c;

        return array;

    }

    if(a == c && c > b){

        array[0] = a;
        array[1] = c;
        array[2] = b;

        return array;

    }

      if(b == c && b > a){

        array[0] = b;
        array[1] = c;
        array[2] = a;

        return array;

    }

        array[0] = c;
        array[1] = a;
        array[2] = b;

        return array;

  }

    public boolean evenlySpaced(int a, int b, int c) {

      int[] ordenados = ordenante(a, b, c);

      int distBigMed = Math.abs(ordenados[0] - ordenados[1]);
      int distMedSmol = Math.abs(ordenados[1] - ordenados[2]);

      if(distBigMed == distMedSmol){

        return true;

      } 

      return false;

    }
    
    //Ejercicio 2.9
    
    public int makeChocolate(int small, int big, int goal) {
  
        int pesoGrandes = big * 5;
        int faltanGoal = goal - pesoGrandes;
        int pesoPequeñas = small;



        if(faltanGoal < 0){

          int pequesNecesarias = goal % 5;

          if(pequesNecesarias <= small){

            return pequesNecesarias;

          }

            return -1;

        }

        if(faltanGoal > 0){

          int necesarias = pesoPequeñas - faltanGoal;

          if(necesarias == 0){

            return small;

          }

          if(necesarias < 0){

            return -1;

          }

          return faltanGoal;

        }

        return 0;

      }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
