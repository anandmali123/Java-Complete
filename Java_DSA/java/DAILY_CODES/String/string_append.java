import java.io.*;
import java.util.*;

class Stringappend{
	public static void main(String[] args){
		String str1="shashi";
		String str2=new String("Bagal");
		StringBuffer str3=new StringBuffer("Core2web");

		StringBuffer str4=str3.append(str1);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}

