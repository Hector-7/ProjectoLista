/**
 * Se importan las clases necesarias para el proceso
 * como son el java LinkedList y el Stack
 * @author Hector Rodriguez
*/
import java.util.LinkedList;
import java.util.Stack;

public class ProjectoLista {

    /**
     * Seccion principal donde se encuentran: Lista, Pila y Cola
     * @param args 
     */
    public static void main(String[] args) {
        LinkedList lista = new LinkedList(); //Creacion de Lista para su uso
        /**
         * Agregacion de datos a la lista, para demostrar su funcionamiento
         */
        lista.add("Hola");
        lista.add(24);
        lista.add(5);
        lista.add("Casa");
        lista.add("Gato");
        lista.pop();
        
        System.out.println("El tamaño de la lista es: "+lista.size()); //El tamaño de la lista se muestra dependiendo de los datos agregados
        System.out.println("El elemento en la seccion 3 de la lista es: "+lista.get(2)); //Se muestra el elemento en la seccion 4 de la lista de datos agregados 
        
        /*
        Metodo para comprobar que la lista esta o no vacia
        */
        if(lista.isEmpty()){
           System.out.println("La lista esta vacia");
        }else{
            System.out.println("La lista NO esta vacia");
        }
        System.out.println("\n ///////////////////////////////////// \n");
        
        Stack pila = new Stack(); //Creacion de Pila para su uso
        /**
         * Agregacion de datos a la pila, para demostrar su funcionamiento
         */
        pila.push(50);
        pila.push("perro");
        pila.push(7);
        pila.push("Hola");
        pila.push("Nombre");
        
        System.out.println("El tamaño de la pila es: "+pila.size()); //El tamaño de la pila se muestra dependiendo de los datos agregados
        System.out.println("El ultimo elemento de la pila es: "+pila.peek()); //Se muestra el ultimo elemento en la seccion 4 de la lista de datos agregados
        /**
         * Proceso para mostrar cada elemento agregado y al mismo tiempo se van descartando de la pila hasta que se vacie.
         */
        /*while(pila.empty()==false){
            System.out.println(pila.pop());
        }*/
        /*
        Metodo para comprobar que la pila esta o no vacia
        */
        if(pila.isEmpty()){
            System.out.println("La Pila esta vacia");
        }else{
            System.out.println("La Pila NO esta vacia");
        }
        System.out.println("\n ///////////////////////////////////// \n");
        
        LinkedList cola = new LinkedList(); //Creacion de cola para su uso
        /**
         * Proceso para agregar los numeros del 1 al 10 dentro de la cola
         */
        for(int i=1; i<11; i++)
            cola.offer(i);
        /**
         * Proceso para vaciar la cola acorde al primer elemento que se registro usando el proceso ya establecido en Java usando POLL
         */
        while(cola.peek()!=null){
            System.out.println(cola.poll());
        }
        /*
        Metodo para comprobar que la lista esta o no vacia
        */
        if(cola.isEmpty()){
            System.out.println("La Cola esta vacia");
        }
    }
    
}
