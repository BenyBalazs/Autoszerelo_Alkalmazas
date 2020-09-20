package models;

import enums.State;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Cars")
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Car_ID")
    private long id;
    @Column(name = "Owner_Name")
    private String ownerName;
    @Column(name = "Owner_Phone_Number")
    private String ownerPhoneNumber;
    @Column(name = "License_Plate_Number", nullable = false)
    private String licensePlateNumber;
    @Column(name = "Chassis_Number", nullable = false)
    private String chassisNumber;
    @Column(name = "Description")
    private String description;
    @Column(name = "Brand_And_Type")
    private String brandAndType;
    @Column(name = "State")
    private State state;
    @Column(name = "Price")
    private Integer price;



}
