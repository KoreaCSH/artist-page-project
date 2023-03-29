package artist.artistpage.repository;

import artist.artistpage.domain.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class JpaPostRepository implements PostRepository {

    private final EntityManager em;

    @Override
    public void save(Post post) {
        em.persist(post);
    }

    @Override
    public Optional<Post> findById(Long id) {
        Post findPost = em.find(Post.class, id);
        return Optional.ofNullable(findPost);
    }

    @Override
    public Optional<Post> findByTitle(String title) {
        List<Post> findPost = em.createQuery("select p from Post p where p.title = :title", Post.class)
                .setParameter("title", title)
                .getResultList();

        return findPost.stream().findAny();
    }

    @Override
    public List<Post> findAll() {
        return em.createQuery("select p from Post p", Post.class)
                .getResultList();
    }

}
