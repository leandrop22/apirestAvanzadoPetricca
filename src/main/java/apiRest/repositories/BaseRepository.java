package apiRest.repositories;

import apiRest.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;

public interface BaseRepository <E extends Base, Id extends Serializable> extends JpaRepository<E,Id> {
}