import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("D:\\Vowels and Consonents");
		try {
			FileInputStream in=new FileInputStream(file+"\\Count");
			FileOutputStream out=new FileOutputStream(file+"\\Yes");
			int c;
			while((c=in.read())!=-1) {
				out.write(c);
			}
			in.close();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Check");
		System.out.println("This is checked");
		System.out.println("Today ");
	}

}
