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
    
    //Ejercicio 1.1 comentado
    
    public boolean cigarParty(int cigars, boolean isWeekend) {

        //comprobamos si es finde semana, y si tenemos el minimo necesario
        
        if (isWeekend && cigars >= 40){

            return true;

        }
        
        //Si al llegar aqui significa que no es fin de semana o no teniamos el minimo, si no tenia el minimo ira directo al false
        //Comprobamos la cantidad par ver si esta entre las que son validas para entre semana
        if (cigars >= 40 && cigars <= 60){

            return true;

        } 

            return false;

      }
    
    //Ejercicio 1.2 comentado
    
    public int dateFashion(int you, int date) {
  
        //Comprobamos que o nosotros o nuestra cita tengamos un 8 o mas
        if(you >= 8 || date >= 8){
            
          //Ahora eliminamos el caso de que la otra persona sea un 2 o menos
          if(you <= 2 || date <= 2){

            return 0;

          } else {

            return 2;

          }

        } else {
            //Esto se ejecuta si ninguno somos un 8, de nuevo comprobamos que ninguno sea un dos
           if(you <= 2 || date <= 2){

            return 0;

          } else {

            return 1;

          }

        }
     }
    
    //Ejercicio 1.3 comentado
    
    public boolean squirrelPlay(int temp, boolean isSummer) {

        //Empezamos con el booleano
        if(isSummer){
            //Comprobamos las temperaturas en caso de verano y damos true o false segun proceda
          if(temp >= 60 && temp <= 100){

            return true;

          } else {

            return false;

          }

        } else {
            
          //Comprobamos al temperatura en caso de que no sea verano
          
          if(temp >= 60 && temp <= 90){

            return true;

          } else {

            return false;

          }

        }

      }
    
    //Ejercicio 1.4 comentado
    
    public int caughtSpeeding(int speed, boolean isBirthday) {
  
        //Definimos los valores de velocida dpara las multas
        int minTick = 61;
        int minBigTick = 81;

        //Comp`robamos que NO es nuestro cumpleaños
        if(isBirthday == false){

          //Comprobamos la velocidad para definir la multa en no cumpleaños
          if(speed < minTick){

            return 0;

          } else if (speed >= minTick && speed <= minBigTick){

            return 1;

          } else {

            return 2;

          }

        } else {

          //Comp`robamos lso valores añadiendo los 5 por ser cumpleaños, para definir la multa en caso de cumpleaños
          if(speed < minTick + 5){

            return 0;

          } else if (speed >= minTick + 5 && speed <= minBigTick + 5){

            return 1;

          } else {

            return 2;

          }

    }

  
}

    //Ejercicio 1.5 comentado
    
    public int sortaSum(int a, int b) {
  
        //Realizamos la suma
        int sum = a + b;

        //Comprobamos si esta entre los valroes indicados
        if(sum >= 10 && sum <= 19){

          return 20;

        } else {

          return sum;

        }
    }

    //Ejercicio 1.6 comentado
    
    public String alarmClock(int day, boolean vacation) {
  
        //Primero vemos si estamos de vacaciones
        if(vacation == true){

          //Comprobamos que dia es y asignamos la hora adecuada para ese dia en vacaciones
          if(day >= 1 && day <= 5){

            return "10:00";

          } else {

            return "off";

          }


        } else {

          //Comprobamos el dia y asignamos la hora en dia de no vacaciones 
          if(day >= 1 && day <= 5){

            return "7:00";

          } else {

            return "10:00";

          }

        }

    }

    //Ejercicio 1.7 comentado
    
    public boolean love6(int a, int b) {

        //Definimos la suma, y la resta en valor absoluto
        int sum = a + b;
        int rest = Math.abs(a - b);

        //Comprobamos que cualquiera de los 4 valores solicitados sea 6
        if (a == 6 || b == 6 || sum == 6 || rest == 6){

          return true;

        } else {

          return false;

        }

    }
    
    //Ejercicio 1.8 comentado
    
    public boolean in1To10(int n, boolean outsideMode) {
  
        //Comprobamos el boolean dado
        if (outsideMode == true){

          //Chequeamos que el valor no esta en el rangod e 1 a 10
          if(n <= 1 || n >= 10){

            return true;

          } else {

            return false;

          }

        } else {

          //Como aqui estamos en inside mode, comprobamosn que si este en el rando de 1 a 10
          if(n >= 1 && n <= 10){

            return true;

          } else {

            return false;

          }

        }


    }
    
    //Ejercicio 1.9 comentado
    
    public boolean specialEleven(int n) {
  
        //Hacemos una variable con el rasto de n y de n -1
        int res = n % 11;
        int resMen = (n - 1) % 11;

        //Devolvemos true si cualquiera de los dos es 0
        if(res == 0 || resMen == 0){

          return true;

        } else {

          return false;

        }

    }

    //Ejercicio1.10 comentado
    
    public boolean more20(int n) {
  
        //Definimos las variables del resto de 20, quitando 1 o 2
        int menosUno = (n % 20) - 1;
        int menosDos = (n % 20) - 2;

        
        //Aqui comprobamos si cualquiera de esos restos es 0, esto podria haberse hecho igual comprobando que menosUno fuese 1 y menosDos fuese 2
        if(menosUno == 0 || menosDos == 0){

          return true;

        } else {

          return false;

        }

    }

    //Ejercicio 1.11 comentado
    
    public boolean old35(int n) {
  
        //Comprobamos los restos del numero entre 3 y entre 5
        int mTres = n % 3;
        int mCinco = n % 5;

        //Si cualquiera es 0, entramos en el if
        if(mTres == 0 || mCinco == 0){

          //Si ambos son 0, entramos aqui
          if(mTres == 0 && mCinco == 0){

            return false;

          } else {

            return true;

          }


        } else {
          //En casod e que ninguno sea 0
          return false;

        }


    }
    
    //Ejercicio 1.12 comentado
    
    public boolean less20(int n) {
  
        //Comprobamos que los numeros, sumando 1 o 2, sean multiplo de 20
        int menosUno = (n + 1) % 20;
        int menosDos = (n + 2) % 20;

        //Si caulquiera de los es multiplo de 20, devolvemos true
        if(menosUno == 0 || menosDos == 0){

          return true;

        } else {


          return false;

        }

    }
    
    //Ejercicio 1.13 comentado
    
    public boolean nearTen(int num) {
  
        //Definimos un for que va cambiando el valor que le restamos a 10 para comprobar los valores necesarios
        for(int i = -2; i < 3; i++){

          int restado = (num - i) % 10;
          //Si alguno es 0, quiere decir que cum`ple los requisitos
          if(restado == 0){

            return true;

          }

        }
        return false;


    }
    
    //Ejercicio 1.14 comentado
    
    public int teenSum(int a, int b) {
  
        //Sumamos los valores
        int sum = a + b;

        //Comprobamos si uno de los dos se haya en los valores especificados
        if( a >= 13 && a <= 19 || b >= 13 && b <= 19){

          return 19;

        } else {

          return sum;

        }

    }
    
    //Ejercicio 1.15 comentado
    
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  
        //Empezamos comprobando si estamos dormidos ya que eso elimina todo
        if(isAsleep){

          return false;

        } else {
          //Ahora comprobamos que sea mañana, en cuyo caso solo contestamos a nuestra madre
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

    //Ejercicio 1.16 comentado
    
    public int teaParty(int tea, int candy) {
  
        //Comprobamos la relacion de caramelos te y viceversa
        double teaCan = tea / candy;
        double canTea= candy / tea;

        //Comprobamos que ambas lleguen al minimo
        if(tea < 5 || candy < 5){

          return 0;

        } else {
          
          //Comprobamos si alguna es la cantidad idonea
          if(canTea >= 2 || teaCan >= 2){

            return 2;

          } else {

            return 1;

          }

        }

    }

    //Ejercicio 1.17 comentado
    
    public String fizzString(String str) {
        
        //Guardamos el alrgo en una int y hacemos dos sub strings, una con la primera lera y otra con la ultima
        int largo = str.length();
        String primero = str.substring(0,1);
        String ultimo = str.substring(largo - 1, largo);

        //Comprobamos en un boolean si las letras encajan con als que se piden
        boolean f = primero.matches("f");
        boolean b = ultimo.matches("b");

        //Si se cumplen ambas, devolvemos el mensaje indicado
        if( f == true && b == true){

          return "FizzBuzz";

          //Si solo una encaja, devolvemos los mensajes correspondientes
        } else if(f == true && b == false){

          return "Fizz";

        } else if(f == false && b == true){

          return "Buzz";

        } else {

            //Si ninguna encaja, devolvemos el string inalterado
          return str;

        }


    }
    
    //Ejercicio 1.18 comentado
    
    public String fizzString2(int n) {
        
        //Comprobamos si los numeros son multiplo de 3 o 5
        int div3 = n % 3;
        int div5 = n % 5;

        //Misma dinamica que el anterior, un mensaje si ambos son, dos mensajes por si es cada uno y un mensaje si no es ninguno
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
    
    //Ejercicio 1.19 comentado
    
    public boolean twoAsOne(int a, int b, int c) {
        
        //Almaccenamos las sumas en 3 variables
        int sumaAB = a+ b;
        int sumaBC = b + c;
        int sumaAC = a + c;

        //Comprobamos que cualquiera de las sumas sea igual al numero restante
        if(sumaAB == c || sumaAC == b || sumaBC == a){

          return true;

        }

        return false;

    }

    //Ejercicio 1.20 comentadow
    
    public boolean inOrder(int a, int b, int c, boolean bOk) {
  
        //Comprobamos el booleano 
        if(bOk){
          //Si es true, comprobamos que c sea mayor que b
          if(c > b){

            return true;

          }

          return false;

        }
        //Si no es true, comprobamos que c sea mas que b y b que a
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
