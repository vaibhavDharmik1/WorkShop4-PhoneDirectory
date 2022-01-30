import java.util.Objects;

public class Contacts {
    private String landLinePhoneNumber;
    private String mobilePhoneNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacts that = (Contacts) o;
        return Objects.equals(landLinePhoneNumber, that.landLinePhoneNumber) && Objects.equals(mobilePhoneNumber, that.mobilePhoneNumber);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public Contacts(String landLinePhoneNumber, String mobilePhoneNumber) {
        this.landLinePhoneNumber = landLinePhoneNumber;
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getLandLinePhoneNumber() {
        return landLinePhoneNumber;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "landLinePhoneNumber='" + landLinePhoneNumber + '\'' +
                ", mobilePhoneNumber='" + mobilePhoneNumber + '\'' +
                '}';
    }
}