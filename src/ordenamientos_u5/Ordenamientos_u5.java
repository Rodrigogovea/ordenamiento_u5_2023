package ordenamientos_u5;

public class Ordenamientos_u5 
{
    public static void main(String[] args) 
    {
        // TODO code application logic here
        metodos_ordenamientos metodos = new metodos_ordenamientos();
        int[] miArreglo = {5,2,10,3,4,45,23,67,12,56,3,200,400,1};
        
        System.out.println("Arreglo sin ordenar: ");
        metodos.imprimir(miArreglo);
        System.out.println("");
        miArreglo = metodos.burbuja(miArreglo);
        
        System.out.println("Arreglo ordenado: ");
        metodos.imprimir(miArreglo);
    }
}
