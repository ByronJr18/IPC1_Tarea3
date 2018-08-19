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
        int usuario , pos=0,i=0,j=0;
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
            Scanner teclado= new Scanner(System.in); 
            int i,c=0,operacion;
            String numero = null,repetido;
            do {
		System.out.print("\n"); 
		System.out.println("1. Ingresar Numero");
		System.out.println("2. Ingresar numero a buscar (sus repetidos)");
		System.out.println("3. Menu Principal\n");
		System.out.print("Escriba el Numero de Opcion:\t"); 
		operacion=teclado.nextInt();
            switch (operacion) {
                case 1:
                    Scanner dato= new Scanner(System.in); 
                    System.out.print("Ingrese el numero a analizar:\t");
                    numero=dato.next();
                   
                    break;
                case 2:
                    Scanner dato2= new Scanner(System.in); 
                    System.out.print("Ingrese el numero a buscar:\t");
                    repetido=dato2.next();
                    for (i=0;i<=numero.length()-1;i++)
                    {
                      if (numero.toUpperCase().substring(i,i+1).equals(repetido.toUpperCase()))
                      c++;
                    }
                    System.out.print("\n");
                    System.out.println("El numero ingresado fue: "+numero+"");
                    System.out.println("El numero: "+repetido+" "+"se repite"+" "+c+" " +"veces");
                    break;
                }		
            }
		while (operacion<3); 
    }
  
    
    
    public static void Programa3() {
            Scanner teclado= new Scanner(System.in); 
            int op,n1=0,n2=0,n3=0;
            do {
		System.out.print("\n"); 
		System.out.println("1. Ingresar Numeros");
		System.out.println("2. Mostrar Ordenados");
		System.out.println("3. Menu Principal\n");
		System.out.print("Ingrese el numero de Opcion:\t"); 
		op=teclado.nextInt();
            switch (op) {
                case 1:
                    Scanner numeros= new Scanner(System.in); 
                    System.out.print("Ingrese el primer numero:\t");
                    n1=numeros.nextInt();
                    System.out.print("Ingrese el segundo numero:\t");
                    n2=numeros.nextInt();
                    System.out.print("Ingrese el tercer numero:\t");
                    n3=numeros.nextInt();
                    
                    break;
                case 2:
                    if ((n1<n2 &&  n1<n3) && (n2<n3))
                    {
			System.out.print("\n");
			System.out.println(n3); //Mayor
			System.out.println(n2); //Medio
			System.out.println(n1); //Menor
                    }
                    else if ((n1<n2 &&  n1<n3) && (n3<n2))
                    {
			System.out.print("\n");
			System.out.println(n2); //Mayor
			System.out.println(n3); //Medio
			System.out.println(n1); //Menor
                    }
                    else if ((n2<n1 &&  n2<n3) && (n3<n1))
                    {
			System.out.print("\n");
			System.out.println(n1); //Mayor
			System.out.println(n3); //Medio
			System.out.println(n2); //Menor
                    }
                    else if ((n2<n1 &&  n2<n3) && (n1<n3))
                    {
			System.out.print("\n");
			System.out.println(n3); //Mayor
			System.out.println(n1); //Medio
			System.out.println(n2); //Menor
                    }
                    else if ((n3<n1 &&  n3<n2) && (n1<n2))
                    {
			System.out.print("\n");
			System.out.println(n2); //Mayor
			System.out.println(n1); //Medio
			System.out.println(n3); //Menor
                    }
                    else if ((n3<n1 &&  n3<n2) && (n2<n1))
                    {
			System.out.print("\n");
			System.out.println(n1); //Mayor
			System.out.println(n2); //Medio
			System.out.println(n3); //Menor
                    }
                    break;
                }		
            }
	while (op<3); 
    }
    
    
    public static void Programa4() {
        Scanner teclado= new Scanner(System.in);
        int matriz [][]= new int [6][6];
        int alt,i=0,fila,columna;
         int estudiante[]=new int[6];
         int suma[]=new int[6];
         int prom[]=new int[6];
         int A[]=new int[6];
         int B[]=new int[6];
         int C[]=new int[6];
         int D[]=new int[6];
        do {
		System.out.print("\n"); 
		System.out.println("1. Ingresar Notas");
		System.out.println("2. Mostrar Notas y Promedios");
		System.out.println("3. Menu Principal\n");
		System.out.print("Escriba el Numero de Opcion:\t"); 
		alt=teclado.nextInt();
            switch (alt) {
                case 1:
                    Scanner sc = new Scanner(System.in);
                   
                    for (i=0;i<=5;i++)
                    {   
                        System.out.print("Ingrese el ID del Estudiante:\t");
                        estudiante[i]=sc.nextInt();
                        System.out.print("Ingrese la Nota 1:\t");
                        A[i]=sc.nextInt();
                        System.out.print("Ingrese la Nota 2:\t");
                        B[i]=sc.nextInt();
                        System.out.print("Ingrese la Nota 3:\t");
                        C[i]=sc.nextInt();
                        System.out.print("Ingrese la Nota 4:\t");
                        D[i]=sc.nextInt();
                        suma[i]=suma[i]+A[i]+B[i]+C[i]+D[i];
                        prom[i]=suma[i]/4;
                        System.out.print("El promedio del Estudiante "+"["+i+"]"+" es:\t" +prom[i]+ "\n");
                        
                    }
                    break; 
                case 2:
                    for(fila = 0; fila<matriz.length; fila++)
                    {
                        for(columna = 0; columna<matriz.length; columna++)
                        {
                          if (columna==0)
                          {
                              matriz[columna][fila]=estudiante[fila];
                          }
                          if (columna==1)
                          {
                              matriz[columna][fila]=A[fila];
                          }
                          if (columna==2)
                          {
                               matriz[columna][fila]=B[fila];
                          }
                          if (columna==3)
                          {
                               matriz[columna][fila]=C[fila];
                          }
                          if (columna==4)
                          {
                               matriz[columna][fila]=D[fila];
                          }
                          if (columna==5)
                          {
                               matriz[columna][fila]=prom[fila];
                          }
                        }
                    }
                    for(fila = 0; fila<matriz.length; fila++){
             
                        for(columna = 0; columna<matriz.length; columna++){
                        System.out.print("\t"+matriz[columna][fila]+" ");
                
                    }
                    System.out.println("");
                    }
            }	 
        }
        while (alt<3);
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
    

