package caffe;

public abstract class Decorator implements Caffe {
	private Caffe caffe;
	
	public Decorator (Caffe caffe) {
		this.caffe = caffe;
	}
	
	@Override
	public void faiCaffe() {
		caffe.faiCaffe();
	}
}
