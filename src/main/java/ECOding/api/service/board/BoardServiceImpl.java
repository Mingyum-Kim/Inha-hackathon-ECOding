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
    public Board saveBoard(Board board) {
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
}
