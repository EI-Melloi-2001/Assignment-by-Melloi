package section11;
import java.io.*;
import java.io.Serializable;

public class ObjectRecov implements Serializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = null;
		try {
			FileInputStream fi = new FileInputStream("date.ser");
			ObjectInputStream si = new ObjectInputStream(fi);
			stu = (Student)si.readObject();
					si.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("ID:"+stu.id+"name:"+
		stu.name+"age:"+stu.age+"dept"+stu.department);

	}

}
