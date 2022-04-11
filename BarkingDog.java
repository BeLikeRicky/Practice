public class BarkingDog {
    public static void main(String[] args) {

    }

//    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
//         if(hourOfDay <= 8 || hourOfDay <= 22){
//            return barking;
//            } else if(hourOfDay >= 0 && hourOfDay <= 23) {
//             return false;
//         } else {
//             barking = false;
//         }
//         return barking;
//    }

    public static boolean shouldWakeUp(boolean curBark, int hourOfDay) {
        if(hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if(curBark && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        } else {
            return false;
        }
    }
}
