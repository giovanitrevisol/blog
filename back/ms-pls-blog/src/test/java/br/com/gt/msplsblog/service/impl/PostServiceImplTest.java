package br.com.gt.msplsblog.service.impl;

import br.com.gt.msplsblog.dto.request.UserRequest;
import br.com.gt.msplsblog.dto.response.AllPostResponse;
import br.com.gt.msplsblog.dto.response.AllUserResponse;
import br.com.gt.msplsblog.dto.response.PostResponse;
import br.com.gt.msplsblog.dto.response.UserResponse;
import br.com.gt.msplsblog.exception.BadRequestException;
import br.com.gt.msplsblog.repository.PostRepository;
import br.com.gt.msplsblog.repository.UserRepository;
import br.com.gt.msplsblog.util.PostMock;
import br.com.gt.msplsblog.util.UserMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;


@ExtendWith(SpringExtension.class)
class PostServiceImplTest {

    @InjectMocks
    private PostServiceImpl postService;

    @Mock
    private PostRepository postRepository;

    private PostMock postMock;

    @BeforeEach
    public void setup() {
        postMock = new PostMock();
    }

    @Test
    void allPostResponse() {
        Mockito.when(postRepository.findAll()).thenReturn(postMock.listPostResponse());
        AllPostResponse allPostResponse = postService.allPostResponse();
        Assertions.assertNotNull(allPostResponse);
        Assertions.assertEquals("Title", allPostResponse.getPosts().get(0).getTitle());
        Assertions.assertEquals("Title 2", allPostResponse.getPosts().get(1).getTitle());
    }

    @Test
    void postByid() {
        Mockito.when(postRepository.findById(ArgumentMatchers.any()))
                .thenReturn(java.util.Optional.ofNullable(postMock.post1));
        PostResponse postResponse = postService.postByid(1L);
        Assertions.assertNotNull(postResponse);
        Assertions.assertEquals("Title", postResponse.getTitle());
    }

    @Test
    void postByid_notFind() {
        Assertions.assertThrows(BadRequestException.class, () -> postService.postByid(120L));
    }

    @Test
    void savePost() {
//        Mockito.when(postRepository.findById(ArgumentMatchers.any()))
//                .thenReturn(java.util.Optional.ofNullable(postMock.post1));
//        postService.savePost(postMock.postRequest);
//        Mockito.verify(postRepository).save(ArgumentMatchers.any());
    }

    @Test
    void updatePost() {
        Mockito.when(postRepository.findById(ArgumentMatchers.any()))
                .thenReturn(java.util.Optional.ofNullable(postMock.post1));
        postService.updatePost(1L, postMock.postRequest);
        Mockito.verify(postRepository).save(ArgumentMatchers.any());
    }

    @Test
    void deletePost() {
        Mockito.when(postRepository.findById(ArgumentMatchers.any()))
                .thenReturn(java.util.Optional.ofNullable(postMock.post1));
        postService.deletePost(1L);
        Mockito.verify(postRepository).delete(ArgumentMatchers.any());
    }

    @Test
    void validPostRequest() {
    }

    @Test
    void getUserById() {
    }
}