package ECOding.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id @GeneratedValue
    private Long id;

    private String password;

    private String loginId;

    private String name;

    private String nickname;

    // insert시 따로 값을 입력하지 말 것. 혹은 0으로 세팅할 것
    @Column(columnDefinition = "integer default 0")
    private Integer mileage;

    @ElementCollection
    private List<Long> bookMarkId;

    public Member(String loginId, String password, String name, String nickname) {
        this.loginId = loginId;
        this.password = password;
        this.name = name;
        this.nickname = nickname;
    }
}
