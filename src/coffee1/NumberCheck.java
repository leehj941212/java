package coffee1;

import com.sun.xml.internal.ws.util.StringUtils;

public class NumberCheck {


	public boolean isNumber(String numberStr) {

		if (numberStr == null || numberStr.length() == 0)
			return false;

		boolean isNumber = true;
		char[] numberCharArray = numberStr.toCharArray();

		for (int i = 0; i < numberCharArray.length; i++) {
			char numberChar = numberCharArray[i];
			int asciiNumber = (int) numberChar;
			
			if(48 <= asciiNumber && asciiNumber <= 57)
				isNumber = true;
			else 
				isNumber = false;
			
			if(!isNumber)
				break;
		}

		return isNumber;
	}

}
