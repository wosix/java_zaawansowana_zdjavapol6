package vehicles;

public class ConvertibleCar extends Car{
    boolean roof;


    public void openRoof(){
        if (roof == true){
            System.out.println("Roof is already open!");
            return;
        }
        roof = true;
        System.out.println("Roof is now open.");
    }

    public void closeRoof(){
        if (roof == false){
            System.out.println("Roof is already closed!");
            return;
        }
        roof = false;
        System.out.println("Roof is now closed.");
    }

}
