package guru.springframework.sfgjms;

import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HelloWorldMessage implements Serializable {

    static final long serialVersionUID = -3056081639155217583L;

    private UUID uuid;
    private String message;
}
