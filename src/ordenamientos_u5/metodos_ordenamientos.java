package ordenamientos_u5;
public class metodos_ordenamientos 
{
    private boolean ordenado;
    private int aux;
    private int tamanio;
    private int pasadas; 
    public int[] burbuja(int[] arreglo)
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
