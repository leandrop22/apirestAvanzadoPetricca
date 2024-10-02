package apiRest.repositories;
import org.springframework.stereotype.Repository;
import apiRest.entities.Autor;

@Repository

public interface AutorRepository extends BaseRepository<Autor, Long> {
}