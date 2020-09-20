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
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

}
