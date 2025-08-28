package org.puchori.springProject.service;

import org.puchori.springProject.domain.TodoVO;
import org.puchori.springProject.dto.PageRequestDTO;
import org.puchori.springProject.dto.PageResponseDTO;
import org.puchori.springProject.dto.TodoDTO;

import java.util.List;

public interface TodoService {

  void register(TodoDTO todoDTO);

  List<TodoDTO> getAll();

  TodoDTO getOne(Long tno);

  void remove(Long tno);


  void modify(TodoDTO todoDTO);

  PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO);
}
