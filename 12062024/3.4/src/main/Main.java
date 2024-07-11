package main;

import caffe.*;

public class Main {
	public static void main (String[] args) {
		Caffe caffe = new ConcreteCaffe();
		Caffe decorator = new CaffeDecorator(caffe);
		decorator.faiCaffe();
	}
}
