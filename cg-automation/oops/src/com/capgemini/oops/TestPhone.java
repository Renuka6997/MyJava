package com.capgemini.oops;

public class TestPhone {
	public static void main(String[] args) {
		FirstGen fg = new FirstGen();
		fg.msg();
		fg.call();

		System.out.println("-----------");

		SecondGen sg = new SecondGen();
		sg.msg();
		sg.call();
		sg.games();
		sg.torch();
		SecondGen.block();

		System.out.println("-----------------");

		ThirdGen tg = new ThirdGen();
		tg.msg();
		tg.call();
		tg.games();
		tg.torch();
		tg.camera();
		tg.music();

		System.out.println("****************************");
	}
}
