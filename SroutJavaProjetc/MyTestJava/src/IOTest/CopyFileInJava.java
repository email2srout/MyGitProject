package IOTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileInJava {

	public static void main(String[] args) {
		String Ofpath = "D:\\JavaIO.txt";
		String Nfpath = "D:\\NJavaIO.txt";
		File Of = new File(Ofpath);
		File Nf = new File(Nfpath);
		FileInputStream fis1 = null;
		FileOutputStream fos1 = null;
		try
		{
		fis1 = new FileInputStream(Ofpath);
		fos1 = new FileOutputStream(Nfpath);
		
		int c=0;
		while((c=fis1.read())!=-1)
		{
			System.out.print((char)c);
			fos1.write(c);
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				fis1.close();
				fos1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

	}

}
