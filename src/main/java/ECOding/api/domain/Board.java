package ECOding.api.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "board")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    @Id @GeneratedValue
    private Long id;

    private String title;

    private String contents;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "member_id", foreignKey = @ForeignKey(name = "member_id"))
    protected Member member;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public void setMember(Member member){
        this.member = member;
    }

    public Board(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }
}

