package com.Appointment.service;


import java.io.File;
import java.util.Date;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.Appointment.entities.patient;
import com.Appointment.repository.patientRepository;

@Service
public class EmailSenderService 
{
	

	
	@Autowired
	private JavaMailSender mailsender ;
	
	
	public void sendAttchedEmail( String email, String toEmail, String body, String subject /*,String uploadfile*/) throws MessagingException
    {
   	MimeMessage mimeMessage = mailsender.createMimeMessage();
   	
   	MimeMessageHelper mimeMessageHelper =new MimeMessageHelper(mimeMessage, true);
   	mimeMessageHelper.setFrom(email); 
   	mimeMessageHelper.setTo(toEmail);
   	mimeMessageHelper.setSubject(subject);
   	mimeMessageHelper.setText(body, true);
   	mimeMessageHelper.setSentDate(new Date());
   	
   	/*FileSystemResource fileSystem= new FileSystemResource( new File(uploadfile));
	mimeMessageHelper.addAttachment(fileSystem.getFilename(), fileSystem);*/
   	
   	mailsender.send(mimeMessage);
   	System.out.println("Sent mail Successfully");
     
  }
}



























