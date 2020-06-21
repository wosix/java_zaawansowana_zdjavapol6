package office;

public enum  PackageStatus {
    SENT("Package sent",800),
    TRAVELING("Package is traveling",801),
    COURIER("Courier has the package",802),
    DELIVERED("Package is delivered", 600),
    LOST("Package is lost",900),
    RETURNED("Package was returned", 500);

    private final String info;
    private final int statusId;


    PackageStatus(String info, int statusId){
        this.info = info;
        this.statusId = statusId;
    }

    public String getInfo(){
        return info;
    }

    public int getStatusId(){
        return statusId;
    }

    @Override
    public String toString() {
        return "PackageStatus{" +
                "info='" + info + '\'' +
                ", statusId=" + statusId +
                '}';
    }
}
