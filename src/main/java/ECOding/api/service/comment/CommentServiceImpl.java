package ECOding.api.service.comment;

import ECOding.api.domain.*;
import ECOding.api.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    @Autowired
    public CommentServiceImpl(CommentRepository commentRepository){
        this.commentRepository = commentRepository;
    }

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Optional<Comment> write(Comment comment, Long boardId, Long memberId) {
        Member memberItem = memberRepository.findById(memberId);
        comment.setMember(memberItem);

        Optional<Board> boardItem = boardRepository.findById(boardId);
        comment.setBoard(boardItem.get());

        return  Optional.of(commentRepository.save(comment));
    }

    @Override
    public List<Comment> findComments(Long boardId) {
        Board board = boardRepository.findById(boardId).get();

        return commentRepository.findCommentByBoard(board);
    }

    @Override
    public void delete(Long commentId) {
        commentRepository.deleteById(commentId);
    }
}
