package section11;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Objectser implements Serializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student(9810236, "Li Ming", 16, "CSD");
		try {
			FileOutputStream fo = new FileOutputStream("date.ser");
			ObjectOutputStream so = new ObjectOutputStream(fo);
			so.writeObject(stu);
			so.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
