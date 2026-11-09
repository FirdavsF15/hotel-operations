public class Reservation {

    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice(){
        double price = 99999.99;
        switch(roomType){
            case "king"->{
                price = 139.00;
            }
            case "double"->{
                price = 124.00;
            }
            default->{
                System.out.println("MAJOR ERROR THAT IS NOT A VALID ROOM TYPE");
            }

        }

        if(weekend){
            price+= (price*.10);
        }

        return price;

    }

    public int getNumberOfNights() {
        return numberOfNights;
    }
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend(){
        return weekend;
    }
    public void setWeekend(boolean weekend){
        this.weekend = weekend;
    }

    public double getReservationTotal(){
        return numberOfNights * getPrice();

    }
}
