package br.com.octa.form;

import br.com.octa.sap.SusrUserChangePasswordRfc;
import lombok.Data;

@Data
public class ChangePassWordSapUserForm {

	private String userId;
	private String password;
	private String newPassword;

	public SusrUserChangePasswordRfc toSusrUserChangePasswordRfc() {
		return new SusrUserChangePasswordRfc(this.userId, this.password, this.newPassword, 1);
	}

}
