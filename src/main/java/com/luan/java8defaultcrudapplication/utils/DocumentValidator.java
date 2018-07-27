package com.luan.java8defaultcrudapplication.utils;

public class DocumentValidator {

	private String cpf;
	private String cnpj;
	private String email;
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
    public String getEmail() {
    	return this.email;
    }
    
    public void setEmail(String email) {
    	this.email = email;
    }
    
    public Boolean cpfValidation(String cpf) {
    	int soma = 0;
        int resto = 0;

        if (cpf == "") {
            return false;
        } else {
            cpf.replaceAll("/[^0-9]+/g", "");
        }

        if (cpf == "00000000000" || cpf == "11111111111" || cpf == "22222222222" || cpf == "33333333333" ||
         cpf == "44444444444" || cpf == "55555555555" ||
         cpf == "66666666666" || cpf == "77777777777" ||
         cpf == "88888888888" || cpf == "99999999999") {
            return false;
        }
        for (int i = 1; i <= 9; i++) {
            soma = soma + Integer.parseInt(cpf.substring(i - 1, i)) * (11 - i);
            resto = (soma * 10) % 11;
        }

        if ((resto == 10) || (resto == 11)) {
            resto = 0;

        }
        if (resto != Integer.parseInt(cpf.substring(9, 10))) {
            return false;
        }

        // Segundo digito
        soma = 0;

        for (int i = 1; i <= 10; i++) {
            soma = soma + Integer.parseInt(cpf.substring(i - 1, i)) * (12 - i);
        }
        resto = (soma * 10) % 11;

        if ((resto == 10) || (resto == 11)) {
            resto = 0;
        }
        if (resto != Integer.parseInt(cpf.substring(10, 11))) {
            return false;
        }
        return true;
    }
}
