package ECOding.api.repository;

import ECOding.api.domain.Board;
import ECOding.api.domain.BoardRepository;
import ECOding.api.domain.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import javax.transaction.Transactional;
import static ECOding.api.domain.MemberTest.MEMBER1;
import static ECOding.api.domain.MemberTest.MEMBER2;

@SpringBootTest
@Transactional
public class BoardRepositoryTest {

    @Autowired
    BoardRepository boardRepository;

    @Autowired
    MemberRepository memberRepository;

    @AfterEach
    public void cleanUp() {
        boardRepository.deleteAll();
    }

    @DisplayName("게시글을 저장합니다.")
    @Test
    public void 게시글_저장() {
        // given
        Board board = new Board("테스트 게시글", "테스트 내용");
        board.setMember(MEMBER1); // 코드 소모.. 이지 않나

        // when
        boardRepository.save(board);

        // then
        Assertions.assertThat(board.getTitle()).isEqualTo(boardRepository.getById(board.getId()).getTitle());
        Assertions.assertThat(board.getContents()).isEqualTo(boardRepository.getById(board.getId()).getContents());
    }



    @DisplayName("게시글을 수정합니다.")
    @Test
    public void 게시글_수정() {
        //given
        memberRepository.save(MEMBER2);

        Board board = new Board("테스트 게시글", "테스트 내용");
        board.setMember(MEMBER2);
        boardRepository.save(board);
        System.out.println("board의 ID는 " + board.getId()); // 1

        // when
        Board param = new Board("강아지 귀여워", "근데 고양이는 더 귀여워");
        param.setMember(MEMBER2);
        boardRepository.save(param);
        System.out.println("param의 ID는 " + param.getId()); // 2

        // then
    }
}
