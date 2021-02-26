package ru.sfedu.studyProject.lab3.singleTable.model;

import lombok.Data;
import ru.sfedu.studyProject.curs.enums.TaskState;
import ru.sfedu.studyProject.lab3.singleTable.model.enums.GroupTypes;
import ru.sfedu.studyProject.lab3.singleTable.model.enums.UserRoles;

import java.util.Date;
import java.util.Map;

@Data
public class Group {
  private long id;
  private String name;
  private Date created;
  private Map<Task, TaskState> taskMap;
  private Map<User, UserRoles> userMap;
  private GroupTypes groupType;
  private String password;
}
