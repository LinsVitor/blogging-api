package com.linsvitor.blogging_api.repository;

import com.linsvitor.blogging_api.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PostRepository extends MongoRepository<Post, String> {
    @Query("{ $or: [ { title: { $regex: ?0, $options: 'i' } }, { content: { $regex: ?0, $options: 'i' } }, { category: { $regex: ?0, $options: 'i' } }, { tags: { $regex: ?0, $options: 'i' } } ] }")
    List<Post> search(String term);
}
