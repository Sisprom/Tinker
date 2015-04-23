package system;

import java.util.Map;
import java.util.HashMap;

import system.Loader;
import system.Config;
//import system.Params;
public class Tinker {
	private static Tinker instance = null;
	protected Tinker() {
		// Exists only to defeat instantiation.
		//this.run();
	}
	public static Tinker getInstance(){
		if(instance == null) {
			instance = new Tinker();
			System.out.print("Instancia Application iniciada\n");
		}else{
			System.out.print("Instancia Applicacion retornada\n");
		}
		return instance;
	}
	public void run(){
		Loader Loader = new Loader();
		Config Config = new Config();

		//Map map = new HashMap<String,Object>();
		//map.put("key", "value");

		Loader.Params params = Loader.new Params();
		params.add("clave", "valor");
		Loader.controller(Config.defaultController,params);
	}
}