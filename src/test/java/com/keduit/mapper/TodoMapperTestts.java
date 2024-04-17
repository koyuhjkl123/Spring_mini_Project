package com.keduit.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.keduit.domain.TodoVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class TodoMapperTestts {
	
	@Setter(onMethod_ = @Autowired )
	private TodoMapper mapper;
	
	@Test
	public void testTodogetList() {
		
		log.info("getList 테스트 : " + mapper.getTodoList());
		mapper.getTodoList().forEach(board-> log.info(board));
	}
	
	
	@Test
	public void testGet() {
		
		TodoVO vo = new TodoVO();
		
		log.info("get : " + mapper.get(vo.getTno()));
	}
	
	@Test
	public void testInsert() {
		
		TodoVO vo = new TodoVO();
		
		vo.setTitle("테스트2");
		vo.setWriter("글자를 보이게하는것2");
		mapper.insert(vo);
		log.info("insert : " + vo);
		
		
	}
	
	

}
