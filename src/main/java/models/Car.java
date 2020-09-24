package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Cars")
public class Car {

    public static enum State {
        WAITING,
        UNDER_REPAIR,
        FINISHED,
        PAID
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CarRepair_ID")
    private long repairId;
    @Column(name = "Name")
    private String name;
    @Column(name = "Phone_Number")
    private String phoneNumber;
    @Column(name = "License_Plate_Number", nullable = false, unique = true, length = 6)
    private String licensePlate;
    @Column(name = "Description")
    private String description;
    @Column(name = "Brand_And_Type")
    private String brandAndType;
    @Column(name = "State", nullable = false)
    private State state;
    @Column(name = "Cost_Of_Repair")
    private Integer costOfRepair;



}
