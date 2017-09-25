package app.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.io.Serializable;

public interface ReadOnlyRepository<T, ID extends Serializable> extends MongoRepository<T, ID> {
}
