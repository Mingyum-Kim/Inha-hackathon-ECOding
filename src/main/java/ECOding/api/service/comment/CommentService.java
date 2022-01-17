package ECOding.api.service.comment;


import ECOding.api.domain.Comment;

import java.util.List;
import java.util.Optional;

public interface CommentService {
    //댓글 작성
    Optional<Comment> write(Comment comment, Long boardId, Long memberId);

    //댓글 전체 조회
    List<Comment> findComments(Long boardId);

    //댓글 삭제
    void delete(Long commentId);
}
