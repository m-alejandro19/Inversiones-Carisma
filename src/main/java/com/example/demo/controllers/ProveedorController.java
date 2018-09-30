package com.example.demo.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.models.entities.Proveedor;
import com.example.demo.models.services.IProveedorService;

@Controller
@SessionAttributes("proveedor")
public class ProveedorController {
	
	@Autowired
	private IProveedorService proveedorService;
	
	@RequestMapping(value="/listar", method=RequestMethod.GET)
	public String listar(Model model)
	{
		model.addAttribute("titulo","listado de cliente");
		model.addAttribute("proveedor", proveedorService.findAll());
		return "Listar";
	}
	
	}
