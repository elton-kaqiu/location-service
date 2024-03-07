package com.cacttus.locationservice.infrastrucutures;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public abstract class BaseService<T, ID> implements Serviceable<T, ID> {
    private final JpaRepository<T, ID> repository;

    @Override
    public T add(T item) {
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
            throw new EntityNotFoundException("Entity not found with id: " + id);
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
