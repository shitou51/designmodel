package designmodel.memento;

public class Client {
	public static void main(String[] args) {
		UserInfoDTO dto = new UserInfoDTO();
		dto.setAccount("丁小帅");
		dto.setPassword("密码");
		dto.setTelNo("11111111111");
		dto.show(); 
		
		Memento memento = dto.saveMemento();
		Caretaker caretake = new Caretaker();
		caretake.setMemento(memento);
		
		dto.setAccount("丁小帅2");
		dto.setPassword("密码2");
		dto.setTelNo("22222222222");
		dto.show(); 
		
		dto.restoreMemento(caretake.getMemento());
		
		dto.show(); 
		
	}
}
