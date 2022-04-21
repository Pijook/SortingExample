package com.company;

import java.util.UUID;

public class Container {

    private UUID containerID;
    private Double mass;

    public Container(Double mass) {
        this.containerID = UUID.randomUUID();
        this.mass = mass;
    }

    public UUID getContainerID() {
        return containerID;
    }

    public void setContainerID(UUID containerID) {
        this.containerID = containerID;
    }

    public Double getMass() {
        return mass;
    }

    public void setMass(Double mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Container{" +
                "containerID=" + containerID +
                ", mass=" + mass +
                '}';
    }
}
