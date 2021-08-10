package yml1;
import org.yaml.snakeyaml.Yaml;
first.import;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class yml1 {
	public @interface java {

	}
	static Map<?,?> hello;
	static String path = "src/main/resources/first.yml";
	public static void initializefirst() { 
		try {
			Reader rd= new FileReader(path);
			Yaml yml = new Yaml();
			hello = (Map<?,?>) yml.load(rd);
			System.out.println(hello);
			rd.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		try {
			Scanner rd = new Scanner(new FileReader("src/main/resources/first.yml"));
			Yaml yml = new Yaml();
			hello = (Map<?,?>) rd.scan();
			System.out.println(hello);
			rd.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   Map<String, Object> data = new HashMap<String, Object>();
		   data.put("hobby", "cooking");
		   data.put("race", "Human");
		   

		   Yaml yaml = new Yaml();
		   FileWriter writer = null;
		   yaml.dump(data, writer);
		try {
			writer = new FileWriter("src/main/resources/first.yml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	}

