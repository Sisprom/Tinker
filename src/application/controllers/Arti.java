package application.controllers;
import system.Application;
import system.Controller;

import application.views.ArtiSelect;
public class Arti extends Controller {
	public void edit(){
		Application.getInstance();
		ArtiSelect ArtiSelect = new ArtiSelect();
		ArtiSelect.main(new String[0]);
	}
}
