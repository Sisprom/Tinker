package application.controllers;

import java.util.Map;
import java.util.HashMap;

import system.Application;
import system.Controller;

import application.views.ArtiSelect;
public class Arti extends Controller {
	public void edit(Map params){
		System.out.print("controlador de edicion");
		Application.getInstance();
		ArtiSelect ArtiSelect = new ArtiSelect();
		ArtiSelect.main(new String[0]);
	}
}
