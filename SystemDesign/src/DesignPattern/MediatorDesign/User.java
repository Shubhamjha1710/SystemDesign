package DesignPattern.MediatorDesign;

public class User implements IColleague{
    String name;
    IMediator mediator;

    public User(String name, IMediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.registerUser(this);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void send(String to, String msg) {
        mediator.sendMessage(this.name, to, msg);;
    }

    @Override
    public void sendAll(String msg) {
        mediator.sendAll(this.name, msg);
    }

    @Override
    public void receive(String from, String msg){
        System.out.println(from + " --> " + this.name + "\n" +
                "Message: " + msg);
    }
}
