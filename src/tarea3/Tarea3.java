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
        // link de referencia: https://www.youtube.com/watch?v=MgI0-kJm9Ak
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
                    while (i<arreglo.length && verificar==true) //mientras i sea menor al tamaño del arreglo y el Usuario sea valido hara lo siguiente
                    {
                        Scanner ingreso= new Scanner(System.in); 
                        System.out.print("Ingrese el Nombre del Usuario "+"["+i+"]"+":\t");
                        String nombre=ingreso.next();
                        
                        if (nombre!=null) //si el nombre es diferente a vacio entonces realizara lo siguiente
                        {
                            boolean repetido=false; 
                            for (j=0; j<pos && repetido==false;j++) //mientras j sea menor al numero de posiciones del arreglo y el nombre no este repetido realizara lo siguiente
                            {
                                if (arreglo[j].equals(nombre)) //si en el arreglo en la siguiente posicion se ingresa un nombre que sea igual al de la posicion anterior entonces el usuario esta repetido , por lo que ya existe.
                                {
                                    //repetido es verdadero ya que el usuario existe por lo que no dejara que el nombre se guarde en la posicion J
                                    repetido=true;
                                    System.out.println("El Usuario ya existe , ingrese otro.");
                                    
                                }     
                            }
                         if (repetido==false) //si el usuario ingresado no es repetido entonces si dejara guardar el jombre en la posicion.
                         {
                              arreglo[pos]=nombre;
                              pos++;
                              i++;
                         }
                        }
                        else //si alguna de las condiciones anteriores no se cumple entonces el verificar sera falso por lo que el while dejara de ejecutarse.
                         { 
                             verificar=false;
                         }
                    }     
                    break;
                case 2:
                    // se imprime el arreglo en orden ascendente , se empieza desde la ultima posicion del arreglo por ello es que se decrementa 
                    for (i=arreglo.length-1;i>=0;i--)
                    {
                        System.out.println(arreglo[i]);
                    }
                    break;
                case 3:
                    // se imprime el arreglo en el orden que fueron ingresados los datos
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
        //link de referencia: https://www.youtube.com/watch?v=9DS-HLChu3g
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
                    for (i=0;i<=numero.length()-1;i++) //recorre el numero ingresado para buscar el numero repetido a buscar
                    {
                      if (numero.toUpperCase().substring(i,i+1).equals(repetido.toUpperCase())) //sustrae el numero ingresado por digitos y iguala al numero repetido a buscar y cada vez que lo encuentre  le sumara 1 a la variable c
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
        //Programa hecho sin ninguna referencia o apoyo en internet
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
        //link de referencia: https://www.youtube.com/watch?v=K4Q87pp2w4k
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
                   
                    for (i=0;i<=5;i++) //recorre la varaible i 6 veces para ingresar las 6 notas y los 6 ID de los alumnos
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
                        suma[i]=suma[i]+A[i]+B[i]+C[i]+D[i];  //realiza la suma de cada nota de cada posicion i , 0 suman con 0 , 1 suman con 1 y asi sucesivamente
                        prom[i]=suma[i]/4; //realiza el promedio de cada suma de las posiciones i , promedio de las sumas de 0 , de las sumas de 1 y asi sucesivamente
                        System.out.print("El promedio del Estudiante "+"["+i+"]"+" es:\t" +prom[i]+ "\n"); //muestra el promedio de cada i , de 1 , de 2 y asi sucesivamente
                        
                    }
                    break; 
                case 2:
                    for(fila = 0; fila<matriz.length; fila++) //recorre las filas de la matriz de 6*6
                    {
                        for(columna = 0; columna<matriz.length; columna++) //recorre las columnas de la matriz 6*6
                        {
                          if (columna==0) 
                          {
                              matriz[columna][fila]=estudiante[fila]; //Agarra la columna 0 y se especifica que para la estructura de la matriz , los datos i[0] que es el ID de los estudiantes se posicionen verticalmente en la posicion de fila que coincidan con la columna 0
                          }
                          if (columna==1)
                          {
                              matriz[columna][fila]=A[fila]; //Agarra la columna 1 y se especifica que para la estructura de la matriz , los datos i[1] que es la nota 1 de los estudiantes se posicionen verticalmente en la posicion de fila que coincidan con la columna 1
                          }
                          if (columna==2)
                          {
                               matriz[columna][fila]=B[fila]; //Agarra la columna 2 y se especifica que para la estructura de la matriz , los datos i[2] que es la nota 2 de los estudiantes se posicionen verticalmente en la posicion de fila que coincidan con la columna 2
                          }
                          if (columna==3)
                          {
                               matriz[columna][fila]=C[fila]; //Agarra la columna 3 y se especifica que para la estructura de la matriz , los datos i[3] que es la nota 3 de los estudiantes se posicionen verticalmente en la posicion de fila que coincidan con la columna 3
                          }
                          if (columna==4)
                          {
                               matriz[columna][fila]=D[fila]; //Agarra la columna 4 y se especifica que para la estructura de la matriz , los datos i[4] que es la nota 4 de los estudiantes se posicionen verticalmente en la posicion de fila que coincidan con la columna 4
                          }
                          if (columna==5)
                          {
                               matriz[columna][fila]=prom[fila]; //Agarra la columna 5 y se especifica que para la estructura de la matriz , los datos i[5] que es el promedio de las notas de los estudiantes y estas se posicionen verticalmente en la posicion de fila que coincidan con la columna 1
                          }
                        }
                    }
                    for(fila = 0; fila<matriz.length; fila++){
             
                        for(columna = 0; columna<matriz.length; columna++){   //imprime tanto las filas y las columnas de la matriz dejando una tabulacion de por medio entre las columnas
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
    

