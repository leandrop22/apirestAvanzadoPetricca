package apiRest.services;
import apiRest.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import apiRest.entities.Autor;
import apiRest.repositories.AutorRepository;
import java.awt.print.Pageable;
@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{
    @Autowired
    private AutorRepository autorRepository;
    public AutorServiceImpl(BaseRepository<Autor, Long> BaseRepository) {
        super(BaseRepository);
    }

}