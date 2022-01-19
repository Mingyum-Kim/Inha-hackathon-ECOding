package ECOding.api.controller;

import ECOding.api.domain.Comment;
import ECOding.api.service.comment.CommentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("")
@RequiredArgsConstructor
public class CommentController {

    @Autowired
    CommentServiceImpl commentService;

    //게시글에 댓글 작성
    @PostMapping("/comment/{memberId}/{boardId}")
    public Comment writeComment(@PathVariable("memberId") Long memberId, @PathVariable("boardId") Long boardId, @RequestBody Comment comment){
        return commentService.write(comment, boardId, memberId).get();
    }

    //특정 게시글의 댓글들 가져오기
    @GetMapping("/comment/{boardId}")
    public List<Comment> getComments(@PathVariable("boardId") Long boardId){
        return commentService.findComments(boardId);
    }

}
