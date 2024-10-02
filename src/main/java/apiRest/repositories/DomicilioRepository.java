package apiRest.repositories;

import org.springframework.stereotype.Repository;
import apiRest.entities.Domicilio;

@Repository
public interface DomicilioRepository extends BaseRepository<Domicilio, Long> {
}