package fr.estiam.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.estiam.demo.dao.VoitureRepository;
import fr.estiam.demo.entities.Voiture;
import fr.estiam.utils.Utils;

@SpringBootApplication
public class DemoSpringApplication implements CommandLineRunner{

	@Autowired
	private VoitureRepository vr;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		for(int i =0; i < 50; i++) {
			vr.save(new Voiture(Utils.gererate(), Utils.genererNombreA6Chiffres(), "red", false));
		}
		
		List<Voiture> voitures = vr.findAll();
		
		for(Voiture voiture: voitures) {
			System.out.println("id : "+voiture.getId()+ " name: "
		+ voiture.getName() + " price: "+ voiture.getPrice() + " Couleur : "+ voiture.getColor());
		}
	}

}
