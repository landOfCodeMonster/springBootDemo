package fr.estiam.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.estiam.demo.entities.Voiture;

public interface VoitureRepository extends JpaRepository<Voiture, Long>{

}
