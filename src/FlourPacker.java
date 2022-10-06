public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount <= goal || smallCount < goal || goal < 0) {
            return false;
        }
        int total = (bigCount * 5) + smallCount;

        int reaminder = goal % 5;


        while (total >= goal) {
            if (reaminder == 0) {
                return true;
            } else if (smallCount >= goal || smallCount >= reaminder) {
                return true;
            }
            return false;

        }
        return false;
    }
}