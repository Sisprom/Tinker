package system;

import java.util.Map;
import java.util.HashMap;

import system.Loader;
import system.Config;
public class Application {
	private static Application instance = null;
	protected Application() {
		// Exists only to defeat instantiation.
		//this.run();
	}
	public static Application getInstance(){
		if(instance == null) {
			instance = new Application();
			System.out.print("Instancia Application iniciada\n");
		}else{
			System.out.print("Instancia Applicacion retornada\n");
		}
		return instance;
	}
	public void run(){
		Loader Loader = new Loader();
		Config Config = new Config();
		Map map = new HashMap();
		map.put("key", "value");
		Loader.controller(Config.defaultController,map);
	}
}
