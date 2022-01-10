package Calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCalculator {

    public static int splitAddSum(String str) {
        if (str == null) {
            str = "";
        }
        if (str.isEmpty()) {
            return 0;
        }
        if (str.length() == 1) {
            return Integer.parseInt(str);
        }

        if (str.lastIndexOf(",") > 0 && str.lastIndexOf(":") < 0) {
            int result = 0;
            String[] strNumbers = str.split(",");
            for (int i = 0; i < strNumbers.length; i++) {
                int number = Integer.parseInt(strNumbers[i]);
                result += number;
            }
            return result;
        }
        if (str.lastIndexOf(",") > 0 && str.lastIndexOf(":") > 0) {
            int result =0;
            String[] strNumbers = str.split(",|:");
            for(int i =0; i< strNumbers.length;i++){
                int number = Integer.parseInt(strNumbers[i]);
                result += number;
            }
            return result;
        }


        return 0;
    }


}
