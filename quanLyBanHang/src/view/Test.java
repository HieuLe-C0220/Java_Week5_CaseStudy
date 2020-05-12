package view;

import synchronization.Synchronizer;

public class Test {
    public static void main(String[] args) {
        Synchronizer synchronizer = new Synchronizer();
        synchronizer.readToFile();
        synchronizer.writeToFile(1);
        synchronizer.writeToFile(3);
    }
}
