package JAVA.Praktikum12;

import java.io.FileReader;
import java.util.ArrayList;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JSONToObject {

	public static void main(String args[]){
		
		try {
			Gson gson = new Gson();
			FileReader reader = new FileReader("E:/SEMESTER 3/Java/barang.json");
			Type type = new TypeToken<ArrayList<Barang>>() {}.getType();
			ArrayList<Barang> listBrg = gson.fromJson(reader, type);
		
			for(Barang dtBrg : listBrg) {
				System.out.println(dtBrg);
				System.out.println("-----------------------------------------------------------------------------------------");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Akhir Program");
	}
}
