package ru.sfedu.studyProject.lab3.tablePerClass.dataproviders;

import ru.sfedu.studyProject.lab3.tablePerClass.model.Group;
import ru.sfedu.studyProject.lab3.tablePerClass.model.Task;
import ru.sfedu.studyProject.lab3.tablePerClass.model.User;
import ru.sfedu.studyProject.utils.Statuses;

import java.util.Optional;

public interface DataProvider {

  Optional<Task> getTask(long id);

  Optional<Group> getGroup(long id);

  Optional<User> getUser(long id);

  Optional<User> getUser(String email, String password);

  Statuses saveTask(Task task);

  Statuses saveGroup(Group group);

  Statuses saveUser(User user);

  Statuses deleteTask(long taskId);

  Statuses deleteGroup(long groupId);

  Statuses deleteUser(long userId);

}