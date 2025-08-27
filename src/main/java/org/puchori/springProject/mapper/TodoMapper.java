package org.puchori.springProject.mapper;

import org.puchori.springProject.domain.TodoVO;

import java.util.List;

public interface TodoMapper {

  String getTime();

  void insert(TodoVO todoVO);

  List<TodoVO> selectAll();

  TodoVO selectOne(Long tno);

  void delete(Long tno);

  void update(TodoVO todoVO);

}
