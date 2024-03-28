package com.spring.ex01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//Controller : 기본 컨트롤러 인터페이스, HttpServletRequest 및 HttpServletResponse 인스턴스를 수신하지만 MVC 워크플로우에 참여할 수 있는 구성 요소를 나타냅니다. 컨트롤러는 스트러츠 액션(Struts Action)의 개념과 유사합니다.
public class SimpleUrlController2 implements Controller{

	//ModelAndView : 웹 MVC 프레임워크에서 모델과 뷰 모두에 대한 홀더입니다. 이들은 완전히 구별됩니다.
	//이 클래스는 단지 컨트롤러가 모델과 뷰를 하나의 반환 값으로 둘 다 반환할 수 있도록 둘 다를 유지합니다.
	//DispatcherServlet에서 해결하기 위해 처리기에서 반환하는 모델 및 뷰를 나타냅니다.
	//뷰는 ViewResolver 개체에서 해결해야 하는 String 뷰 이름의 형식을 취할 수 있으며, View 개체를 직접 지정할 수도 있습니다. 모델은 Map으로 이름으로 키를 입력한 여러 개체를 사용할 수 있습니다.
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		ModelAndView mav = new ModelAndView("index2.jsp");
		
		return mav;
	}

	
	
}
