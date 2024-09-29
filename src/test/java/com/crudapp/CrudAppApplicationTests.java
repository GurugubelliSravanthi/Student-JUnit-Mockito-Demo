package com.crudapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.crudapp.entity.User;
import com.crudapp.repository.UserRepo;
import com.crudapp.service.userService;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class CrudAppApplicationTests {
	
	@Mock
	private UserRepo ur;

	@InjectMocks
	private userService us;
	
	@Test
	public void test() {
		User mockuser = new User("dolly", 1);
		Mockito.when(ur.findById(1)).thenReturn(Optional.of(mockuser));
		User st = us.getUser(1);
		assertEquals("dolly",st.getName());
	}
	
}
