package racingGame;

import java.util.Random;

public class Car {

    private static final int FORWARD_NUM = 4;
    private static final int MAX_BOUND = 10;

    private final String name;
    private int position = 0;

    public Car(String name) {
        if(name.trim()==""){
            throw new IllegalArgumentException("자동차 이름은 값이 존재해야 합니다..");
        }
        this.name = name.trim();
    }

    public int getPosition(){return position;}

    public String getName() {
        return name;
    }

    public void move(MovingStrategy movingStrategy){
        if(movingStrategy.movable())
            this.position++;
    }

    public void move(int randomNo){
        if(randomNo>=FORWARD_NUM)
            this.position++;
    }

    protected int getRandomNo(){
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }
}
