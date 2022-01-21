package ECOding.api.controller;

import ECOding.api.domain.Board;
import ECOding.api.domain.BoardRepository;
import ECOding.api.service.board.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    // 게시글 전체 조회
    @GetMapping("/all")
    public List<Board> getBoardList(){
        return boardService.findBoards();
    }

    // 게시글 단일 조회
    @GetMapping
    public Board board(@RequestParam Long boardId){
        return boardService.findBoard(boardId).get();
    }

    // 게시글 저장
    @PostMapping
    public Board saveBoard(@RequestBody Board board){
        return boardService.saveBoard(board);
    }

    @PutMapping
    public Board updateBoard(@RequestBody Board board){
        return boardService.updateBoard(board);
    }

    @DeleteMapping
    public void deleteBoard(@RequestParam Long boardId){
        boardService.delete(boardId);
    }
}
