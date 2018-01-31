package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Dx {

	public static void main(String[] args) throws IOException {
		File file=new File("D:\\0131作业\\dx\\d.txt");
		System.out.println(file.exists());//文件文件夹是否存在
		System.out.println(file.isFile());//判断是文件还是文件夹
		System.out.println(file.getName());//文件名
		System.out.println(file.isAbsolute());//绝对路径
		System.out.println(file.getParent());//父级路径
		System.out.println(file.length());//文件路径
		File file2=new File("D:\\0131作业\\xr");
		System.out.println(file2.mkdir());//创建文件夹
		File file3=new File("D:\\0131作业\\xr\\x.txt");
		System.out.println(file3.createNewFile());//创建文件

		InputStream is = new FileInputStream(file) ;
		byte[] b =new byte[(int)file.length()];
		is.read(b);
		String  str=new String(b);
		OutputStream d=  new FileOutputStream(file3);
		d.write(str.getBytes());
		file3.createNewFile();
		InputStream is1 = new FileInputStream(file3);
		byte[] by = new byte[1024];
		is1.read(by);
		String str1 = new String(by);
		System.out.println(str1);
		is.close();
		d.close();
		is1.close();
		
	}

}
