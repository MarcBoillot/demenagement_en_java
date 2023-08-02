package Demenagement_0;
public class demenagement {
    public static int box = 34;
    public static int capacity_truck = 9;
    public static int box_in_truck = 0;
    public static int new_location = 0;

    public static void main (String[] args){
        while(box > 0) {
            while (box>0 && box_in_truck < capacity_truck){
                box += -1;
                box_in_truck += +1;
                System.out.println("je charge le camion");
                System.out.println("cartons dans le camion : " + box_in_truck);
            }
            while(box_in_truck>0) {
                box_in_truck += -1;
                new_location += +1;
                System.out.println("je decharge le camion");
                System.out.println("cartons dans le camion : " + box_in_truck);
            }
            System.out.println("cartons restant dans la maison : "+box);
            System.out.println("cartons dans nouveau local : "+new_location);
        }
    }
}
