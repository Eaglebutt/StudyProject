package ru.sfedu.studyProject.lab5.generatedPrimaryKey.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity(name = "USER_LAB5_GPK")
@Table(schema = "LAB5_generatedPrimaryKey")
@EqualsAndHashCode
public class User implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private long id;
  private Date created;
  private String name;
  private String surname;
  @OneToOne(cascade = CascadeType.PERSIST, mappedBy = "user")
  private Address address;
}
