package les051.UseCar;

public class CarDoor {
    private boolean isDoorOpen;
    private boolean isWindowOpen;

    public CarDoor() {
        this(false, false);
    }

    public CarDoor(boolean isDoorOpen, boolean isWindowOpen) {
        this.isDoorOpen = isDoorOpen;
        this.isWindowOpen = isWindowOpen;
    }

    public void openDoor() { //open the isDoorOpen
        isDoorOpen = true;
        System.out.println("The door was opened.");
    }

    public void closeDoor() { //close the isDoorOpen
        isDoorOpen = false;
        System.out.println("The door was closed");
    }

    public void checkConditionOfTheDoor() {
//        isDoorOpen = !isDoorOpen;
        if(!isDoorOpen) {
            openDoor();
        } else {
            closeDoor();
        }
    }

    public void openWindow() {
        isWindowOpen = true;
        System.out.println("The window was opened.");
    }

    public void closeWindow() {
        isWindowOpen = false;
        System.out.println("The window was closed.");
    }

    public void checkConditionOfTheWindow() {
//        isWindowOpen = !isWindowOpen;
        if(!isWindowOpen) {
            openWindow();
        } else {
            closeWindow();
        }
    }

    public boolean isDoorOpen() {
        return isDoorOpen;
    }

    public boolean isWindowOpen() {
        return isWindowOpen;
    }

    @Override
    public String toString() {
        return "Info about condition of " +
                "door is open: " + isDoorOpen +
                ", window is open: " + isWindowOpen;
    }
}