import java.util.*;
import java.util.regex.*;
import java.io.*;

public class fmr{
	public static void main(String[] args){
		
		for(int i = 0; i < args.length; i++){
			if(args[i].equals("-h")){
				System.out.println("This command takes in an input and a regrex and outputs the line and 
					position of the found token.\n");
				System.out.println("\t -h \t prints help.");
				//update help
				System.exit(0);
			}//if

		}//for i

		int fileInput = -1;
		for(int i = 0; i < args.length; i++){
			if(args[i].equals("-f")){
				fileInput = i;
				break;
			}//if
		}//for i

		if(fileInput != -1){
			String fileName = args[fileInput + 1];
			
			Pttern p = Pattern.compile(args[fileInput + 2]);

			try{
				FileReader freader = new FileReader(fileName);
				BufferReader br = new BufferReader(freader);

				//hint

				String line;
				
				while((line = br.readLine()) != null){
					//find regrex per line
				}//while
			}//try

			catch(IOException e){
				e.printStackTrace();
				System.exit(1);
			}//catch
		}//if
		
		String line = args[0];

		String regrex = args[1];
		
		Pattern p = Pattern.compile(regrex);

		Matcher m = p.matcher(line);

		boolean found = false;
		while(m.find()){
			System.out.println(m.start() + ":" + m.end());
			found = true;
		}//while
		if(!found){
			System.out.println("No Match Found.");
		}//if
	}//main
}//fmr class
