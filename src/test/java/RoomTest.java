import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkIn_HappyCase() {
        Room testRoom = new Room(3, false, false);

        assertTrue(testRoom.checkIn());
    }
    @Test
    void checkIn_OccupiedRoom(){
        Room testRoom = new Room(3, true, false);

        assertFalse(testRoom.checkIn());
    }
    @Test
    void checkIn_DirtyRoom(){
        Room testRoom = new Room(3, false, true);

        assertFalse(testRoom.checkIn());
    }

    @Test
    void cleanRoom_DirtyRoom() {
        Room testRoom = new Room(3, false, true);

        //call clean room
        testRoom.cleanRoom();

        //check that isDirty is false == room is clean if not dirty
        //assertTrue(!testRoom.isDirty())
        assertFalse(testRoom.isDirty());
    }


    @Test
    void cleanRoom_OccupiedRoom(){
        Room testRoom = new Room(3, true, true);

        testRoom.cleanRoom();

        assertTrue(testRoom.isDirty());
    }


    @Test
    void checkOut_OccupiedRoom() {
        Room testRoom = new Room(3, true, true);

        assertTrue(testRoom.checkOut());
    }

    @Test
    void checkOut_AvailableRoom(){
        Room testRoom = new Room(3, false, false);

        assertFalse(testRoom.checkOut());
    }
}