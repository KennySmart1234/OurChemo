package ng.ourChemo.data.models;

import java.time.LocalDate;
import java.util.List;

public class DispensedDrugs {
    private User dispensedBy;
    private List<DispensedDrug> dispensedDrugs;
    private LocalDate dispensedDateTime;
    private int id;
}
