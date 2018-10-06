package com.sudhir;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

public class PasswordEncoder {
public static void main(String[] args) {
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	String result = encoder.encode("user");
	System.out.println(result);
}
}
