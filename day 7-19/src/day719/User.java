package day719;

public class User {
	public void wash() throws InterruptedException{
		Thread.sleep(1000);
	}
	
	
	public void setNickName(String nick) throws BadWordException {
		if(nick.equals("�ٺ�")) {
			throw new BadWordException("�ٺ���� �Էµ�");
		}else if(nick.equals("��û��")) {
			throw new BadWordException("��û�̶�� �Էµ�");
		}
		System.out.println("�г����� " + nick + "���� �����Ǿ����ϴ�");
		
		
	}
}
