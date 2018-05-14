package Files;

import java.io.File;

public class Ex {
	public static void main(String[] args) throws Exception
	{
		File x=new File("D://chethana.xls");
		if(!x.exists())
		{
			x.createNewFile();
		}
		if(x.exists())
		{
			System.out.println("File Exits");
		}
//		to print absolute path
		System.out.println(x.getAbsolutePath());
	}

}
