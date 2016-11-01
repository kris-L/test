package com.kris.test;

import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import com.kris.test.IoUtil;;

public class Test {

	public static int count = 0;
	public static int HTTP_200 = 200;

	public static void main(String[] args) {

//		ResponseInfo<String> paramAnonymousResponseInfo = new ResponseInfo<String>(null, "", true);
//		paramAnonymousResponseInfo.result = "账号未登录或密码错误";
//		String testStr = (String)paramAnonymousResponseInfo.result;
//		System.out.println("a="+testStr.contains("账号"));
//		
//		paramAnonymousResponseInfo.result = "<p>账号:445000968</p><p>发送:31MB</p><p>接收:23MB</p><p>总量:1023998976MB</p><p>剩余:1023998922MB</p><p>注册时间:2016-10-04</p><p>到期时间:2016-11-03</p><p>剩余天数:21";
//		testStr = (String)paramAnonymousResponseInfo.result;
//		String a = "账号未登录或密码错误";
//		String b = "<p>账号:445000968</p><p>发送:31MB</p><p>接收:23MB</p><p>总量:1023998976MB</p><p>剩余:1023998922MB</p><p>注册时间:2016-10-04</p><p>到期时间:2016-11-03</p><p>剩余天数:21";
//		System.out.println("a="+testStr.contains("账号"));
//		System.out.println("b="+testStr.contains("账号"));
		
	}


	public static void requestByPost() throws Throwable {
		String path = "https://reg.163.com/logins.jsp";
		// ����Ĳ���ת��Ϊbyte����
		String params = "id=" + URLEncoder.encode("helloworld", "UTF-8")
				+ "&pwd=" + URLEncoder.encode("android", "UTF-8");
		byte[] postData = params.getBytes();
		// �½�һ��URL����
		URL url = new URL(path);
		// ��һ��HttpURLConnection����
		HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
		// �������ӳ�ʱʱ��
		urlConn.setConnectTimeout(5 * 1000);
		// Post������������������
		urlConn.setDoOutput(true);
		// Post������ʹ�û���
		urlConn.setUseCaches(false);
		// ����ΪPost����
		urlConn.setRequestMethod("POST");
		urlConn.setInstanceFollowRedirects(true);
		// ��������Content-Type
		urlConn.setRequestProperty("Content-Type",
				"application/x-www-form-urlencode");
		// ��ʼ����
		urlConn.connect();
		// �����������
		DataOutputStream dos = new DataOutputStream(urlConn.getOutputStream());
		dos.write(postData);
		dos.flush();
		dos.close();
		// �ж������Ƿ�ɹ�
		if (urlConn.getResponseCode() == HTTP_200) {
			// ��ȡ���ص�����
			String data = IoUtil.readStreamToString(urlConn.getInputStream());
			System.out.println("data="+data);
		} else {
			System.out.println("Post方式请求失败");
		}
	}
	
	public void getRegistrationCode(){
		//记忆吧软件注册码
//		String str3="SVIPCVMhxuUF+XwMOELnyrBg5cLOCPCml83ejiyi8.cn";
//		String key = "jiyiJMBC";
//		String code = "";
//		String str5 = "SVIP1WZw6wXCppnhl898oaXWjzQb94RJXj9Djiyi8.cn";
//		try {
//			code = DESUtil.encryptDES(str5, key);
//			System.out.println("str5:"+code);
//			code = DESUtil.encryptDES(str3, key);
//			System.out.println("str3:"+code);
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
}
