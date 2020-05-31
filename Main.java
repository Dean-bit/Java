public class Main {
    public static void main(String[] args) {
        System.out.println("-----------Start of Report-------------");
        //Report of the First Building
        Building myFirstBuilding = new Building();
        myFirstBuilding.setNameBuilding("Skyline");
        myFirstBuilding.setColour("Green");
        myFirstBuilding.setNumFloors(16);
        myFirstBuilding.setNumRoomsFloor(4);
        myFirstBuilding.printBuilding();
		 myFirstBuilding.setNameBuilding("Resort");
        myFirstBuilding.setColour("purple");
        myFirstBuilding.setNumFloors(16);
        myFirstBuilding.setNumRoomsFloor(4);
        myFirstBuilding.printBuilding();
		 myFirstBuilding.setNameBuilding("Innerfort");
        myFirstBuilding.setColour("pink");
        myFirstBuilding.setNumFloors(16);
        myFirstBuilding.setNumRoomsFloor(4);
        myFirstBuilding.printBuilding();
		myFirstBuilding.setNameBuilding("Comfort");
        myFirstBuilding.setColour("Blue");
        myFirstBuilding.setNumFloors(10);
        myFirstBuilding.setNumRoomsFloor(9);
        myFirstBuilding.printBuilding();
		 myFirstBuilding.setNameBuilding("Towers");
        myFirstBuilding.setColour("Green");
        myFirstBuilding.setNumFloors(16);
        myFirstBuilding.setNumRoomsFloor(4);
        myFirstBuilding.printBuilding();
        System.out.println("------------End of Report-------------");
    }
}