package ru.sfedu.studyProject.model;


import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvCustomBindByName;
import com.opencsv.bean.CsvDate;
import lombok.*;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementMap;
import ru.sfedu.studyProject.Constants;
import ru.sfedu.studyProject.converters.ModificationRecordConverter;
import ru.sfedu.studyProject.converters.TaskMapConverter;
import ru.sfedu.studyProject.converters.UserMapConverter;
import ru.sfedu.studyProject.enums.GroupTypes;
import ru.sfedu.studyProject.enums.TaskState;
import ru.sfedu.studyProject.enums.UserRole;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Class Group
 */
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(doNotUseGetters = true)
@ToString
public class Group implements Serializable {

  //
  // Fields
  //
  @Attribute
  @CsvBindByName
  private long id;
  @Attribute
  @CsvBindByName
  private String name;
  @Attribute
  @CsvBindByName
  @CsvDate(value = Constants.DATE_FORMAT)
  private Date created;
  @ElementMap
  @CsvCustomBindByName(converter = TaskMapConverter.class)
  private Map<Task, TaskState> taskList;
  @ElementMap
  @CsvCustomBindByName(converter = UserMapConverter.class)
  private Map<User, UserRole> memberList;
  @Attribute
  @CsvBindByName
  private GroupTypes groupType;
  @ElementList
  @CsvCustomBindByName(converter = ModificationRecordConverter.class)
  private List<ModificationRecord> historyList;

  //
  // Methods
  //


}
