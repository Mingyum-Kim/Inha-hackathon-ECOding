package ECOding.api.controller;

import ECOding.api.domain.Member;
import ECOding.api.service.member.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    // 회원 가입
    @ResponseBody
    @PostMapping("/join")
    private Member join(@RequestBody Member member){
        return memberService.join(member).get();
    }

    // 회원 수정
    @ResponseBody
    @PutMapping()
    public Member update(@RequestBody Member member){
        return memberService.update(member).get();
    }

    // 회원 전체 조회
    @GetMapping("/all")
    public List<Member> findMembers(){
        return memberService.findMembers();
    }

    // 회원 단일 조회
    @GetMapping
    public Member findMember(@RequestParam Long id){
        return memberService.findMember(id).get();
    }
}

