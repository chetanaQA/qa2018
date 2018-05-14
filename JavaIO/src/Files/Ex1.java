package Files;

import java.io.File;

public class Ex1 {
	public static void main(String[] args) throws Exception
	{
		File x=new File("D://chethanaqa.xls");
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
//		 to delete files
		x.delete();
	}

}
