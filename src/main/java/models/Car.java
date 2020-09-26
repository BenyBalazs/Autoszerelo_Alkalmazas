package models;

import lombok.*;

import javax.persistence.*;
import javax.xml.bind.ValidationException;

@Data
@Builder
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
    @Setter(AccessLevel.PRIVATE)
    private long repairId;
    @Column(name = "Name")
    private String name;
    @Column(name = "Phone_Number", length = 12)
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

    public void setLicensePlate(String licensePlate) throws ValidationException {

        if(licensePlate.toCharArray().length == 6)
            this.licensePlate = licensePlate;
        else
            throw new ValidationException("Nem megfeleő a rendszám hossza!");
    }

    public void setPhoneNumber(String phoneNumber) throws ValidationException{

        if(!phoneNumber.startsWith("+"))
            throw new ValidationException("Nem érvényes telefonszám");
        if(phoneNumber.length() == 12)
            this.phoneNumber = phoneNumber;
        else
            throw new ValidationException("Nem megfelelő a telefonszám hossza");
    }
}
