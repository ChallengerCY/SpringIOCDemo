package Demo;

public class People {
	/*定义一个人类 并且调用语言接口*/
	private language checkLague;

	public language getCheckLague() {
		return checkLague;
	}

	public void setCheckLague(language checkLague) {
		this.checkLague = checkLague;
	}
	/*写一个实现语言的方法*/
	public String say()
	{
		return this.checkLague.say();
	}
}
