package pl.wszib.oemdatabase.data.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "workplaces")
public class WorkplaceEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "measurement_result")
    private BigDecimal measurementResult;
    @Column(name = "date")
    private String ctime;
    @Column(name = "department")
    private String department;
    @Column(name = "phase")
    private String phase;
    @Column(name = "room")
    private String room;
    @Column(name = "activity")
    private String activity;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "ppe")
    private String ppe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getMeasurementResult() {
        return measurementResult;
    }

    public void setMeasurementResult(BigDecimal measurementResult) {
        this.measurementResult = measurementResult;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String date) {
        this.ctime = date;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPpe() {
        return ppe;
    }

    public void setPpe(String ppe) {
        this.ppe = ppe;
    }
}
