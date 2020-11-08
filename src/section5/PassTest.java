package section5;

public class PassTest {
	float ptValue;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int val;
		
		//创建类的实例
		PassTest pt = new PassTest ();
		
		//给整形量val赋值
		val = 11;
		
		//改变val的值
		pt.changeInt(val);
		
		//val当前的值是什么呢？打印出来看看
		System.out.println ("Int value is:"+ val);
		
		//给字符串str赋值
		str = new String ("hello");
		
		//改变str的值
		pt.changeStr(str);
		
		//当前str的值是什么呢？打印出来看看
		System.out.println("Str value is:" + str);
		//现在给ptvalue赋值
		pt.ptValue = 101f;
		
		//现在通过对象引用改值
		pt.changeObjValue(pt);
		
		//当前的值是什么
		System.out.println("Current ptvalue is:" + pt.ptValue);
	}
    //修改当前值的方法
	public void changeInt(int value) {
		value = 55;
	}
	
	public void changeStr (String value) {
		value = new String ("different");
	}
	
	public void changeObjValue (PassTest ref) {
		ref.ptValue = 99f;
	}
}
