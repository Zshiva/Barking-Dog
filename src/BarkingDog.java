public class BarkingDog {
    public static boolean shouldWakeUp (boolean barking, int hourOfDay){
        if(barking && ((hourOfDay >=0) && (hourOfDay < 8 )) || (hourOfDay == 23)){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        shouldWakeUp(true, 9); // It will return false;
        shouldWakeUp(true, 7); // it will return true;
    }
}