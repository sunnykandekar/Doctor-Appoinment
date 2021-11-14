package com.Appointment.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Appointment.entities.patient;
import com.Appointment.repository.patientRepository;
import com.Appointment.service.EmailSenderService;

@Controller
public class HomeController 
{
	
	@Autowired
	private patientRepository patientRepo;
	
	@Autowired
	private EmailSenderService EmailSender;
	
	
	
// singup form 
	@RequestMapping("/signup")
	   public String signUp(Model  model)
	   {
			  model.addAttribute("title", "signUp- Appointment");
			  model.addAttribute("patient", new patient());
			  
		   return "signUp";
	   }
	
    // create /save insert user
    @RequestMapping(value="/doRegister" ,method=RequestMethod.POST)
  public String registerUser(@Valid @ModelAttribute("patient") patient patient, BindingResult bindingResult , 
        Model model,HttpSession session)
  {
    try {
   	
    	
   	 // email content  display
		 
		 
		 String body = "Appointmentdate : "+patient.getAppointmentdate(); 
		 
			   body += "<br> Name : "+patient.getName();
		       body +="<br> Age :"+patient.getAge();
		       body +="<br> address : "+patient.getAddress();
		       body +="<br> number : "+patient.getNumber();
		       body +="<br> DOB : "+patient.getDob();
		       body +="<br> Blood Group : "+patient.getBloodgroup();
		     
		       EmailSender.sendAttchedEmail(patient.getEmail(), "sunnykandekar28@gmail.com", body,
		    		                        patient.getSubject());
		 
		      	System.out.println("Sent mail Successfully");
   	 
   	 
   	  
		 System.out.println("patient " +patient);
		 
		 patient result= this.patientRepo.save(patient);
		
		 model.addAttribute("patient", new patient());
		 

		 return "signUp";
    }
     catch(Exception e)
   	 {
    	e.printStackTrace();
   		 model.addAttribute("patient", patient);
   		return "signUp";
   	
   	    }
	
   }
    
    
}
