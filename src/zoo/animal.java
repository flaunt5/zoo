package zoo;

public class animal {
	public String name;
	public boolean sex;
	public double weight;
	public double size;
	public int age;
	public boolean isSleeping;
	
	private float hungerIndicator;
	private float sleepIndicator;
	private float healthIndicator;
	
	private void eatFood(){
		if(sleepIndicator < 5 && isSleeping == false) {
			
		}
	}
	public String makeSound(String sound) {
		System.out.println(sound);
		return sound;
	}
	private void beNursed() {
		if(healthIndicator < 5) {
			
		}
	}
	public boolean sleepNow() {
		if(isSleeping == true){
			return isSleeping;
		}
		if(sleepIndicator < 5) {
			return isSleeping = true;
		}
		
		return false;
	}
	public boolean wakeUpNow() {
		if(isSleeping == true) {
			isSleeping = false;
		}
		
		return true;
	}
}
