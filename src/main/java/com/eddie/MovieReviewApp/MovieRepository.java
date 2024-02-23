package com.eddie.MovieReviewApp;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    Optional<Movie> findByImdbId(String imdbId);
}
