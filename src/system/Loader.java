package system;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.HashMap;
public class Loader {
	public void invokeClassMethod(String classBinName, String methodName, Map params){
		try {
			ClassLoader classLoader = this.getClass().getClassLoader();
			Class loadedMyClass = classLoader.loadClass(classBinName);
			System.out.println("Loaded class name: " + loadedMyClass.getName());
			Constructor constructor = loadedMyClass.getConstructor();
			Object myClassObject = constructor.newInstance();
			Method method = loadedMyClass.getMethod(methodName, Map.class);
			//Method method = loadedMyClass.getDeclaredMethod(methodName);
			params.put("key2", "value2");
			System.out.println("Invoked method name: " + method.getName());
			method.invoke(myClassObject, params);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void controller(String path, Map params){
		String[] path_parts = path.split("/");
		if(path_parts.length==2){
			String controller = path_parts[0];
			String method = path_parts[1];
			this.invokeClassMethod("application.controllers."+controller, method, params);
		}
	}
	public void model(String path, Map params){
		String[] path_parts = path.split("/");
		if(path_parts.length==2){
			String model = path_parts[0];
			String method = path_parts[1];
			this.invokeClassMethod("application.models."+model, method, params);
		}
	}
	public void view(String path, Map params){
		String[] path_parts = path.split("/");
		if(path_parts.length==2){
			String view = path_parts[0];
			String method = path_parts[1];
			this.invokeClassMethod("application.views."+view, method, params);
		}
	}
}