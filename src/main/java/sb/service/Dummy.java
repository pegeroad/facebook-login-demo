package sb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sb.dao.UserSessionData;
import sb.dao.Foo;

@RestController
@Scope("session")
public class Dummy {

    @Autowired
    private UserSessionData userSession;

    @RequestMapping("/dummy")
    public String dummy() {
        return userSession.getToken();
    }

    @RequestMapping("/bar")
    public Foo bar() {
        Foo f = new Foo();
        f.setName("foobar");
        return f;
    }
}
