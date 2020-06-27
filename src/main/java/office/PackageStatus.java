package office;

public enum PackageStatus {
    SENT("Package sent", 800) {
        @Override
        public PackageStatus[] getNextStatuses() {
            return new PackageStatus[]{TRAVELING, LOST};
        }
    },
    TRAVELING("Package is traveling", 801) {
        @Override
        public PackageStatus[] getNextStatuses() {
            return new PackageStatus[]{COURIER, LOST};
        }
    },
    COURIER("Courier has the package", 802) {
        @Override
        public PackageStatus[] getNextStatuses() {
            return new PackageStatus[]{DELIVERED, LOST, RETURNED};
        }
    },
    DELIVERED("Package is delivered", 600) {
        @Override
        public PackageStatus[] getNextStatuses() {
            return new PackageStatus[0];
        }
    },
    LOST("Package is lost", 900) {
        @Override
        public PackageStatus[] getNextStatuses() {
            return new PackageStatus[0];
        }
    },
    RETURNED("Package was returned", 500) {
        @Override
        public PackageStatus[] getNextStatuses() {
            return new PackageStatus[0];
        }
    };

    private final String info;
    private final int statusId;


    PackageStatus(String info, int statusId) {
        this.info = info;
        this.statusId = statusId;
    }

    public String getInfo() {
        return info;
    }

    public int getStatusId() {
        return statusId;
    }

    public abstract PackageStatus[] getNextStatuses();

    @Override
    public String toString() {
        return "PackageStatus{" +
                "info='" + info + '\'' +
                ", statusId=" + statusId +
                '}';
    }
}
