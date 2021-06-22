package br.com.gt.msplsblog.dto.request;
import br.com.gt.msplsblog.enums.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class PostRequest {

    private long id;
    private String title;
    private LocalDateTime date;
    private String subtitle;
    private String contents;
    private Long authorId;
    private StatusEnum statusEnum;
}
