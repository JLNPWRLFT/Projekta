package logic;

public class Car{
    private int mileAge;
    private int actualSpeed;

    public Car(int mileAge, int actualSpeed){
        this.mileAge = mileAge;
        this.actualSpeed = actualSpeed;
    }

    public int getMileAge() {
        return mileAge;
    }

    public void setMileAge(int mileAge) {
        this.mileAge = mileAge;
    }

    public int getActualSpeed() {
        return actualSpeed;
    }

    public void setActualSpeed(int actualSpeed) {
        this.actualSpeed = actualSpeed;
    }

    public void accelerate(){
        this.actualSpeed += 5;
    }
}