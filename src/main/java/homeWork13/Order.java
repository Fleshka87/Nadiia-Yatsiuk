package homeWork13;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class Order {
    private int id;
    private int petId;
    private int quantity;
    private String shipDate;
    private String status;
    Boolean complete;
}
