package common.cdk.cryption.blowfish;


import java.util.Map;

/** 
* 
*/ 
public class DSACoderTest { 

 
public void test() throws Exception { 
String inputStr = "abc"; 
byte[] data = inputStr.getBytes(); 

// 构建密钥 
Map<String, Object> keyMap = DSACoder.initKey(); 

// 获得密钥 
String publicKey = DSACoder.getPublicKey(keyMap); 
String privateKey = DSACoder.getPrivateKey(keyMap); 

System.err.println("公钥:\r" + publicKey); 
System.err.println("私钥:\r" + privateKey); 

// 产生签名 
String sign = DSACoder.sign(data, privateKey); 
System.err.println("签名:\r" + sign); 

// 验证签名 
boolean status = DSACoder.verify(data, publicKey, sign); 
System.err.println("状态:\r" + status); 
assertTrue(status); 

}

private void assertTrue(boolean status) {
	// TODO Auto-generated method stub
	
} 

} 

