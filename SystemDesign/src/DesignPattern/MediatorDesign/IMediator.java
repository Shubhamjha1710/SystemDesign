package DesignPattern.MediatorDesign;

public interface IMediator {
    public void sendMessage(String from, String to, String msg);
    public void sendAll(String from, String msg);
    public void registerUser(User u);
}
