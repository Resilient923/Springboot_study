package hello.hellospring.service;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.domain.Member;

import java.util.Optional;


public class MemberService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    //회원가입
    public Long join(Member member){

        //중복이름회원은 안된다.

        Optional<Member> result = memberRepository.findByName(member.getName());
        result.ifPresent(m-> {
            throw new IllegalStateException("이미존재하는 회원입니다.");
        });
        memberRepository.save(member);
        return member.getId();
    }
}
