
public class BMW extends Araba{

	private int cantKal�nl�g�;
	
	
	public int getCantKal�nl�g�() {
		return cantKal�nl�g�;
	}


	public void setCantKal�nl�g�(int cantKal�nl�g�) {
		this.cantKal�nl�g� = cantKal�nl�g�;
	}


	@Override
	public double yakitTuketimi() {
		
		return getAg�rl�k()*2;
	}




   
	
}
