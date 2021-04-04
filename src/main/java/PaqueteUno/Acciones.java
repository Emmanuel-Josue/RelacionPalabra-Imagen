
package PaqueteUno;

import java.util.Random;


public class Acciones {
    
    
    public String[] arregloImagenes(){
    String [] arregloImagenes={"src/main/java/PaqueteDos/FIND.jpg","src/main/java/PaqueteDos/GET.jpg","src/main/java/PaqueteDos/GROW-UP.jpg","src/main/java/PaqueteDos/RUN.jpg",
    "src/main/java/PaqueteDos/SHOOT.jpg","src/main/java/PaqueteDos/SLEEP.jpg","src/main/java/PaqueteDos/WAKE-UP.jpg","src/main/java/PaqueteDos/cut.jpg"};
    return arregloImagenes;

    }
    
    public String[] arregloPalabras(){
    String [] arregloPalabras={"Find","Get","Grow-Up","Run","Shoot","Sleep","Wake-Up","Cut"};
    return arregloPalabras;
    }
    
    public int[] numeroAleatorio(){
    Random aleatorio=new Random();
    int [] arregloN=new int[4];
    int iterador=1;
    //se agrega en () el rango del numero en el que se generara el aleatorio en este 
    //caso el rango es de 0-6, son 7 números en este rango 
    arregloN[0]=aleatorio.nextInt(7);
    arregloN[iterador]=aleatorio.nextInt(7);
    while(arregloN[0]==arregloN[iterador]){
        arregloN[iterador]=aleatorio.nextInt(7);
    }
    ++iterador;
    arregloN[iterador]=aleatorio.nextInt(7);
    
    //Recordar que el simbolo || significa 'o' y sirve para enlazar condicionales 
    while(arregloN[0]==arregloN[iterador] || arregloN[1]==arregloN[iterador]){
    arregloN[iterador]=aleatorio.nextInt(7);
    }
    ++iterador;
    arregloN[iterador]=aleatorio.nextInt(7);
    while(arregloN[0]==arregloN[iterador] || arregloN[1]==arregloN[iterador] || arregloN[2]==arregloN[iterador]){
    arregloN[iterador]=aleatorio.nextInt(7);
    }
    
    return arregloN;
    }
    
    
    
    
    
    
}
