package tarea3;
import java.util.Scanner;
/**
 *
 * @author DELL
 */

public class Tarea3 {
    /**
     * @param args the command line arguments
     */
    
    public static void Programa1() {
        String arreglo[] = new String [5];
        Scanner teclado= new Scanner(System.in); 
        int usuario , pos=0,i=0,j=0;;
        do {
        System.out.print("\n"); 
	System.out.println("1. Ingresar Usuarios");
	System.out.println("2. Mostrar Usuarios Ascendente");
	System.out.println("3. Mostrar Usuarios Descendente");
	System.out.println("4. Menu Principal\n");
	System.out.print("Ingrese el Numero de Opcion:\t"); 
	usuario=teclado.nextInt();   
            switch (usuario) {
                case 1:
                    boolean verificar=true;
                    while (i<arreglo.length && verificar==true)
                    {
                        Scanner ingreso= new Scanner(System.in); 
                        System.out.print("Ingrese el Nombre del Usuario "+"["+i+"]"+":\t");
                        String nombre=ingreso.next();
                        
                        if (nombre!=null)
                        {
                            boolean repetido=false;
                            for (j=0; j<pos && repetido==false;j++)
                            {
                                if (arreglo[j].equals(nombre))
                                {
                                    System.out.println("El Usuario ya existe , ingrese otro.");
                                    repetido=true;
                                }     
                            }
                         if (repetido==false)  {
                              arreglo[pos]=nombre;
                              pos++;
                              i++;
                         }
                        }
                         else {
                             verificar=false;
                         }
                    }     
                    break;
                case 2:
                    for (i=arreglo.length-1;i>=0;i--)
                    {
                        System.out.println(arreglo[i]);
                    }
                    break;
                case 3:
                    for (i=0;i<arreglo.length;i++)
                    {
                        System.out.println(arreglo[i]);
                    }
                    break;
            }	
        }
       while (usuario<4); 
    }
    
    
    public static void Programa2() {
            
    }
    
    
    public static void Programa3() {
            
    }
    
    public static void Programa4() {
            
    }
    
    
    
    
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
		int opcion=0;
		do {
		System.out.print("\n"); 
		System.out.println("1. Usuarios");
		System.out.println("2. Contador de Digitos Repetidos");
		System.out.println("3. Numeros de Mayor a Menor");
		System.out.println("4. Calcular Promedio");
		System.out.println("5. Salir\n");
		System.out.print("Escriba el Numero de Programa:\t"); 
		opcion=teclado.nextInt();
            switch (opcion) {
                case 1:
                    Programa1();
                    break;
                case 2:
                    Programa2();
                    break;
                case 3:
                    Programa3();
                    break;
                case 4:
                    Programa4();
                    break;
            }		
		}
		while (opcion<5); 
		}
    }
    

