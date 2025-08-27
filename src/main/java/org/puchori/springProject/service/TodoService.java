package org.puchori.springProject.service;

import org.puchori.springProject.domain.TodoVO;
import org.puchori.springProject.dto.TodoDTO;

import java.util.List;

public interface TodoService {

  void register(TodoDTO todoDTO);

  List<TodoDTO> getAll();

  TodoDTO getOne(Long tno);

  void remove(Long tno);


  void modify(TodoDTO todoDTO);
}
