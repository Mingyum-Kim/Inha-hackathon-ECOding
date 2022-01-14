package ECOding.api.service.member;

import ECOding.api.domain.Member;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface MemberService {
    // 회원 가입
    public Optional<Member> join(Member member);

    // 회원 전체 조회
    public List<Member> findMembers();

    // 회원 단일 조회
    public Optional<Member> findMember(Long id);

    // 회원 수정
    public Optional<Member> update(Member member);
}
