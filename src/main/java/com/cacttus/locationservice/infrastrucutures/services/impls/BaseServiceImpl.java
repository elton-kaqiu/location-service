package com.cacttus.locationservice.infrastrucutures.services.impls;

import com.cacttus.locationservice.infrastrucutures.exceptions.AlreadyExistException;
import com.cacttus.locationservice.infrastrucutures.exceptions.NotFoundException;
import com.cacttus.locationservice.infrastrucutures.helpers.HasId;
import com.cacttus.locationservice.infrastrucutures.services.BaseService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public abstract class BaseServiceImpl<T extends HasId<ID>, ID> implements BaseService<T, ID> {
    protected final JpaRepository<T, ID> repository;

    @Override
    public T add(T item) {
        Optional<T> itemFound = repository.findById(item.getId());
        if (itemFound.isPresent()) {
            throw new AlreadyExistException("Entity with this id: " + item.getId() + " already exists!");
        }
        return repository.save(item);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public T findById(ID id) {
        Optional<T> item = repository.findById(id);
        if (item.isEmpty())
            throw new NotFoundException("Entity not found with id: " + id);
        return item.get();
    }

    @Override
    public T modify(ID id, T item) {
        this.findById(id);
        return repository.save(item);
    }

    @Override
    public void removeById(ID id) {
        T item = this.findById(id);
        repository.delete(item);

    }
}
