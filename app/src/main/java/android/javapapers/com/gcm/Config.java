package android.javapapers.com.gcm;

public interface Config {

	// used to share GCM regId with application server - using php app server
	static final String APP_SERVER_URL = "http://budnetdesign.in/jaycee/api/post_user/1022H/1022H/";

	// GCM server using java
	// static final String APP_SERVER_URL =
	// "http://192.168.1.17:8080/GCM-App-Server/GCMNotification?shareRegId=1";

	// Google Project Number
	static final String GOOGLE_PROJECT_ID = "991479771443";
	static final String MESSAGE_KEY = "message";

}
