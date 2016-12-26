package com.kris.test;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;


public class ServiceTest {

	public static void main(String[] args) {

		long t = System.currentTimeMillis();
		System.out.println("begin time:" + t);
//		String url = "http://localhost:8080/iecarppvip-test/app/getEtcType";
//		String url = "http://192.168.1.205:9999/iecarppvip/statistics/chronologicalStatistics";
		String url = "http://www.czbbb.cn:8080/czbbb/czbbb.action?methoh=1000&deviceId=1000";
//		String url = "http://localhost:8080/iecarppvip-test/mallManage/login";
//		String url = "http://192.168.1.205:9999/iecarppvip/mallManage/goodsList";
//		String url = "http://test.chepaipai.com.cn:9999/iecarppvip/app/notifyEtcOrder";
		Map<String, Object> params = new HashMap<String, Object>();
//		params.put("bniId", 1870);
//		params.put("autoId", 9);
/*		params.put("loginName", "13800138000");
		params.put("passWord", "7945bd83237335e5376ff44d62e4f0ae");*/
		
//		params.put("methoh", "1000");
//		params.put("deviceId", "1000");
		params.put("loginId", 1);
		params.put("password", 1);
		params.put("userType", 0);
		params.put("deviceId", 0);
		
//		params.put("userId", 1);
//		params.put("loginId", 36);
//		params.put("order", "year");
//		params.put("type", 2);
//		params.put("goodsId", 234);
//		params.put("goodsModelId", 242);
//		params.put("token", "1");
//		params.put("bankId", 1);
//		params.put("objId", 216);
//		params.put("resIds", "37,38");
//		params.put("page", 1);
//		params.put("count", 5);
//		params.put("brandId", 145);
//		params.put("goodsModelId", 2);
//		params.put("type", 2);
//		params.put("name", "T");
//		params.put("orderId", 2);
		
		
/*		params.put("groupId", 5);
		params.put("userId", 1130);
		params.put("loginId", 1061);
		params.put("prestoreId", 4372);*/
		
/*		params.put("orderId", 1);
		params.put("courierNo", "A488S78S877");*/
/*		params.put("type", 3);
		params.put("resIds", "35,36");
		params.put("objId", 216);*/
//		params.put("type", 2);
//		params.put("count", 1);
/*		params.put("name", "xxxxxx");
		params.put("address", "xxxxxxxx");
		params.put("contactNo", "020-8582767");*/
		
		/*params.put("goodsModelId", 241);
		params.put("editType", 0);
		params.put("goodsId", 234);
		params.put("goodsTypeId", 1);
		params.put("brands", "好家风1132");
		params.put("goodsName", "测试1");
		params.put("unit", "件113");
		params.put("csn", "113");
		params.put("spec", "6898556A8SFD113");
		params.put("model", "AD-4411132");
		params.put("iconUrl", "");
		params.put("unitPrice", 523);
		params.put("carsLineIds", "522,525");
		params.put("goodsModelImg", "m11132.jpg,m22232.jpg");
		params.put("goodsDetailType", "1");
		params.put("goodsDetails", "s11132.jpg,s22232.jpg");
		JSONArray array = new JSONArray();
		JSONObject object1 = new JSONObject();
		object1.put("mpTitle", "title132");
		object1.put("mpResource", "resource132");
		array.add(object1);
		JSONObject object2 = new JSONObject();
		object2.put("mpTitle", "title232");
		object2.put("mpResource", "resource232");
		array.add(object2);
		params.put("modeParam", array);
		*/
		
//		params.put("goodsModelId", 8);
//		params.put("name", "L");
		
//		params.put("userId", 1);
//		params.put("loginId", 36);
//		params.put("withdrawPrice", 1);
//		params.put("bankId", 3);
//		params.put("count", 36);
//		params.put("type", 3);
//		params.put("focus", 1);
//		params.put("loginName", "13800138000");
//		params.put("passWord", "13800138000");
		
//		params.put("etcOrderId", 14);
//		params.put("carNum", "粤A66663");
//		params.put("name", "jiete21");
//		params.put("phone", "15989776898");
//		params.put("etcTypeId", 1);
//		params.put("type", 5);
//		params.put("systype", 1);
//		params.put("version", "1.0.2");
//		params.put("apptype", 1);
//		params.put("userId", 201);
//		params.put("loginId", 9);	
//		params.put("bankCode", "6210986020014044809");
//		params.put("orderId", 1);
//		params.put("pcrId", 1);

//		params.put("bankId", 1);
//		params.put("withdrawPrice", 1);
//		params.put("sDate", "2016-08-03");
		
//		params.put("condition", "1");
//		params.put("gdiId", 1);
//		params.put("phone", "15989779899");
//		params.put("type", 1);
//		params.put("focus", 1);

//		params.put("goodsName", "机油");
//		params.put("unitPrice", 8);
//		params.put("unit", "瓶");
//		params.put("specifications", "xxL");
//		params.put("model", "aassdddd");
//		params.put("warningCount", 11);
//		JSONArray array = new JSONArray();
//		JSONObject object1 = new JSONObject();
//		object1.put("orderId", 1);
//		object1.put("vipTypeId", 0);
//		object1.put("price", 90);
//		array.add(object1);
//		JSONObject object2 = new JSONObject();
//		object2.put("orderId", 35);
//		object2.put("vipTypeId", 424);
//		object2.put("price", 70);
//		array.add(object2);
//		JSONObject object3 = new JSONObject();
//		object3.put("gspId", 4);
//		object3.put("vipTypeId", 781);
//		object3.put("price", 60);
//		array.add(object3);
//		
//		params.put("etcOrder", array);
		for (int i = 0; i < 1; i++) {
			RestTemplate restTemplate = new RestTemplate();
			HttpHeaders headers = new HttpHeaders();
			MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
			headers.setContentType(type);
			headers.add("Accept", MediaType.APPLICATION_JSON.toString());
			JSONObject jsonObj = JSONObject.fromObject(params);
			System.out.println(jsonObj);
			HttpEntity<String> formEntity = new HttpEntity<String>(jsonObj.toString(),headers);
			String result = restTemplate.postForObject(URI.create(url), formEntity, String.class);
			System.out.println(result);
			long e = System.currentTimeMillis();
			System.out.println("end time:" + e);
			System.out.println("use time:" + (e-t));
		}

//		JSONObject jsonResult = JSONObject.fromObject(result);
//
//		System.out.println(jsonResult.get("code") + "--" + jsonResult.get("detail") + "--" + (jsonResult.get("result") != null ? jsonResult.get("result") : ""));
		
	/*List<Map<String, Object>> orderList = new ArrayList<Map<String,Object>>();
		for (int i = 0; i < 3; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("status", 5);
			map.put("score", 3);
			map.put("money", 200);
			orderList.add(map);
		}

		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("status", 3);
		map2.put("score", 6);
		map2.put("money", 600);
		orderList.add(map2);
		
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("status", 2);
		map1.put("score", 12);
		map1.put("money", 600);
		orderList.add(map1);
		System.out.println(orderList.toString());
		
		List<Map<String, Object>> newOrderList = new ArrayList<Map<String,Object>>();
		
		for (int i = 0; i < orderList.size(); i++) {
			Map<String, Object> map = orderList.get(i);
			
			if (map.get("status").toString().equals("5")) {
				
				orderList.remove(map);
				i -= 1;
			}
		
		}
		
		System.out.println(orderList.toString());*/
		
/*		long t1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            String s0 = Integer.toString(11);
        }
        System.out.println("耗时" + (System.currentTimeMillis() - t1));
        
		 t1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            String s0 = String.valueOf(11);
        }
        System.out.println("耗时" + (System.currentTimeMillis() - t1));
  
        t1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            String s = 11+"";
        }
        System.out.println("耗时" + (System.currentTimeMillis() - t1));
          
        String str = "";
        t1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            String s = str + 11;
        }
        System.out.println("耗时" + (System.currentTimeMillis() - t1));*/
		
//		List<JSONObject> array = jsonResult.getJSONArray("result");
//		for (JSONObject item : array) {
//
//			System.out.println(item.get("address"));
//		}
		
		
/*		List<Map<String, Object>> orderList = new ArrayList<Map<String,Object>>();
		for (int i = 0; i < 3; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("status", 5);
			map.put("score", 3);
			map.put("money", 200);
			orderList.add(map);
		}

		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("status", 3);
		map2.put("score", 6);
		map2.put("money", 600);
		orderList.add(map2);
		
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("status", 2);
		map1.put("score", 12);
		map1.put("money", 600);
		orderList.add(map1);
		
		System.out.println(orderList.toString());
		
    	Map<String, Object> result = new HashMap<String, Object>();

    	for (Map<String, Object> item : orderList) {
			int key = (Integer) item.get("status");
    		
			if (result.containsKey(key+"")) { 
				
				Map<String, Object> exist = (Map<String, Object>) result.get(key+"");
				exist.put("score", (new BigDecimal(exist.get("score")+"").add(new BigDecimal(item.get("score")+""))));
				exist.put("money", (new BigDecimal(exist.get("money")+"").add(new BigDecimal(item.get("money")+""))));
			} else {
				
				result.put(key + "", item);
			}
		}
    	
    	System.out.println(result.toString());
    	
    	orderList.clear();
    	
    	for (Map.Entry<String, Object> entry : result.entrySet()) {
			
    		orderList.add((Map<String, Object>) entry.getValue());
		}
    	
    	System.out.println(orderList.toString());*/
		
		
/*		//一对多返回数据处理
		Long beginTime = System.currentTimeMillis();
		
		List<Object []> list = new ArrayList<Object[]>();
		Object [] objects1 = {1,2,3,4,5,1,1,1,1,1};
		list.add(objects1);
		Object [] objects2 = {1,2,3,4,5,2,2,2,2,1};
		list.add(objects2);
		Object [] objects3 = {1,2,3,4,5,3,3,3,3,1};
		list.add(objects3);
		Object [] objects4 = {2,2,2,2,2,4,4,4,4,2};
		list.add(objects4);
		Object [] objects5 = {2,2,2,2,2,5,5,5,5,2};
		list.add(objects5);
		Object [] objects6 = {3,3,3,3,3,6,6,6,6,3};
		list.add(objects6);
		Object [] objects7 = {4,4,4,4,4,1,1,1,1,4};
		list.add(objects7);
		Object [] objects8 = {4,4,4,4,4,2,2,2,2,4};
		list.add(objects8);
		Object [] objects9 = {5,5,5,5,5,3,3,3,3,5};
		list.add(objects9);
		Object [] objects10 = {6,6,6,6,6,4,4,4,4,6};
		list.add(objects10);
		Object [] objects11 = {6,6,6,6,6,5,5,5,5,6};
		list.add(objects11);
		Object [] objects12 = {7,7,7,7,7,6,6,6,6,7};
		list.add(objects12);
		
		System.out.println(list.toString());
		
		List<Map<String, Object>> pList = new ArrayList<Map<String, Object>>();
		Map<String, Object> parent = null;
		List<Map<String, Object>> cList = null;
		Map<String, Object> child = null;
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		for (Object[] object : list) {
			
			int key = Integer.parseInt(object[0]+"");
			
			if (map.containsKey(key+"")) {
				
				child = new HashMap<String, Object>();
				child.put("id", object[5]);
				child.put("keyword", object[6]);
				child.put("keyvalue", object[7]);
				child.put("sort", object[8]);
				child.put("fid", object[9]);
				cList.add(child);
				
			} else {
				cList = new ArrayList<Map<String, Object>>();
				child = new HashMap<String, Object>();
				child.put("id", object[5]);
				child.put("keyword", object[6]);
				child.put("keyvalue", object[7]);
				child.put("sort", object[8]);
				child.put("fid", object[9]);
				cList.add(child);
				
				parent = new HashMap<String, Object>();
				parent.put("id", object[0]);
				parent.put("name", object[1]);
				parent.put("age", object[2]);
				parent.put("sex", object[3]);
				parent.put("address", object[4]);
				parent.put("cList", cList);
				pList.add(parent);
				
				map.put(key+"", object);
			}
		}
		
		System.out.println(pList.toString());
		
		Long endTime = System.currentTimeMillis();
		
		System.out.println("Begin time:" + beginTime + ", End time:" + endTime + ", Run time:" + (endTime - beginTime));*/
		
//		String sql = "select * from VIOLATIONQUERYORDER_VQO vqo";
//		System.out.println(page(sql, 0, 10));
		
	}
	
	
	/** 
     * 将一个 JavaBean 对象转化为一个  Map 
     * @param bean 要转化的JavaBean 对象 
     * @return 转化出来的  Map 对象 
     * @throws IntrospectionException 如果分析类属性失败 
     * @throws IllegalAccessException 如果实例化 JavaBean 失败 
     * @throws InvocationTargetException 如果调用属性的 setter 方法失败 
     */  
    @SuppressWarnings({ "rawtypes", "unchecked" })  
    public static Map convertBean(Object bean)  
            throws IntrospectionException, IllegalAccessException, InvocationTargetException {  
        Class type = bean.getClass();  
        Map returnMap = new HashMap();  
        BeanInfo beanInfo = Introspector.getBeanInfo(type);  
  
        PropertyDescriptor[] propertyDescriptors =  beanInfo.getPropertyDescriptors();  
        for (int i = 0; i< propertyDescriptors.length; i++) {  
            PropertyDescriptor descriptor = propertyDescriptors[i];  
            String propertyName = descriptor.getName();  
            if (!propertyName.equals("class")) {  
                Method readMethod = descriptor.getReadMethod();  
                Object result = readMethod.invoke(bean, new Object[0]);  
                if (result != null) {  
                    returnMap.put(propertyName, result);  
                } else {  
                    returnMap.put(propertyName, "");  
                }  
            }  
        }  
        return returnMap;  
    }

    /** 
     * 将一个 Map 对象转化为一个 JavaBean 
     * @param type 要转化的类型 
     * @param map 包含属性值的 map 
     * @return 转化出来的 JavaBean 对象 
     * @throws IntrospectionException 如果分析类属性失败 
     * @throws IllegalAccessException 如果实例化 JavaBean 失败 
     * @throws InstantiationException 如果实例化 JavaBean 失败 
     * @throws InvocationTargetException 如果调用属性的 setter 方法失败 
     */  
    @SuppressWarnings("rawtypes")  
    public static Object convertMap(Class type, Map map)  
            throws IntrospectionException, IllegalAccessException,  
            InstantiationException, InvocationTargetException {  
        BeanInfo beanInfo = Introspector.getBeanInfo(type); // 获取类属性  
        Object obj = type.newInstance(); // 创建 JavaBean 对象  
  
        // 给 JavaBean 对象的属性赋值  
        PropertyDescriptor[] propertyDescriptors =  beanInfo.getPropertyDescriptors();  
        for (int i = 0; i< propertyDescriptors.length; i++) {  
            PropertyDescriptor descriptor = propertyDescriptors[i];  
            String propertyName = descriptor.getName();  
  
            if (map.containsKey(propertyName)) {  
                // 下面一句可以 try 起来，这样当一个属性赋值失败的时候就不会影响其他属性赋值。  
                Object value = map.get(propertyName);  
  
                Object[] args = new Object[1];  
                args[0] = value;  
  
                descriptor.getWriteMethod().invoke(obj, args);  
            }  
        }  
        return obj;  
    }
    
    
    public static String page(String sql, int pageNo, int pageSize){
    	
    	if (pageNo < 1) pageNo = 1;
    	if (pageSize < 1) pageSize = 10;
    	return "select * from (select a.*, rownum rn from (" + sql + ") a where rownum <= " + (pageSize*pageNo) +") where rn > " + (pageSize*(pageNo-1));
    }
    
	
}
