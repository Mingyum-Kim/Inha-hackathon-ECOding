package ECOding.api.service.board;


import ECOding.api.domain.Board;

import java.util.List;
import java.util.Optional;

public interface BoardService {
    // 게시글 생성
     Board saveBoard(Board board);

    // 게시글 단일 조회
     Optional<Board> findBoard(Long id);

    // 게시글 전체 조회
     List<Board> findBoards();

    // 게시글 수정
    Board updateBoard(Board board);

    // 게시글 삭제
    void delete (Long id);

    void addBookMark(Long boardId, Long memberId);
}
