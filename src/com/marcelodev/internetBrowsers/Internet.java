package com.marcelodev.internetBrowsers;

public class Internet implements InternetBrowser{

	@Override
	public void displayPage() {
		System.out.println("displaying page");
		
	}

	@Override
	public void addNewTab() {
		System.out.println("adding new tab");
		
	}

	@Override
	public void updatePage() {
		System.out.println("updating page");
		
	}

}
