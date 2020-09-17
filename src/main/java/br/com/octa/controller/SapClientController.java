package br.com.octa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.octa.form.ChangePassWordSapUserForm;
import br.com.octa.service.impl.SapSu01ServiceImpl;

@RestController
@RequestMapping("/sap")
public class SapClientController {

	@Autowired
	SapSu01ServiceImpl sapSu01ServiceImpl;
	
	@PostMapping("/user/changepassword")
	public String changePassWord(@RequestBody ChangePassWordSapUserForm form) {
		return sapSu01ServiceImpl.changePassword(form);
	}
	
	@RequestMapping("/user/unlock")
	public String unlockUser(String userId) {
		System.out.println("Nome de usuário:"+userId);
		return sapSu01ServiceImpl.unlockUser(userId);
	}

	@RequestMapping("/user/lock")
	public String lockUser(String userId) {
		System.out.println("Nome de usuário:"+userId);
		return sapSu01ServiceImpl.lockUser(userId);
	}
	
	@RequestMapping("/user/resetpassword")
	public String resetUser(String userId) {
		System.out.println("Nome de usuário:"+userId);
		return sapSu01ServiceImpl.resetPassword(userId);
	}
}
