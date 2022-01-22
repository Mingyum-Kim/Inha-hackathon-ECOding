package ECOding.api.service.board;

import ECOding.api.domain.Board;
import ECOding.api.domain.BoardRepository;
import ECOding.api.domain.Member;
import ECOding.api.domain.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService
{
    private final BoardRepository boardRepository;
    private final MemberRepository memberRepository;

    @Override
    public Board saveBoard(Board board) {
        memberRepository.save(board.getMember());
        return boardRepository.save(board);
    }

    @Override
    public Optional<Board> findBoard(Long id) {
        return boardRepository.findById(id);
    }

    @Override
    public List<Board> findBoards() {
        return boardRepository.findAll();
    }

    @Override
    public Board updateBoard(Board board) {
        return boardRepository.save(board);
    }

    @Override
    public void delete(Long id) {
        boardRepository.deleteById(id);
    }

    @Override
    public void addBookMark(Long boardId, Long memberId) {
        Optional<Member> member = memberRepository.findById(memberId);
        member.get().getBookMarkId().add(boardId);
    }
}
