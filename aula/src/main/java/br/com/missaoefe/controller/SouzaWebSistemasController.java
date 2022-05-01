package br.com.missaoefe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.missaoefe.repositories.CartaoMembroRepository;
import br.com.missaoefe.repositories.MembroRepository;
@Controller
@RequestMapping("/souzawebsistemas")

public class SouzaWebSistemasController {

	private String pctLojas="souzawebsistemas/souzawebsistemas-comercial/souzawebsistemas-lojasvirtuais/usuarios/";
	private String pctLanchonetes="souzawebsistemas/souzawebsistemas-comercial/souzawebsistemas-lanchonete/usuarios/";
    private String pctPadarias="souzawebsistemas/souzawebsistemas-comercial/souzawebsistemas-padarias/usuarios/";
    private String pctIgrejas="souzawebsistemas/souzawebsistemas-cristao/souzawebsistemas-igrejas/usuarios/";
    //private String pctIgrejasMembro="souzawebsistemas/souzawebsistemas-cristao/souzawebsistemas-igrejas/membros/";
    private String pctEscolas="souzawebsistemas/souzawebsistemas-educacao/souzawebsistemas-escolas/usuarios/";
    
    @Autowired
    private MembroRepository membroRepository;
   
	private String pctSite="souzawebsistemas/modelo_bootstrap/inicio";
    
    @GetMapping("/inicio")//  http://localhost:8080/souzawebsistemas/inicio
	public String inicio() {
		return pctSite;
	}
    
	@GetMapping("/index")//  http://localhost:8080/souzawebsistemas/index
	public String index() {
		return "souzawebsistemas/index";
	}
	
	@GetMapping("/slidefoto3")//   http://localhost:8080/souzawebsistemas/slidefoto3
	public String slidefoto() {
		return "souzawebsistemas/slidefoto3";
	}
	
	
	@GetMapping("/planos")//   http://localhost:8080/souzawebsistemas/slidefoto3
	public String planos() {
		return "souzawebsistemas/planos2";
	}
	
	
	@GetMapping("/comercial/lojas")//  http://localhost:8080/souzawebsistemas/comercial/lojas
	public String lojas() {
		return  pctLojas+"cadastroloja";
	}
	
	
	@GetMapping("/comercial/lanchonetes")//  http://localhost:8080/souzawebsistemas/comercial/lanchonetes
	public String lanchonetes() {
		return  pctLanchonetes+"cadastrolanchonete";
	}
	
	@GetMapping("/comercial/padarias")//  http://localhost:8080/souzawebsistemas/comercial/padarias
	public String padarias() {
		return  pctPadarias+"cadastropadaria";
	}
	
	
	// -------------------IGREJAS--------------------------------------------------------------
	@GetMapping("/cristao/modelos")// http://localhost:8080/souzawebsistemas/cristao/modelos
	public String modeloigreja() {
		return "redirect:/igrejas/listarmembros";
	}
	
	@GetMapping("/cristao/igrejas")// http://localhost:8080/souzawebsistemas/cristao/igrejas
	public String igrejas() {
		return  pctIgrejas+"cadastroigreja";
	}
	///======================ESCOLAS=========================================
	/*@GetMapping("/educacao/modelos")// http://localhost:8080/souzawebsistemas/educacao/escolas
	public String modeloescolas() {
		return "redirect:/igrejas/listarescolas";
	}*/
	
	//----------------------------------------------------
	@GetMapping("/educacao/escolas")// http://localhost:8080/souzawebsistemas/educacao/escolas
	public String escolas() {
		return  pctEscolas+"cadastroescola";
	}
	
	//==============================================================================
	 @GetMapping("/cristao/voltar")//  http://localhost:8080/souzawebsistemas/voltar
		public String voltarParaOInicio() {
		 membroRepository.deleteAll();
			return pctSite;
		}
}
