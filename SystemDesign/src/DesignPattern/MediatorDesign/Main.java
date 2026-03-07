package DesignPattern.MediatorDesign;

public class Main {
    public static void main(String[] args) {
        IMediator chatRoom = new Mediator();

        User u1 = new User("Shubham", chatRoom);
        User u2 = new User("Himanshu", chatRoom);
        User u3 = new User("Rishabh", chatRoom);

        u1.send(
                "Himanshu",
                "Hello"
        );

        u2.send(
                "Rishabh",
                "Hi Rishabh"
        );
        u1.sendAll("Messaging to all");
    }
}
