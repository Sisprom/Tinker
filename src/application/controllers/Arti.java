package application.controllers;
import java.util.Map;

import system.Tinker;
import system.Controller;

import application.views.ArtiSelect;
public class Arti extends Controller {
	public void edit(Params params){
		Tinker.getInstance();
		ArtiSelect ArtiSelect = new ArtiSelect();
		ArtiSelect.main(new String[0]);
		System.out.print(params.get("clave"));
	}
}