package pdmotors;

public class stealCar {
	
	public void commitGTA() {
		System.out.println("Stealing Car");
		double skill = Math.random();
		skill = (int) (skill * 100);
		
		try {
			stealACar(skill);
		} catch (GetAway ge) { 
			System.out.println("Impressive!");
		} catch (PaynSpray pe) {
			System.out.println("Confirm color [Y/N]: Y");
			System.err.println("-$500");
		} catch (CheatCode ce) {
			System.out.println(":");
		} finally {
			System.out.println("I still don't condone this type of behavior!!!\n");
		}
	}

	public void stealACar(double skill) throws GetAway, PaynSpray, CheatCode {
		
		if(skill > 85) {
			throw new GetAway();
		} else if(skill > 45) {
			throw new PaynSpray();
		} else {
			throw new CheatCode();
		}
		
	} 
}
