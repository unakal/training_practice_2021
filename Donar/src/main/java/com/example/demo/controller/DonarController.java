package com.example.demo.controller;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Donar;
import com.example.demo.service.DonarService;

@Controller
public class DonarController {

	private DonarService service;

	public DonarController(DonarService service) {
		super();
		this.service = service;
	}
	@GetMapping("/donar")
	public String listDonars(Model model) {
		model.addAttribute("donar", service.getAllDonars());
		return "donar";
	}
	
	
	@GetMapping("/donar/new")
	public String createDonarForm(Model model) {
		Donar donar=new Donar();
		model.addAttribute("donar", donar);
		return "createdonar";
		
	}
	@PostMapping("/donar")
	public String saveDonar(@ModelAttribute("doanr") Donar donar) {
		service.saveDonar(donar);
		return "redirect:/donar";
	}
	@GetMapping("/donar/edit/{donarid")
	public String editDonarForm(@PathVariable int donarid,Model model) {
		model.addAttribute("donar", service.getDonarById(donarid));
		return "editdonar";
	}
	@PostMapping("/donar/{donarid}")
	public String updateDonar(@PathVariable int donarid,@ModelAttribute("donar")Donar donar,Model model) {
		Donar exisitDonar = service.getDonarById(donarid);
		exisitDonar.setDonarid(donar.getDonarid());
		exisitDonar.setDonarname(donar.getDonarname());
		exisitDonar.setGender(donar.getGender());
		exisitDonar.setAge(donar.getAge());
		exisitDonar.setDateofbirth(donar.getDateofbirth());
		exisitDonar.setBloodgroup(donar.getBloodgroup());
		exisitDonar.setLastblooddonationdate(donar.getLastblooddonationdate());
		exisitDonar.setEmailid(donar.getEmailid());
		exisitDonar.setPhoneno(donar.getPhoneno());
		exisitDonar.setState(donar.getState());
		exisitDonar.setCity(donar.getCity());
		
		service.updateDonar(exisitDonar);
		return "redirect:/donar";
	}
	@GetMapping("/doanr/{donarid}")
	public String deleteDonar(@PathVariable int donarid) {
		service.deleteDonarByid(donarid);
		return "redirect:/donar";
	}
}
