package com.marcelodev.aplicattion;

import com.marcelodev.entities.IPhone;

public class IphoneApp {

	public static void main(String[] args) {

		IPhone iphone = new IPhone();
		
		/*
		 * poderia ter um switch case
		 * para interação com o usuário 
		 * */

		System.out.println("INTERNET");
		System.out.println();
		iphone.getInternet().addNewTab();
		iphone.getInternet().displayPage();
		iphone.getInternet().updatePage();
		System.out.println();

		System.out.println("IPOD");
		System.out.println();
		iphone.getIpod().touch();
		iphone.getIpod().pause();
		iphone.getIpod().selectMusic();
		System.out.println();

		System.out.println("PHONE");
		System.out.println();
		iphone.getPhone().toConect();
		iphone.getPhone().toMeet();
		iphone.getPhone().startVoicemail();

	}

}
