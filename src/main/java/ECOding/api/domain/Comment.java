package ECOding.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "comment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    @Id @GeneratedValue
    private Long id;

    private String contents;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "board_id", foreignKey = @ForeignKey(name = "fk_comment_to_board"))
    protected Board board;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "member_id", foreignKey = @ForeignKey(name = "fk_comment_to_member"))
    protected Member member;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public Comment(String contents){
        this.contents = contents;
    }
}
