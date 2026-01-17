package com.linsvitor.blogging_api.service;

import com.linsvitor.blogging_api.domain.Post;
import com.linsvitor.blogging_api.repository.PostRepository;
import com.linsvitor.blogging_api.service.exception.PostNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public List<Post> search(String term) {
        IO.println("Buscando por: " + term);
        return postRepository.search(term);
    }

    public Post findById(String id) {
        Optional<Post> post = postRepository.findById(id);
        return post.orElseThrow(() -> new PostNotFoundException(id));
    }

    public Post insert(Post post) {
        return postRepository.insert(post);
    }

    public Post update(String id, Post post) {
        if (postRepository.existsById(id)) {
            Post uptadedPost = findById(id);
            uptadedPost.setTitle(post.getTitle());
            uptadedPost.setContent(post.getContent());
            uptadedPost.setCategory(post.getCategory());
            uptadedPost.setTag(post.getTags());
            uptadedPost.setUpdatedAt(LocalDateTime.now());
            postRepository.save(uptadedPost);
            return uptadedPost;
        }
        throw new PostNotFoundException(id);
    }
}
