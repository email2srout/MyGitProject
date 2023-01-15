package IOTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFilebyFileInputStream {

	public static void main(String[] args) {
		String fpath = "D:\\JavaIO.txt";
		FileInputStream fis = null;
		try {
			File f1 = new File(fpath);
			fis = new FileInputStream(f1);
			int c=0;
			try {
				while((c=fis.read())!=-1)
				{
					System.out.print((char)c);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
