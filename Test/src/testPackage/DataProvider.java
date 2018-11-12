package testPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DataProvider {

	private static Map<Integer, Location> get;



	public static int count(Map<Integer, Location> inputMap) 
	{
	    return inputMap.size() ;
	    
	}

	
	public static Map<Integer, Location> getAll(Map<Integer, Location> inputMap) 
	{
	    return inputMap ;
	}
	
	
	public static Map<Integer, Location> get(int page, int count) {
		Map<Integer, Location> mapa = new HashMap<Integer, Location>();	
		for(int i = page*count+1;i<(page*count)+count+1 ;i++) {
			
			if(mapa.containsKey(i)) {
		return (Map<Integer, Location>) (mapa.get(i));
	}
		}
		return mapa;
	}
	

public static void main(String[] args) {

Map<Integer, Location> mapa = new HashMap<Integer, Location>();		
	

File file = new File("plik.csv");
Scanner s = null;

try {
s = new Scanner(file);
} catch (FileNotFoundException e) {
	
	e.printStackTrace();
}
while(s.hasNext()) {
//String
String str = s.nextLine();


//Tablica Stringów
String[] tabStr = str.split(";");

String a = tabStr[0];
String b = tabStr[1];
String c = tabStr[2];

//parsowanie String do int
int id = Integer.parseInt(a);

// obiekt z wartoœciami country i city
Location l = new Location(b, c);

//inicjalizacja zmiennych do mapy
mapa.put(id, l);



}




s.close();

System.out.println(get(1,1));

	}


}

		



	

