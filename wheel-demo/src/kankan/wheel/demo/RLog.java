package kankan.wheel.demo;

import android.util.Log;

public class RLog {

	private static final boolean debug = true;
	
	public static void e(String tag,String log){
		if(debug){
			Log.e(tag,log);
		}
	}
	
	public static void d(String tag,String log){
		if(debug){
			Log.d(tag,log);
		}
	}
	
	public static void i(String tag,String log){
		if(debug){
			Log.i(tag,log);
		}
	}
	
	public static void v(String tag,String log){
		if(debug){
			Log.v(tag,log);
		}
	}
	
	public static void w(String tag,String log){
		if(debug){
			Log.w(tag,log);
		}
	}
	
}