package apiRest.repositories;


import org.springframework.stereotype.Repository;
import apiRest.entities.Libro;

@Repository
public interface LibroRepository extends BaseRepository<Libro, Long> {
}
