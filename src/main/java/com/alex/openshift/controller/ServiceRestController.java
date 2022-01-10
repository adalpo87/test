package com.alex.openshift.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import com.alex.openshift.model.Contatto;

public class ServiceRestController {
	@RequestMapping("test")
	public List<Contatto> serviceTest(){
		List<Contatto> lista = new ArrayList<Contatto>();
		lista.add(new Contatto("Mario", "Rossi", "mario"));
		lista.add(new Contatto("Giuseppe", "Verdi", "ver"));
		lista.add(new Contatto("Maria", "Bianchi", "mary"));
		return lista;
	}
}
