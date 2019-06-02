package Client;

import java.util.Set;

public interface MessageReciever {

    void submitMessage(TextMessage message);

    void userConnected(String login);

    void userDisconnected(String login);

    void setUserList(Set<String> users);
}
