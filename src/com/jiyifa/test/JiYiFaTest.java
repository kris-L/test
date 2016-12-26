package com.jiyifa.test;

import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;

import com.jiyifa.test.IoUtil;

public class JiYiFaTest {

	public static int count = 0;
	public static int HTTP_200 = 200;

	public static void main(String[] args) {
		
//		Test test = new Test();
//		//获取超级记忆的注册码
//		test.getRegistrationCode();
//		//获取闪电速算的注册码
//		test.getRegistrationCodeSuSuan();
		
		
		System.out.println("URI="+URI.create("http://www.czbbb.cn:8080/czbbb/czbbb.action?methoh=1000"));
		
	}

	/**
	 * 获取超级记忆的注册码
	 */
	public void getRegistrationCode(){
		//记忆吧软件机器码
		String str3="SVIPCVMhxuUF+XwMOELnyrBg5cLOCPCml83ejiyi8.cn";
		String str5 = "SVIP1WZw6wXCppnhl898oaXWjzQb94RJXj9Djiyi8.cn";
		String key = "jiyiJMBC";
		String code = "";
		try {
			code = DESUtil.encryptDES(str3, key);
			System.out.println("str3:"+code);
			code = DESUtil.encryptDES(str5, key);
			System.out.println("超级记忆特级:"+code);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取闪电速算的注册码
	 */
	public void getRegistrationCodeSuSuan(){
		//机器码
		String str1="OyHJHvGVcQYfNKlDLv6+gw==";
		String MEID_str2 = "A0000055A1F809";
		String key1_vip = "56654388";
		String key2_vip = "56654389";
		String key1_svip = "97532468";
		String key2_svip = "86432579";
		String code = "";
		try {
			String machine_code = DESUtilSuSuan.encryptDES(MEID_str2, "78346578");
			System.out.println("机器码:"+machine_code);
			String MEID = DESUtilSuSuan.decryptDES(str1, "78346578");
			System.out.println("MEID:"+MEID);
			code = DESUtilSuSuan.encryptDES(str1, key1_vip)+DESUtilSuSuan.encryptDES(str1, key2_vip);
			System.out.println("vipCode:"+code);
			code = DESUtilSuSuan.encryptDES(str1, key1_svip) + DESUtilSuSuan.encryptDES(str1, key2_svip);
			System.out.println("svipCoede:"+code);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
