package apiRest.services;
import apiRest.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import apiRest.entities.Domicilio;
import apiRest.repositories.DomicilioRepository;
import java.awt.print.Pageable;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio, Long> implements DomicilioService{
    @Autowired
    private DomicilioRepository domicilioRepository;
    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> BaseRepository) {
        super(BaseRepository);
    }

}