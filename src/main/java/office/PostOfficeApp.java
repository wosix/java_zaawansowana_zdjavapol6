package office;

public class PostOfficeApp {
    public static void main(String[] args) {
        Package socks = new Package("socks");

        System.out.println(socks);

        socks.changeStatus(PackageStatus.DELIVERED);

        System.out.println(socks);
    }
}
