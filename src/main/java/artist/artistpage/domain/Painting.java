package artist.artistpage.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Painting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "painting_id")
    private Long id;

    @Column(name = "painting_title")
    private String title;
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

}
