package com.smn.web.repository;



//import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.smn.web.model.Pronostico;

@Repository
public interface PronosticoRepository extends JpaRepository<Pronostico, Long> {


	@Query("SELECT p FROM Pronostico p WHERE p.id_ciudad = ?1 and p.fecha_pronostico  BETWEEN ?2 AND ?3")
	List<Pronostico> findByFilter(Long idCiudadSeleccionada, Date fechaactual, Date fechaextendida);

	@Query("SELECT p FROM Pronostico p WHERE p.fecha_pronostico > ?1")
	List<Pronostico> findByFecha(Date date);


}
