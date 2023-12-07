import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;

public class fileReading extends ConsoleProgram {
	public void run() {
		//BufferedReader reader;
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:/Users/99559/Desktop/Practice/Practice/fileReading.java"));
			while (true) {
				String line = reader.readLine();
				if (line == null) {
					break;
				}
				
				println(line);
				
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			println("shecdomaa, faili ver moidzebna");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			println("sxva shecdoma");
		}
	}
}
