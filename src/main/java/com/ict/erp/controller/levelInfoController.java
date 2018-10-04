package com.ict.erp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ict.erp.service.impl.LevelServiceImpl;
import com.ict.erp.vo.LevelInfo;

@Controller
public class levelInfoController {

	@Autowired
	private LevelServiceImpl ls;
	@RequestMapping(value="/levelinfo", method=RequestMethod.GET)
//	public String getLevelInfo(Model m,@RequestParam Map<String,String> map) {
	public String getLevelInfo(Model m, @ModelAttribute LevelInfo li) {
		m.addAttribute("liList",ls.getList(li));
		return "levelinfo/list";
	}
//	같은 것을 하는
//	@RequestMapping(value="/levelinfo", method=RequestMethod.GET)
//	public String getLevelInfo(Model m,@RequestParam Map<String,String> map) {
//	public ModelAndView getLevelInfo2(@ModelAttribute LevelInfo li , ModelAndView mav) {
//		mav.setViewName("levelinfo/list");
//		mav.addObject("liList",ls.getList(li));
//		return mav;
//	}
}
