package ECOding.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id @GeneratedValue
    private Long id;

    private String loginId;

    private String name;

    private String nickname;

    public Member(String loginId, String name, String nickname) {
        this.loginId = loginId;
        this.name = name;
        this.nickname = nickname;
    }
}
