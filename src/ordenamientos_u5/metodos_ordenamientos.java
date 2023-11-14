package ordenamientos_u5;
public class metodos_ordenamientos 
{
    private boolean ordenado;
    private int aux;
    private int tamanio;
    private int pasadas; 
    private int particion;
    public int[] burbuja(int[] arreglo)//método de la burbuja
    {
        ordenado = false;
        tamanio = arreglo.length;
        pasadas = 0;
        while(!ordenado)
        {
            ordenado = true;
            for(int i = 0; i<(tamanio - 1 - pasadas); i++)
            {
                if(arreglo[i] > arreglo[i+1])
                {
                    aux = arreglo[i+1];
                    arreglo[i+1] = arreglo[i];
                    arreglo[i] = aux;
                    ordenado = false;
                }
            }
            pasadas++;
        }
        System.out.println("Se ordeno en " + pasadas + " iteraciones");
        return arreglo;
    }
    
    public int[] rapido(int[] arreglo, int l,int h)//método quicksort
    {
        if(l<h)//caso base de la recursividad
        {
            particion = partir(arreglo,l,h);
            rapido(arreglo,l,particion-1);
            rapido(arreglo,particion+1,h);
        }
        return arreglo;
    }
    
    private int partir(int[] theArray, int p, int u)
    {
        int j,i,pivote;
        pivote = theArray[u];
        i = (p-1);
        for(j = p; j<=u-1; j++)
        {
            if(theArray[j] < pivote)
            {
                i++;
                aux = theArray[i];
                theArray[i] = theArray[j];
                theArray[j] = aux;
            }
        }
        i++;
        aux = theArray[i];
        theArray[i] = theArray[u];
        theArray[u] = aux;
        return(i);
    }

    public int[] ordenarShell(int []arreglo)
    {
        int tamanio = arreglo.length;
        int espacio = tamanio/2;
        int posicion;
        while(espacio>0)
        {
            for(int i = espacio; i<tamanio; i++)
            {
                aux = arreglo[i];
                posicion = i;
                while(posicion>=espacio && arreglo[posicion-espacio] > aux)
                {
                    arreglo[posicion] = arreglo[posicion-espacio];
                    posicion-=espacio;
                }
                arreglo[posicion] = aux;
            }
            espacio = espacio/2;
        }
        return arreglo;
    }
    
    public void imprimir(int[] arreglo)
    {
        System.out.print("[");
        for(int i = 0; i<arreglo.length; i++)
        {
            System.out.print(arreglo[i] + "," );
        }
        System.out.println("]");
    }
}
