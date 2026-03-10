package mylab.user.di.annot;

import org.springframework.stereotype.Service;

@Service
public class SecurityService {
    public boolean authenticate(String userId, String password) {
        System.out.println("사용자 인증 중: " + userId);
        return true;
    }
}