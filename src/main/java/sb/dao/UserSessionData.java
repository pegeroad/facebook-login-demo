package sb.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("userSession")
@Scope("session")
public class UserSessionData {

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
