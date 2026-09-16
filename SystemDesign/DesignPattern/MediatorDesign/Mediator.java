package DesignPattern.MediatorDesign;

import java.util.ArrayList;
import java.util.*;


// We can add addition logic here like u1 blocks u2 logic here in this mediator
public class Mediator implements IMediator{
    HashMap<String, User> userRegister = new HashMap<>();

    @Override
    public void sendMessage(String from, String to, String msg) {
        userRegister.get(to).receive(from, msg);
    }

    @Override
    public void sendAll(String from, String msg) {
        for (Map.Entry<String, User> entry : userRegister.entrySet()) {
            if(Objects.equals(entry.getKey(), from)) {
                continue;
            }
            String name = entry.getKey();
            User user = entry.getValue();

            user.receive(from, msg);
        }
    }

    @Override
    public void registerUser(User u) {
        userRegister.put(u.getName(), u);
    }
}
