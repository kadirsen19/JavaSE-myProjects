
public class BMW extends Araba{

	private int cantKalınlıgı;
	
	
	public int getCantKalınlıgı() {
		return cantKalınlıgı;
	}


	public void setCantKalınlıgı(int cantKalınlıgı) {
		this.cantKalınlıgı = cantKalınlıgı;
	}


	@Override
	public double yakitTuketimi() {
		
		return getAgırlık()*2;
	}




   
	
}
