package br.com.gt.msplsblog.util;

import br.com.gt.msplsblog.domain.Post;
import br.com.gt.msplsblog.dto.request.PostRequest;
import br.com.gt.msplsblog.dto.response.AllPostResponse;
import br.com.gt.msplsblog.dto.response.PostResponse;
import br.com.gt.msplsblog.enums.StatusEnum;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PostMock {

    UserMock userMock = new UserMock();

    private final String mensagem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam fringilla quam sed eros efficitur, quis iaculis velit bibendum. Nam dolor ligula, vestibulum finibus semper sit amet, consequat sed nulla. Etiam placerat ex nec gravida ultricies. Aenean a augue a tortor finibus viverra. Aliquam maximus, odio at ultricies sodales, tellus lectus fermentum ex, vel faucibus mi leo quis mi. Aenean tempor euismod sem in pellentesque. Praesent porttitor quam mattis neque auctor tempus. Curabitur in odio et mauris gravida iaculis. Suspendisse feugiat hendrerit ligula, non sagittis nisl convallis in. Praesent vestibulum massa ex, sit amet mollis nulla eleifend nec. Integer mollis mauris sed justo aliquam, at pulvinar nunc egestas. Donec vitae quam auctor, varius lorem ut, sodales ex. Donec ac maximus mauris.\n" +
            "\n" +
            "Morbi interdum elit eros, vel volutpat tortor fermentum vitae. Curabitur a risus ullamcorper, auctor justo vel, lobortis dolor. Integer et dignissim orci. Pellentesque lobortis sapien ac viverra pellentesque. Maecenas ut lacus non orci mattis lacinia. Donec placerat elit eget sagittis convallis. Proin at viverra lacus. Nulla eros dolor, venenatis vel molestie porta, vestibulum vel ex. Proin elementum tellus urna, in eleifend risus dictum in. Etiam venenatis enim pulvinar augue maximus, ac aliquet massa pretium. Aliquam vel ornare eros, nec efficitur mauris. Vivamus sagittis tristique massa sagittis ornare.\n" +
            "\n" +
            "Aliquam blandit diam at odio efficitur, non eleifend ex imperdiet. Vivamus suscipit quam at aliquam commodo. Sed molestie ultrices purus, ut commodo urna lobortis sit amet. Duis imperdiet quis libero rhoncus pretium. Vestibulum sit amet mattis elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur id lacus cursus, semper enim sit amet, dignissim ante. In in pulvinar tellus. Proin viverra laoreet justo consequat pulvinar. Nam consequat elit ut tortor auctor pretium dapibus in diam. Mauris ut volutpat magna. Vestibulum non quam ut nibh egestas rutrum.\n" +
            "\n" +
            "Praesent sit amet nisi eget tortor luctus efficitur. Suspendisse placerat, nisi quis tempus tincidunt, tortor metus pharetra magna, in ullamcorper ex lacus volutpat quam. Ut eget justo elit. Sed justo nunc, vulputate at nulla eget, mollis ornare quam. Integer sit amet dictum augue, id porttitor nisl. Donec venenatis semper risus nec cursus. Curabitur sit amet ex molestie, fermentum lectus nec, tristique quam. Aenean in turpis tortor. Integer tincidunt eros eu varius bibendum.\n" +
            "\n" +
            "Duis placerat arcu tellus, eu tincidunt metus tempor vel. Duis feugiat metus sem, id porttitor metus posuere in. Nulla facilisi. Cras volutpat felis quis tempor ultrices. Proin commodo tincidunt dignissim. Vivamus at lectus sit amet sapien feugiat fermentum vehicula eget mauris. Ut sagittis ex vel mauris iaculis laoreet. Quisque sodales feugiat magna in pharetra. Etiam consectetur nunc id gravida mollis. Sed cursus viverra diam. Duis laoreet ac tortor in ultrices. Sed dapibus dolor nunc, pulvinar fermentum lacus pulvinar tempor. Maecenas molestie ullamcorper maximus. Suspendisse lacinia nulla id enim porttitor pretium. Sed rhoncus ullamcorper diam iaculis volutpat. Nam ornare urna imperdiet, viverra leo sed, pulvinar lorem.";


    public Post post1 = Post.builder()
            .author(userMock.user1)
            .date(LocalDateTime.now())
            .subtitle("SubTitle")
            .title("Title")
            .contents(mensagem)
            .statusEnum(StatusEnum.ACTIVE)
            .build();

    public Post post2 = Post.builder()
            .author(userMock.user2)
            .date(LocalDateTime.now())
            .subtitle("SubTitle 2")
            .title("Title 2")
            .contents("mensagem")
            .statusEnum(StatusEnum.ACTIVE)
            .build();

    public AllPostResponse allPostResponse(){
        List<Post> list = new ArrayList<>();
        list.add(post1);
        list.add(post2);
        return AllPostResponse.builder()
                .posts(list)
                .build();
    }

    public List<Post> listPostResponse(){
        List<Post> list = new ArrayList<>();
        list.add(post1);
        list.add(post2);
        return list;
    }

    public PostResponse postResponse = PostResponse.builder()
            .id(1L)
            .author(userMock.user2)
            .date(LocalDateTime.now())
            .subtitle("SubTitle 2")
            .title("Title 2")
            .contents("mensagem")
            .statusEnum(StatusEnum.DELETED)
            .build();

    public PostRequest postRequest = PostRequest.builder()
            .id(1L)
            .date(LocalDateTime.now())
            .subtitle("SubTitle")
            .title("Title")
            .authorId(1L)
            .contents(mensagem)
            .statusEnum(StatusEnum.ACTIVE)
            .build();
}
