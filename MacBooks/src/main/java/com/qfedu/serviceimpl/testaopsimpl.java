package com.qfedu.serviceimpl;
import org.springframework.stereotype.Service;
import com.qfedu.service.testaops;

@Service
public class testaopsimpl implements testaops{

	@Override
	public void testselect() {
			System.out.println("调用了service");
	}
		
}
