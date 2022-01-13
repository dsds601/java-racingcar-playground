package racingGame;

import com.sun.tools.javac.util.StringUtils;

public class Name {

    private final String name;

    public Name(String name) {
        if(name==""){
            throw new IllegalArgumentException("자동차의 이름 값이 존재해야 합니다.");
        }
        if(name.length() >5){
            throw new IllegalArgumentException("자동차의 이름은 5를 초과 할 수 없습니다.");
        }
        this.name = name;
    }
}
