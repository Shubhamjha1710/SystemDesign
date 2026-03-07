package DesignPattern.MediatorDesign;

public interface IColleague {
    public String getName();
    public void send(String to, String msg);
    public void sendAll(String msg);
    public void receive(String from, String msg);
}
