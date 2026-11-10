public class Room {

    private int numBeds;
    private boolean occupied;
    private boolean dirty;

    public Room(int numBeds) {
        this.numBeds = numBeds;
    }

    public int getNumBeds() {
        return numBeds;
    }

    public double getPrice(){
        return 0;
    }

    public boolean isOccupied(){
        return occupied;
    }

    public boolean isDirty(){
        return dirty;
    }

    public boolean isAvailable(){
        return !occupied && !dirty;
    }

    public boolean checkIn(){
        if(!occupied && !dirty){
            this.occupied = true;
            this.dirty = true;
            return true;
        }

        return false;


    }

    public void cleanRoom(){
        this.dirty = false;
    }

    public boolean checkOut(){
        if(occupied){
            cleanRoom();
            this.occupied = false;
            return true;
        }
        return false;

    }
}
