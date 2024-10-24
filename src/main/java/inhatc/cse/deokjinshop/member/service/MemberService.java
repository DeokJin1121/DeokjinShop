package inhatc.cse.deokjinshop.member.service;

import inhatc.cse.deokjinshop.member.entity.Member;
import inhatc.cse.deokjinshop.member.repository.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;


    private void validateDupMember(Member member) {     // 사용자가 중복 여부

        Optional<Member> optMember = memberRepository.findByEmail(member.getEmail());
        if(optMember.isPresent()) {
            Member member1 = optMember.get();
            throw new IllegalStateException("이미 존재하는 사용자 입니다");
        }

//        Member m2 = memberRepository.findByEmail(member.getEmail())
//                .orElseThrow(() -> new IllegalStateException("예외 발생"));
    }

    public Member saveMember(Member member) {
        validateDupMember(member);
        Member m = memberRepository.save(member);
        return m;
    }


}
