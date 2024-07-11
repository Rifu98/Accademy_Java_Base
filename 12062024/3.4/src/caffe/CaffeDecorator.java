package caffe;

public class CaffeDecorator extends Decorator{
	public  CaffeDecorator (Caffe caffe) {
		super(caffe);
	}
	
	@Override
	public void faiCaffe() {
		super.faiCaffe();
		mettiZucchero();
	}
	
	private void mettiZucchero () {
		System.out.println("Metti zucchero, tu persona dai gusti discutibili!");
	}
}
