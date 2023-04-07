package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import dao.studentdao;
import dto.studentdto;
@Controller
public class studentcontroller {
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public ModelAndView insert(){
		ModelAndView modelAndView = new ModelAndView("insert.jsp");
		studentdto dto = new studentdto();
		modelAndView.addObject("savedata", dto);
		return modelAndView;
	}
		@ResponseBody
		@RequestMapping("insert")
		public void savedata(studentdto dto){
			studentdao  dao = new studentdao();
			dao.insert(dto);
		}
		@RequestMapping("/delete")
		public  ModelAndView delete(){
			ModelAndView modelAndView = new ModelAndView("delete.jsp");
			studentdto dto1=new studentdto();
			modelAndView.addObject("deletebyid", dto1);
			return modelAndView;
		}

	@ResponseBody
	@RequestMapping("/deleteData")
	public void deleteDat1( int id){
		studentdao dao = new studentdao();
		dao.deleteData(id);
}
	@RequestMapping("/fetchall")
	public  ModelAndView fetchall(){
		studentdao dao = new studentdao();
		List<studentdto> emplist = dao.fetchall();
		ModelAndView modelAndView4 = new ModelAndView("fetchall.jsp");
		studentdto dto3=new studentdto();
		modelAndView4.addObject("fetchbyall", dto3);
		return modelAndView4;
	}
}
