package DsXXAlgo.Stackz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CarFleet {
    public static void main(String[] args) {
        int[] position = {10,8,0,5,3};
        int[] speed = {2,4,1,1,3};
        int target = 12;
        System.out.println(carFleet(target,position,speed));
    }

    public static int carFleet(int target, int[] position, int[] speed) {
        record Car(int position, int speed) {}
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < position.length; i++) {
            cars.add(new Car(position[i], speed[i]));
        }
        cars.sort((car1, car2) -> {
            if (car1.position() > car2.position()) {
                return -1; // car1 should come before car2
            } else if (car1.position() < car2.position()) {
                return 1;  // car2 should come before car1
            } else {
                return 0;  // they are equal
            }
        });

        Stack<Double> st= new Stack<>();
        int ans = 0;
        for (Car car : cars) {
            double distime = distime(car.position,target,car.speed);
            if(st.isEmpty()){
                st.push(distime);
                ans+=1;
            } else if (st.peek()<distime) {
                st.pop();
                st.push(distime);
                ans+=1;
            }
        }

        return ans;
    }

    public static double distime(int position,int target,int speed){
        double ret =  (double) (target - position) /speed;
        System.out.println(ret);
        return ret;
    }
}
