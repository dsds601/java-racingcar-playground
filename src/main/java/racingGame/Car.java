package racingGame;

public class Car {

    public String name;
    public int position;

    public Car(String name) {
        if(name.length()>5){
            throw new IllegalArgumentException("이름은 5자를 초과할 수 없습니다.");
        }
        this.name = name;
    }
}
