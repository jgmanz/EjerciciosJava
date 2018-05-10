package ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String [] args)
	{
		//estructuras condicionales
		
		
		String str = new String("HOLA MUNDO");
		int edad = 20; 
		boolean mayorEdad = false; 
		
		if(edad>=18)
			mayorEdad = true; 
		else
			mayorEdad = false;
		
		mayorEdad = (edad>=18)?true:false;
		
		System.out.println(mayorEdad);
		
		
		//switch
		
		int op = 0; 
		switch(op)
		{
			case 1:
				System.out.println("Caso 1");
				break;
			case 2:
				System.out.println("Caso 2");
				break;
			default :
			System.out.println("Ninguno de los anteriores");
		}
		
		char c = 'a'; 
		switch(c)
		{
		case 'a':
			System.out.println("Caso a");
			break;
		case 'b':
			System.out.println("b");
			break;
		default :
		System.out.println("Ninguno de los anteriores");
		}
	
		//while
		
		int cont = 0; 
		while(cont <= 10)
		{
			System.out.println(cont);
			cont++; 
		}
		do
		{
			System.out.println(cont);
			cont--; 
		}while(cont >= 0);
		
		for(int i = 0; i <= 10; i+=2)
		{
			System.out.println(i);
		}
		
		int[] numeros = new int[] {
				5,9,10,7,2
		};
		
		for(int i= 0; i<numeros.length; i++)
		{
			System.out.println("for" + numeros[i]);
		}
		
		for(int x: numeros)
		{
			System.out.println("Foreach" + x);
		}
		
		ArrayList lista = new ArrayList();
		
		lista.add("Jose");
		lista.add(29);
		lista.add("Escuela");
		
		lista.remove(0);
		
		for(int i = 0; i < lista.size(); i++)
		{
			Object x = lista.get(i);
			System.out.println("Lista for" + x);
		}
		for(Object x: lista)
		{
			System.out.println("Lista " + x);
		}
		

		ArrayList<String> listaString = new ArrayList<String>();
		listaString.add("A0");
		listaString.add("3D");
		listaString.add("22");
		
		ArrayList<Horario> listaHorario = new ArrayList<Horario>(); 
		
		Horario h1 = new Horario("07:00", "07:50","Programacion","Lunes");
		Horario h2 = new Horario("07:50", "08:40","Matematicas","Lunes");

		listaHorario.add(h1);
		listaHorario.add(h2);
		
		for(int i = 0; i < listaHorario.size(); i++)
		{
			Horario h = listaHorario.get(i);
			System.out.println(h.getHorafinal());
		}
			
		HashMap<String, Horario> mapHorario = new HashMap<String, Horario>();
		mapHorario.put("H1", h1);
		mapHorario.put("H2", h2);		
		
		Horario h = mapHorario.get("H1");
		
		for(Map.Entry m:mapHorario.entrySet()){  
			System.out.println("HorarioMap" + m.getKey()+" "+m.getValue());  
		}

		System.out.println("HashMap" + h.getMateria());
		HashMap<Integer,String> hm = new HashMap<Integer,String>();  
	    hm.put(100,"Amit");  
	    hm.put(101,"Vijay");  
	    hm.put(102,"Rahul");  
	    
	    
	    for(Map.Entry m:hm.entrySet()){  
	      System.out.println(m.getKey()+" "+m.getValue());  
	    }
		
	}
}
