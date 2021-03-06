package ru.sfedu.studyProject.lab3.tablePerClass.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity(name = "User_TABLE_PER_CLASS")
@Table(schema = "TABLE_PER_CLASS", name = "USER")
public class User implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private Date created;
  private String name;
  private String surname;
}
