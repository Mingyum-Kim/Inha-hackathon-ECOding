package ECOding.api.service;


import ECOding.api.domain.Member;
import ECOding.api.service.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

import static ECOding.api.domain.MemberTest.MEMBER1;

@SpringBootTest
public class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @DisplayName("회원 정보 저장에 성공한다. ")
    @Test
    public void 회원_저장() {
        // when
        Optional<Member> savedMember = memberService.join(MEMBER1);

        // then
        savedMember.ifPresentOrElse(
            newMember -> Assertions.assertThat(newMember.getName()).isEqualTo(MEMBER1.getName()),
                () -> {throw new EntityNotFoundException();}
        ); // name의 동일성 검사
    }



}
