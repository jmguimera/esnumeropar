package esnumeropar;
/** @author José Miguel Guimerá Padrón. PROG 1º DAM */
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
        
public class EsNumeroPar {

    int espar; // Creacion de variable de clase que contendrá el valor por el teclado
    
    public static void main(String[] args) { // Metodo main principal
          
        EsNumeroPar par=new EsNumeroPar(); //Creacion e incializacion de objeto de la clase
        boolean ok=true; //variable que controlará bucle do while para la sentencia try
                
      do {// se inicia bucle con true que repetirá el ciclo si hay error de exception  
        try{ // el comando captura cualquier error de exception que se produzca
            ok=false; // se coloca a false para que si no hay error salga del bucle do while
            
            // Se pide valor del numero a testear y se asigna valor a la variable de clase espar
            par.setEspar(parseInt(JOptionPane.showInputDialog("Indique el numero a comprobar: ")));
             }
            catch(NumberFormatException e){ //si se genera un error de este tipo se captura aqui 
                ok=true; // se coloca a true para repetir ciclo
                // se envia un mensaje de error y la forma de corregirlo al usuario
                System.out.println("Error en el formato del dato, por favor escribe un entero!");
             }
            catch(Exception e){ //se captura cualquier exception menos la anterior
                ok=true; // se coloca a true para repetir ciclo
                // como es un error distinto al anterior enviamos este mensaje generico al usuario
                System.out.println("Error en la escritura dato, vuelva a intentarlo!");
             }
      } while(ok); // se evalua ok y se repite el ciclo e si es true, sino sale del ciclo
        
        // se obtiene el valor convertido de string a entero escirto por el usuario
        if (par.calcular(par.espar)){ // Se usa el metodo calcular que devuelve booleano 
           System.out.println("\nEl número: "+par.espar+" SI es par!!");// Si es true es par
        } else {
           System.out.println("\nEl número: "+par.espar+" NO es par!!");// false significa No es par        
        }
    } // fin de main

    public EsNumeroPar() { // Constructor por defecto, para inicializar variable
        this.espar=0;
    }
    
    public EsNumeroPar(int espar) { // Constructor con parametro se pasa el valor que se escribio
        this.espar = espar;
    }
    
    public void setEspar(int espar){// Se le asgina el valor escrito por teclado a la varaible espar 
        this.espar=espar;
    }    
    
    public boolean calcular(Integer espar){ // Se evalua el numero pasado por parametro
       
           boolean sies=false; // se declara e inicializa variable local booleana a false
        
       if(espar%2==0){ // Si el modulo de espar entre 2 es cero el numero es par
              sies=true; // entonces se cambia el valor de sies por true
        }    
    return sies; // si retorna el valor de sies, true si es par o flase si no es par
    }
    
}// fin de la clase EsNumeroPar
