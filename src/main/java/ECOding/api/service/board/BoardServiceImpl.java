package ECOding.api.service.board;

import ECOding.api.domain.Board;
import ECOding.api.domain.BoardRepository;
import ECOding.api.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@Transactional
public class BoardServiceImpl implements BoardService
{
    private BoardRepository boardRepository;
    private MemberRepository memberRepository;

    @Autowired
    public BoardServiceImpl(BoardRepository boardRepository){
        this.boardRepository = boardRepository;
    }

    @Override
    public Optional<Board> save(Board board) {
//        return boardRepository.save(board).get();
        return Optional.empty();
    }

    @Override
    public Optional<Board> findBoard(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Board> findBoards() {
        return null;
    }

    @Override
    public Optional<Board> updateBoard(Board board) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }
}
