package sdominika.ndtcertification.Model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class CurrentUser extends User {
    private final sdominika.ndtcertification.entity.User user;

    public CurrentUser(
            String username,
            String password,
            Collection<? extends GrantedAuthority> authorities,
            sdominika.ndtcertification.entity.User user
    ) {
        super(username, password, authorities);
        this.user = user;
    }

    public sdominika.ndtcertification.entity.User getUser() {
        return user;
    }
}