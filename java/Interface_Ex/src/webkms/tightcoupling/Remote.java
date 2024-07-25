package webkms.tightcoupling;

public class Remote {
	private Tv tv;
	public Remote() {
		tv = new Tv("samsung");
	}
	
	public void turnOnTv() {
		this.tv.powerOn();
	}
}
