package ronald.collins_FileIO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FileIO {

	static String fileName = "moves.txt";
	
	public static void main(String[] args) {
		args[0] = fileName;

	}
	
	
	public void ReadAFile(String fileName){
		
		BufferedReader reader = null;
		try {
			reader = new BufferedReader((new FileReader(fileName)));
			String line = null;
			while((line = reader.readLine()) != null){
				MoveOnePieceCheck(line);
				MoveTwoPiecesCheck(line);
				CaptureAPieceCheck(line);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
	}


	private void CaptureAPieceCheck(String line) {
		String pattern = "";
		Pattern whatToLookFor = Pattern.compile(pattern);
		Matcher match = whatToLookFor.matcher(line);
		
		if(match.find()){
			
			
		}
		
	}


	private void MoveTwoPiecesCheck(String line) {
		String pattern = "";
		Pattern whatToLookFor = Pattern.compile(pattern);
		Matcher match = whatToLookFor.matcher(line);
		
		if(match.find()){
			
			
		}
		
	}


	private void MoveOnePieceCheck(String line) {
		String pattern = "";
		Pattern whatToLookFor = Pattern.compile(pattern);
		Matcher match = whatToLookFor.matcher(line);
		
		if(match.find()){
			
			
		}
		
	}
	

}
