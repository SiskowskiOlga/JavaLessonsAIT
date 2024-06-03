package konsultation;
import lombok.*;
/*
упрощает код, анатации замещают много строк
 */

//@ToString(exclude = "email")//если хотим исключить что-то, прописываем что исключить
//@EqualsAndHashCode
//@NoArgsConstructor //пустой
//@AllArgsConstructor //со всеми полями
//@RequiredArgsConstructor //для файнел полей и которые отмечены как NotNull
@Data //замещает == getter setter toString HashCode

public class User {

    @Getter
    @Setter
    private String name;
    @Setter
    @Getter
    private int age;
    private String email;



}

