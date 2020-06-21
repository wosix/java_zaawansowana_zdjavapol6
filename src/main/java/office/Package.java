package office;

import java.util.Random;
import java.util.UUID;

public class Package {
    private String desctription;
    private String id;
    private PackageStatus status;

    Random random = new Random();



    public Package(String desctription){
        this.desctription = desctription;
        this.id = UUID.randomUUID().toString();
        this.status = PackageStatus.SENT;
    }

    void changeStatus(PackageStatus newStatus){
        this.status = newStatus;
    }

    public String getDesctription() {
        return desctription;
    }

    public String getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Package{" +
                "desctription='" + desctription + '\'' +
                ", id='" + id + '\'' +
                ", status=" + status +
                '}';
    }
}
