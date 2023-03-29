package artist.artistpage.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class JpaPostRepositoryTest {

    @Autowired
    EntityManager em;

    void 게시글업로드() {

    }

}