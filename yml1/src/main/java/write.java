import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class write {

	public static void main(String[] args) {
		{
				   Map<String, Object> data = new HashMap<String, Object>();
				   data.put("hobby", "cooking");
				   data.put("race", "Human");
				   //data.put("traits", new String[] { "ONE_HAND", "ONE_EYE" });

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
	}


