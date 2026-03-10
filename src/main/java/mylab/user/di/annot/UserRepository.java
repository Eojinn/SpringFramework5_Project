package mylab.user.di.annot;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Value;

@Repository
public class UserRepository {
    @Value("MySQL") // 다이어그램에 명시된 기본값 설정
    private String dbType;

    public boolean saveUser(String userId, String name) {
        System.out.println(dbType + " DB에 사용자 저장: " + name);
        return true;
    }

    public String getDbType() { return dbType; }
}