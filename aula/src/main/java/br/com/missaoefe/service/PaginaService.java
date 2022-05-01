package br.com.missaoefe.service;

import org.springframework.stereotype.Service;

@Service
public class PaginaService {
 public String paginaIndex() {
	 return "index";
 }
 
 
 public String paginaTeste() {
	 return "teste";
 }
}
