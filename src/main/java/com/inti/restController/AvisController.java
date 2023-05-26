package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Avis;
import com.inti.services.interfaces.IAvisService;

@RestController
@CrossOrigin
public class AvisController {
	@Autowired
	IAvisService avisService;

	@GetMapping("/avis")
	public List<Avis> findAll() {
		return avisService.findAll();
	}

	@GetMapping("/avis/{idAvis}")
	public Avis findOne(@PathVariable("idAvis") Long id) {
		return avisService.findOne(id);
	}

	@PostMapping("/avis")
	public Avis saveAvis(@RequestBody Avis avis) {
		return avisService.save(avis);
	}

	@DeleteMapping("/avis/{idAvis}")
	public void deleteRole(@PathVariable("idAvis") Long id) {
		avisService.delete(id);
	}

	@PutMapping("/avis/{idAvis}")
	public Avis updateRole(@PathVariable("idAvis") Long id, @RequestBody Avis avis) {
		Avis currentAvis = avisService.findOne(id);
		currentAvis.setTitre(avis.getTitre());
		return avisService.save(currentAvis);
	}
}
