public class BMW extends Car {


//||
    private boolean isConvertable;
    private boolean up;
    private boolean down;
    private boolean isSports;

    public BMW( boolean isConvertable, boolean isSports) {
        super(3,"330", true, 4, 5,2, false);
        this.isConvertable = isConvertable;
        this.isSports = isSports;
    }

    public void accelerate(int speed){
        setSpeed(speed);
        if(super.isManual()){
            if(getSpeed() < 9){
                setGears(1);
            } else if (getSpeed() >= 10 && getSpeed() <= 19 ){
                setGears(2);
            }else if (getSpeed() >= 20 &&  getSpeed() <= 29 ){
                setGears(3);
            }else if (getSpeed() >= 30 && getSpeed() <= 39 ){
                setGears(4);
            }else if (getSpeed() >= 40 && getSpeed() <= 49 ){
                setGears(5);
            }

        }
    }

    public void openRoof(){
        if(isConvertable && up) {
            this.up = false;
            this.down = true;
        }
    }

    public void closeRoof(){
        if(isConvertable && down) {
            this.up = true;
            this.down = false;
        }
    }








}
