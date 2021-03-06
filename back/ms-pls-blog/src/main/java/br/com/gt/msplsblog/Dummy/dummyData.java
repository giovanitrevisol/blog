package br.com.gt.msplsblog.Dummy;

import br.com.gt.msplsblog.domain.Comment;
import br.com.gt.msplsblog.domain.Post;
import br.com.gt.msplsblog.domain.User;
import br.com.gt.msplsblog.enums.PerfilUserEnum;
import br.com.gt.msplsblog.enums.StatusEnum;
import br.com.gt.msplsblog.repository.CommentRepository;
import br.com.gt.msplsblog.repository.PostRepository;
import br.com.gt.msplsblog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

@Component
public class dummyData {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    private final String mensagem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam fringilla quam sed eros efficitur, quis iaculis velit bibendum. Nam dolor ligula, vestibulum finibus semper sit amet, consequat sed nulla. Etiam placerat ex nec gravida ultricies. Aenean a augue a tortor finibus viverra. Aliquam maximus, odio at ultricies sodales, tellus lectus fermentum ex, vel faucibus mi leo quis mi. Aenean tempor euismod sem in pellentesque. Praesent porttitor quam mattis neque auctor tempus. Curabitur in odio et mauris gravida iaculis. Suspendisse feugiat hendrerit ligula, non sagittis nisl convallis in. Praesent vestibulum massa ex, sit amet mollis nulla eleifend nec. Integer mollis mauris sed justo aliquam, at pulvinar nunc egestas. Donec vitae quam auctor, varius lorem ut, sodales ex. Donec ac maximus mauris.\n" +
            "\n" +
            "Morbi interdum elit eros, vel volutpat tortor fermentum vitae. Curabitur a risus ullamcorper, auctor justo vel, lobortis dolor. Integer et dignissim orci. Pellentesque lobortis sapien ac viverra pellentesque. Maecenas ut lacus non orci mattis lacinia. Donec placerat elit eget sagittis convallis. Proin at viverra lacus. Nulla eros dolor, venenatis vel molestie porta, vestibulum vel ex. Proin elementum tellus urna, in eleifend risus dictum in. Etiam venenatis enim pulvinar augue maximus, ac aliquet massa pretium. Aliquam vel ornare eros, nec efficitur mauris. Vivamus sagittis tristique massa sagittis ornare.\n" +
            "\n" +
            "Aliquam blandit diam at odio efficitur, non eleifend ex imperdiet. Vivamus suscipit quam at aliquam commodo. Sed molestie ultrices purus, ut commodo urna lobortis sit amet. Duis imperdiet quis libero rhoncus pretium. Vestibulum sit amet mattis elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur id lacus cursus, semper enim sit amet, dignissim ante. In in pulvinar tellus. Proin viverra laoreet justo consequat pulvinar. Nam consequat elit ut tortor auctor pretium dapibus in diam. Mauris ut volutpat magna. Vestibulum non quam ut nibh egestas rutrum.\n" +
            "\n" +
            "Praesent sit amet nisi eget tortor luctus efficitur. Suspendisse placerat, nisi quis tempus tincidunt, tortor metus pharetra magna, in ullamcorper ex lacus volutpat quam. Ut eget justo elit. Sed justo nunc, vulputate at nulla eget, mollis ornare quam. Integer sit amet dictum augue, id porttitor nisl. Donec venenatis semper risus nec cursus. Curabitur sit amet ex molestie, fermentum lectus nec, tristique quam. Aenean in turpis tortor. Integer tincidunt eros eu varius bibendum.\n" +
            "\n" +
            "Duis placerat arcu tellus, eu tincidunt metus tempor vel. Duis feugiat metus sem, id porttitor metus posuere in. Nulla facilisi. Cras volutpat felis quis tempor ultrices. Proin commodo tincidunt dignissim. Vivamus at lectus sit amet sapien feugiat fermentum vehicula eget mauris. Ut sagittis ex vel mauris iaculis laoreet. Quisque sodales feugiat magna in pharetra. Etiam consectetur nunc id gravida mollis. Sed cursus viverra diam. Duis laoreet ac tortor in ultrices. Sed dapibus dolor nunc, pulvinar fermentum lacus pulvinar tempor. Maecenas molestie ullamcorper maximus. Suspendisse lacinia nulla id enim porttitor pretium. Sed rhoncus ullamcorper diam iaculis volutpat. Nam ornare urna imperdiet, viverra leo sed, pulvinar lorem.";


    //@PostConstruct
    public void insertData() {
        User user1 = User.builder()
                .id(1)
                .firtName("c")
                .lastName("Trevisol")
                .email("giovanitrevisol93@gmail.com")
                .birth(LocalDateTime.now())
                .password(passwordEncoder.encode("123"))
                .perfilUserEnum(PerfilUserEnum.OWNER)
                .statusEnum(StatusEnum.ACTIVE)
                .build();

        User user2 = User.builder()
                .id(2)
                .firtName("Lara")
                .lastName("Santiago")
                .email("laratalita.santiago.com.br")
                .birth(LocalDateTime.now())
                .password(passwordEncoder.encode("123"))
                .perfilUserEnum(PerfilUserEnum.OWNER)
                .statusEnum(StatusEnum.ACTIVE)
                .build();

        User user3 = User.builder()
                .id(3)
                .firtName("Titan")
                .lastName("Trevisol Santiago")
                .email("titan@titan.com.br")
                .birth(LocalDateTime.now())
                .password(passwordEncoder.encode("123"))
                .perfilUserEnum(PerfilUserEnum.READER)
                .statusEnum(StatusEnum.DELETED)
                .build();

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);

        Post post1 = Post.builder()
                .author(user1)
                .date(LocalDateTime.now())
                .subtitle("SubTitle")
                .title("Title")
                .contents(mensagem)
                .statusEnum(StatusEnum.ACTIVE)
                .build();

        Post post2 = Post.builder()
                .author(user3)
                .date(LocalDateTime.now())
                .subtitle("SubTitle 2")
                .title("Title 2")
                .contents("mensagem")
                .statusEnum(StatusEnum.DELETED)
                .build();

        postRepository.save(post1);
        postRepository.save(post2);

        Comment comment1 = Comment.builder()
                .name("Giovani Coment??rio1")
                .text("Este ?? um coment??rio - campo de texto")
                .instant(LocalDateTime.now())
                .post(post1)
                .build();

        Comment comment2 = Comment.builder()
                .name("Giovani Coment??rio2")
                .text("Este ?? um coment??rio - campo de texto 2")
                .instant(LocalDateTime.now())
                .post(post1)
                .build();

        Comment comment3 = Comment.builder()
                .name("Giovani Coment??rio 3")
                .text("Este ?? um coment??rio - campo de texto")
                .instant(LocalDateTime.now())
                .post(post1)
                .build();

        Comment comment4 = Comment.builder()
                .name("Giovani Coment??rio1")
                .text("Este ?? um coment??rio - campo de texto")
                .instant(LocalDateTime.now())
                .post(post2)
                .build();

        commentRepository.save(comment1);
        commentRepository.save(comment2);
        commentRepository.save(comment3);
        commentRepository.save(comment4);
    }

}
