package com.marcelodev.entities;

import com.marcelodev.internetBrowsers.Internet;
import com.marcelodev.musicPlayers.Ipod;
import com.marcelodev.telephoneDevices.Phone;

public class IPhone {

	private Internet internet;
	private Ipod ipod;
	private Phone phone;

	public IPhone() {
		this.internet = new Internet();
		this.ipod = new Ipod();
		this.phone = new Phone();
	}

	public Internet getInternet() {
		return internet;
	}

	public void setInternet(Internet internet) {
		this.internet = internet;
	}

	public Ipod getIpod() {
		return ipod;
	}

	public void setIpod(Ipod ipod) {
		this.ipod = ipod;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

}
