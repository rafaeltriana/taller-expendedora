
package tallerprogramacion;


public class TallerProgramacion {

   
    public int suma(int totalpapas,int totalgaseosa,int totalgalletas,int totalmani){
        int suma=0;
        suma= totalpapas+totalgaseosa+ totalgalletas+ totalmani;
        return suma;
        
    }
    public int resta(int suma,int dinero ){
        int resta=0;
        resta=dinero-suma;
        return resta;
        
    }
    public int calcular(int resta){
        double [] monedas={50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100};
 
        // Creamos un array con 0 de longitud igual a la cantidad de monedas
        // Este array contendra las monedas a devolver
        double [] devolver={0,0,0,0,0,0,0,0,0};
 
        // Recorremos todas las monedas
        for(int i=0;i<monedas.length;i++)
        {
            // Si el importe actual, es superior a la moneda
            if(resta>=monedas[i])
            {
                // obtenemos cantidad de monedas
                devolver[i]=Math.floor(resta/monedas[i]);
 
                // actualizamos el valor del importe que nos queda por didivir
                resta=(int) (resta-(devolver[i]*monedas[i]));
            }
        }
 
        // Bucle para mostrar el resultado
        for(int i=0;i<monedas.length;i++)
        {
            if(devolver[i]>0)
            {
                if(monedas[i]>2)
                {
                    // Indicamos que es un billete
                    System.out.println("Hay "+devolver[i]+" billetes de: "+monedas[i]+" Pesos");
                }else{
                    // Indicamos que es una moneda
                    System.out.println("Hay "+devolver[i]+" monedas de: "+monedas[i]+" Pesos");
                }
            }
        }
        return 0;
    }
}

