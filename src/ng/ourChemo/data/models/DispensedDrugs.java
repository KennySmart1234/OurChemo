package ng.ourChemo.data.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DispensedDrugs {
    private User dispensedBy;
    private List<DispensedDrug> dispensedDrugs;
    private LocalDate dispensedDateTime;
    private int id;


    public void setDispensedBy(User dispensedBy) {
        this.dispensedBy = dispensedBy;
    }

    public  User getDispensedBy() {
        return dispensedBy;
    }

    public void setDispensedDrugs(){
        this.dispensedDrugs = new ArrayList<>();
    }

    public List<DispensedDrug>  getDispensedDrugs() {
        return dispensedDrugs;

    }

    public void setDispensedDateTime(LocalDate dispensedDateTime) {
        this.dispensedDrugs = new ArrayList<>();
    }

    public LocalDate getDispensedDateTime() {
        return dispensedDateTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
