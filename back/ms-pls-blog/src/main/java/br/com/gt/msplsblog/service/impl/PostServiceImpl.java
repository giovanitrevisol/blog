package br.com.gt.msplsblog.service.impl;

import br.com.gt.msplsblog.domain.Post;
import br.com.gt.msplsblog.domain.User;
import br.com.gt.msplsblog.dto.request.PostRequest;
import br.com.gt.msplsblog.dto.response.AllPostResponse;
import br.com.gt.msplsblog.dto.response.PostResponse;
import br.com.gt.msplsblog.enums.StatusEnum;
import br.com.gt.msplsblog.exception.BadRequestException;
import br.com.gt.msplsblog.repository.PostRepository;
import br.com.gt.msplsblog.repository.UserRepository;
import br.com.gt.msplsblog.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;
    private final UserRepository userRepository;


    @Override
    public AllPostResponse allPostResponse() {
        List<Post> posts = postRepository.findAll();
        if(posts.isEmpty()){
            throw new BadRequestException("Nenhum post encontrado!!!");
        }
        return AllPostResponse.builder()
                .posts(posts)
                .build();
    }

    @Override
    public PostResponse postByid(Long id){
        Post post = postRepository.findById(id)
                        .orElseThrow(() -> new BadRequestException("Nenhum post com id: " + id + " encontrado."));
        return PostResponse.builder()
                .id(post.getId())
                .title(post.getTitle())
                .date(post.getDate())
                .subtitle(post.getSubtitle())
                .contents(post.getContents())
                .comments(post.getComments())
                .build();
    }

    @Override
    public void savePost(PostRequest postRequest){
        validPostRequest(postRequest);
        postRequest.setStatusEnum(StatusEnum.ACTIVE);
        postRepository.save(fromPost(postRequest));
    }

    @Override
    public void updatePost(Long id, PostRequest postRequest) {
        postRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Post com id:" + id + " não encontrado"));
        validPostRequest(postRequest);
        postRepository.save(fromPost(postRequest));
    }

    @Override
    public void deletePost(Long id) {
        Post post =  postRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Não é possível deletar este post!"));
        postRepository.delete(post);
    }

    public void validPostRequest(PostRequest postRequest){
        if(postRequest == null){
            throw new BadRequestException("Post request inválido");
        }
    }

    public Post fromPost(PostRequest postRequest){
        return Post.builder()
                .id(postRequest.getId())
                .title(postRequest.getTitle())
                .subtitle(postRequest.getSubtitle())
                .date(postRequest.getDate())
                .author(getUserById(postRequest.getAuthorId()))
                .contents(postRequest.getContents())
                .statusEnum(postRequest.getStatusEnum())
                .build();
    }

    public User getUserById(Long id){
        return userRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Autor não encontrado"));
    }
}
