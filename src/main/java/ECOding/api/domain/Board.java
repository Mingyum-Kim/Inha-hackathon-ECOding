package ECOding.api.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "board")
public class Board {
    @Id @GeneratedValue
    private Long id;

    private String title;

    private String contents;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "writer_id", foreignKey = @ForeignKey(name = "fk_baseboard_to_member"))
    protected Member writer;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "board_id", foreignKey = @ForeignKey(name = "fk_baseboard_to_board"))
    private Board board;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}

