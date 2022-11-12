package com.javaproject.gui;

public class ClientInformation {

    public final String directoryPath;
    public final String portNumber;
    public final String peerID;
    public final String fileName;

    public ClientInformation(String directoryPath, String portNumber, String peerID, String fileName) {
        this.directoryPath = directoryPath;
        this.portNumber = portNumber;
        this.peerID = peerID;
        this.fileName = fileName;
    }
}
