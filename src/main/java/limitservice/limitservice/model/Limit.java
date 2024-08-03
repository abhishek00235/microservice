package limitservice.limitservice.model;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Limit {
    private int maximum;
    private int minimum;
}
