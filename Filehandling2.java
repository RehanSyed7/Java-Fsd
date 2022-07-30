import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Append {
	public static void main(String[] args) throws IOException {
		FileOutputStream fo = new FileOutputStream("input", true);
		if (fo != null) {
			System.out.println("file created and opened in write mode and appended");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input for the file ");
//sc.next(),sc.nextLine()
		String fileinput = sc.nextLine();
//convert char into bytes
		byte b[] = fileinput.getBytes();
		fo.write(b);
		System.out.println("write operation completed");
		fo.close();
	}
}