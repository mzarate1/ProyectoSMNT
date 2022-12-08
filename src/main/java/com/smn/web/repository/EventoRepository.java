package com.smn.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.smn.web.model.Evento;


@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {
	
	// metodo que genera una lista de emails de todas las personas que esten asociadas a una ciudad.
	@Query(value = "SELECT usu.mail FROM smn.usuariossuscriptos usu inner join smn.suscripciones sus on usu.id_usuario = sus.id_usuario where sus.id_ciudad = ?1", nativeQuery = true)
	List<String> searchByCiudadQueryNative(Long id_ciudad);


}
