package section5;

public class PassTest {
	float ptValue;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int val;
		
		//�������ʵ��
		PassTest pt = new PassTest ();
		
		//��������val��ֵ
		val = 11;
		
		//�ı�val��ֵ
		pt.changeInt(val);
		
		//val��ǰ��ֵ��ʲô�أ���ӡ��������
		System.out.println ("Int value is:"+ val);
		
		//���ַ���str��ֵ
		str = new String ("hello");
		
		//�ı�str��ֵ
		pt.changeStr(str);
		
		//��ǰstr��ֵ��ʲô�أ���ӡ��������
		System.out.println("Str value is:" + str);
		//���ڸ�ptvalue��ֵ
		pt.ptValue = 101f;
		
		//����ͨ���������ø�ֵ
		pt.changeObjValue(pt);
		
		//��ǰ��ֵ��ʲô
		System.out.println("Current ptvalue is:" + pt.ptValue);
	}
    //�޸ĵ�ǰֵ�ķ���
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
