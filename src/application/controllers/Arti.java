package application.controllers;
import java.util.Map;

import system.Application;
import system.Controller;

import application.views.ArtiSelect;
public class Arti extends Controller {
	public void edit(Map params){
		Application.getInstance();
		ArtiSelect ArtiSelect = new ArtiSelect();
		ArtiSelect.main(new String[0]);
	}
}