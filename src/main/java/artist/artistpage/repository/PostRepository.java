package artist.artistpage.repository;

import artist.artistpage.domain.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepository {

    void save(Post post);
    Optional<Post> findById(Long id);
    Optional<Post> findByTitle(String title);
    List<Post> findAll();

}
