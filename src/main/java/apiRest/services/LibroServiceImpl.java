package apiRest.services;

import apiRest.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import apiRest.entities.Libro;
import apiRest.repositories.LibroRepository;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService{
    @Autowired
    private LibroRepository libroRepository;
    public LibroServiceImpl(BaseRepository<Libro, Long> BaseRepository) {
        super(BaseRepository);
    }
    @Override
    public Page<Libro> findAll(Pageable pageable) throws Exception {
        return null;
    }
}