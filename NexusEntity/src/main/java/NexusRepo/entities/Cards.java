package NexusRepo.entities;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Cards {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double cardNumber;
    private String cardType;
    private String cvv;
    private String holderName;
}
