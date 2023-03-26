package artist.artistpage.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long id;

    @Column(name = "post_title")
    private String title;

    @Column(name = "post_content")
    private String Content;

    @Enumerated(EnumType.STRING)
    private UploadStatus uploadStatus;

}
