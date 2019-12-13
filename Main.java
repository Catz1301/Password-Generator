import java.util.*;
import java.util.stream.*;
import java.lang.*;
import java.lang.reflect.*;
import java.io.*;

class strArray {
		// Create and initialize string
		String mew = "";

		// Function to read and print a String[], but without brackets or commas
		public void Read(String[] toRead, int elemNum, boolean clrConsole) throws IOException {
			
			for (int i = 0; i < elemNum; i++) {
				mew = mew + toRead[i] + " ";
				System.out.println(toRead[i]);
				System.out.println(mew);
			}
		}
		
		// Function to create String[] arrays from file contents
		public String[] fileToArray(String filePath, String[] stringArrayOutput) throws FileNotFoundException, IOException {
			
			BufferedReader in = new BufferedReader(new FileReader(filePath));
			String str;

			List<String> list = new ArrayList<String>();
			
			while((str = in.readLine()) != null) {
	    		list.add(str);
			}

			stringArrayOutput = list.toArray(new String[0]);
			
			return stringArrayOutput;
		}

}

class Main {
	public static String hr = "******************************";
	
	public static void main(String[] args) {
		strArray strarr = new strArray();
		String[] example = null;
		try {
			String[] arrayedString = strarr.fileToArray("unicodeChar.txt", example);
			
			Scanner scn = new Scanner(System.in);
			print("How long should the password be? ");
			int passLen = scn.nextInt();
			println("Okay.\nPassword is:\n\n");
			Random rnd = new Random();
			for (int i = 0; i < passLen; i++) {
				print(arrayedString[rnd.nextInt(arrayedString.length-1)]);
			}
		}
		catch (Exception fnfe) {
			println(fnfe.getMessage());
		}
		
		
	}
	
	
	public static void println(int x) {
		System.out.println(x);
	}

	public static void println(double x) {
		System.out.println(x);
	}

	public static void println(float x) {
		System.out.println(x);
	}
	
	public static void println(boolean x) {
		System.out.println(x);
	}

	public static void println(String x) {
		System.out.println(x);
	}

	public static void print(int x) {
		System.out.print(x);
	}

	public static void print(double x) {
		System.out.print(x);
	}

	public static void print(float x) {
		System.out.print(x);
	}
	
	public static void print(boolean x) {
		System.out.print(x);
	}

	public static void print(String x) {
		System.out.print(x);
	}
}