package insurance.domain;

import insurance.domain.*;
import insurance.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ClaimRequested extends AbstractEvent {

    private Long id;
    private String customerId;
    private String deseaseCode;
    private String userName;
    private Date date;
}
