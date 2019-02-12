package customTypes;

public class Flight {
    private String category;
    private String date;
    private String time;
    private Integer passengers;

    public Flight(String category, String date, String time, Integer passengers){
        this.category = category;
        this.date = date;
        this.time = time;
        this.passengers = passengers;
    }

    public String getCategory() {
        return category;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public Integer getPassengers() {
        return passengers;
    }

}
