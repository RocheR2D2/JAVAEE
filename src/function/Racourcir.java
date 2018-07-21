package function;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.tomcat.util.security.MD5Encoder;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

import sun.misc.BASE64Encoder;


public class Racourcir {

	public static String shortUrl(String url) {
		String key = "";
		
		String[] chars = new String[] { "a", "b", "c", "d", "e", "f", "g", "h",

				"i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",

				"u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",

				"6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H",

				"I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",

				"U", "V", "W", "X", "Y", "Z" };

				String sMD5EncryptResult = MD5(url);
				
			

				String hex = sMD5EncryptResult;

				String[] resUrl = new String[4];

				for (int i = 0; i < 4; i++) {


				String sTempSubString = hex.substring(i * 8, i * 8 + 8);


				long lHexLong = 0x3FFFFFFF & Long.parseLong(sTempSubString, 16);

				String outChars = "";

				for (int j = 0; j < 6; j++) {


				long index = 0x0000003D & lHexLong;


				outChars += chars[(int) index];

				lHexLong = lHexLong >> 5;

				}


				resUrl[i] = outChars;

				}
				
				String shortLink = "";
				for(int i=0; i< resUrl.length-1; i++) {
					shortLink += resUrl[i];
				}
				return shortLink;

				
	}
	
	public static String MD5(String key) {
        char hexDigits[] = {
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
        };
        try {
            byte[] btInput = key.getBytes();
         
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
          
            mdInst.update(btInput);
   
            byte[] md = mdInst.digest();
         
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            return null;
        }
    }
	
}
