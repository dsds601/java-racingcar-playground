package Calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import static org.assertj.core.api.Assertions.*;

public class StringCalculatorTest {

    @Test
    void 숫자_빈문자_0반환(){
        int result = StringCalculator.splitAddSum("");
        assertThat(result).isEqualTo(0);

        int i = StringCalculator.splitAddSum(null);
        assertThat(i).isEqualTo(0);
    }

    @Test
    @DisplayName("숫자 하나를 입력하면 해당 숫자 반환")
    void 숫자_1_반환(){
        int result = StringCalculator.splitAddSum("8");
        assertThat(result).isEqualTo(8);
    }

    @DisplayName("문자열 더하기")
    @Test
    void 숫자_더하기(){
        int result = StringCalculator.splitAddSum("5,2");
        assertThat(result).isEqualTo(7);
    }

    @DisplayName("쉼표 콜론 구분자")
    @Test
    void 쉼표_구분자(){
        int result = StringCalculator.splitAddSum("1:2,8");
        assertThat(result).isEqualTo(11);
    }

    @Test
    public void splitAndSum_custom_구분자() throws Exception {
        int result = StringCalculator.splitAddSum("//;\n1;2;3");
        assertThat(result).isEqualTo(6);
    }
}
