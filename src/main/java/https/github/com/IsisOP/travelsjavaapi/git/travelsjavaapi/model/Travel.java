package https.github.com.IsisOP.travelsjavaapi.git.travelsjavaapi.model;

import https.github.com.IsisOP.travelsjavaapi.git.travelsjavaapi.enumeration.TravelTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Travel {
    private Long id;
    private String orderNumber;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private BigDecimal amount;
    private TravelTypeEnum type;

    public Travel(TravelTypeEnum type){
        this.type = type;
    }
}
