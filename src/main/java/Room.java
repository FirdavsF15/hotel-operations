public class Room {

    private int numBeds;
    private boolean occupied;
    private boolean dirty;

    public Room(int numBeds, boolean occupied, boolean dirty) {

        this.numBeds = numBeds;
        this.occupied = occupied;
        this.dirty = dirty;
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
        if(!occupied){
            this.dirty = false;
        }


    }

    public boolean checkOut(){
        if(occupied){
            this.occupied = false;
            cleanRoom();

            return true;
        }
        return false;

    }
}
