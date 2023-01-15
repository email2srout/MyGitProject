package IOTest;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenFileByDesktop {

	public static void main(String[] args) {
		String fpath = "D:\\JavaIO.txt";
		
		File f1 = new File(fpath);
		Desktop dp = Desktop.getDesktop();
		try {
			dp.open(f1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
