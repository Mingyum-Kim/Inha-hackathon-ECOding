package ECOding.api.service.member;

import ECOding.api.domain.Member;
import ECOding.api.domain.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@Transactional
public class MemberServiceImpl implements MemberService{

    MemberRepository memberRepository;
    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Optional<Member> join(Member member) {
        return Optional.of(memberRepository.save(member));
    }

    @Override
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    @Override
    public Optional<Member> findMember(Long id) {
        return memberRepository.findById(id);
    }

    @Override
    public Optional<Member> update(Member member) {
        return DoesExistMember(member) ?
                Optional.of(memberRepository.save(member)) : Optional.empty();
    }

    @Override
    public Integer addMileage(Long id){
        Member member = memberRepository.findById(id).get();
        member.setMileage(member.getMileage() + 1);
        return member.getMileage();
    }

    private boolean DoesExistMember(Member member) {
        return Optional.of(memberRepository.findById(member.getId())).isPresent();
    }

}
