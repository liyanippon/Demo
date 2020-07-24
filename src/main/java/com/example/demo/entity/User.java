package com.example.demo.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class User implements Serializable{
	private Long id;
	private String username;
	private String password;
}
