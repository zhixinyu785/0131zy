package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Dx {

	public static void main(String[] args) throws IOException {
		File file=new File("D:\\0131��ҵ\\dx\\d.txt");
		System.out.println(file.exists());//�ļ��ļ����Ƿ����
		System.out.println(file.isFile());//�ж����ļ������ļ���
		System.out.println(file.getName());//�ļ���
		System.out.println(file.isAbsolute());//����·��
		System.out.println(file.getParent());//����·��
		System.out.println(file.length());//�ļ�·��
		File file2=new File("D:\\0131��ҵ\\xr");
		System.out.println(file2.mkdir());//�����ļ���
		File file3=new File("D:\\0131��ҵ\\xr\\x.txt");
		System.out.println(file3.createNewFile());//�����ļ�

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
