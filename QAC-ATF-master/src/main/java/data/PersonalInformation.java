package main.java.data;

public class PersonalInformation {

    private String firstName;
    private String lastName;
    private String email;
    private boolean contractor;
    private boolean remoteEmployee;
    private String office;
    private String manager;
    private String startDate;
    private String orientationPlan;
    private int seatNumber;


      public PersonalInformation(String firstName, String lastName, String email, boolean contractor, boolean remoteEmployee, String office, String manager, String startDate, String orientationPlan, int seatNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contractor = contractor;
        this.remoteEmployee = remoteEmployee;
        this.manager = manager;
        this.startDate = startDate;
        this.orientationPlan = orientationPlan;
        this.seatNumber = seatNumber;
        this.office = office;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public boolean isContractor() {
        return contractor;
    }

    public boolean isRemoteEmployee() {
        return remoteEmployee;
    }

    public String getManager() {
        return manager;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getOrientationPlan() {
        return orientationPlan;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String getOffice() {
        return office;
    }
}
