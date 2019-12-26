package com.ce;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarterController {
	@Autowired
	DaoClass da;
@RequestMapping("/hi")
List<BeanClass> call()
{
	return da.getAllBeanClass();
}
}
