package methods_Design_Process;

import static input.InputUtils.doubleInput;

public class Warm_up2 {
    public static void main(String[] args) {

        double schedule = doubleInput("How much do you want to increase your intensity % each week?");
        upgrade(schedule);

//        for (double x =1; x < end_goal; x=x*1.1){
//            i++;

    }

    public static void upgrade(double schedule) {
        double end_goal = 26.2;
        double scheduleFixed = (schedule /100);
        int i = 1;
        for (double x = 1; x < end_goal; x = (x+x*scheduleFixed)) {
            i++;
            System.out.printf("Week %d: %.2f miles\n", i, x);
        }
    }
}
