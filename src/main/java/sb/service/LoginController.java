package sb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sb.dao.UserSessionData;

@RestController
@Scope("session")
public class LoginController {

    @Autowired
    private UserSessionData userSession;

    @RequestMapping("/login/success")
    public String successfulLogin(@RequestParam("token") String accessToken) {
        userSession.setToken(accessToken);
        return accessToken;
    }

}
