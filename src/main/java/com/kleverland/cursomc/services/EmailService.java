package com.kleverland.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.kleverland.cursomc.domain.Cliente;
import com.kleverland.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}