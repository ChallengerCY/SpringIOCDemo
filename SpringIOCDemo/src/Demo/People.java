package Demo;

public class People {
	/*����һ������ ���ҵ������Խӿ�*/
	private language checkLague;

	public language getCheckLague() {
		return checkLague;
	}

	public void setCheckLague(language checkLague) {
		this.checkLague = checkLague;
	}
	/*дһ��ʵ�����Եķ���*/
	public String say()
	{
		return this.checkLague.say();
	}
}
