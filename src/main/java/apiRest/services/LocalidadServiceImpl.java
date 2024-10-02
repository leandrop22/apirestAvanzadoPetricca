package apiRest.services;

import apiRest.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import apiRest.entities.Localidad;
import apiRest.repositories.LocalidadRepository;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{
    @Autowired
    private LocalidadRepository localidadrepository;
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> BaseRepository) {
        super(BaseRepository);
    }

}