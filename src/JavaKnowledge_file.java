import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaKnowledge_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
//		try {
//			FileWriter writer = new FileWriter("poem.txt");
//			writer.write("Roses are red \nViolets are blue");
//			writer.append("\n Fan");
//			writer.close();
//		
//		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
		
		
		
		File file = new File("userInfo.ser");
		
		if(file.exists()) {
			System.out.println("the file exists. ");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			//file.delete();
		}
		else {
			System.out.println("does not exists");
		}
		
		
		
//		try {
//		
//			FileReader reader = new FileReader("secret_message.txt");
//		
//			int data = reader.read(); //  is used to read a single character from the stream. if return -1 , no more data
//			
//			while (data != -1) {
//				System.out.print((char)data); // because it return ascII number, so we have to convert it to char
//				data = reader.read();
//			}
//			reader.close();
//					
//					
//		}
//		catch(IOException e) {
//			e.printStackTrace();
//			
//		}
		

	}

}
