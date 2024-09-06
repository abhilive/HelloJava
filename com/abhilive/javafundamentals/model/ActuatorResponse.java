package com.abhilive.javafundamentals.model;

public class ActuatorResponse {
    String resourceName;
    Long Id;
    String IpAddress;
    String status;

    public ActuatorResponse() {
    }

    public ActuatorResponse(String resourceName, Long id, String ipAddress, String status) {
        this.resourceName = resourceName;
        Id = id;
        IpAddress = ipAddress;
        this.status = status;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getIpAddress() {
        return IpAddress;
    }

    public void setIpAddress(String ipAddress) {
        IpAddress = ipAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ActuatorResponse{" +
                "resourceName='" + resourceName + '\'' +
                ", Id=" + Id +
                ", IpAddress='" + IpAddress + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
