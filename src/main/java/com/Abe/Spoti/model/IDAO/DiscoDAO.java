package com.Abe.Spoti.Model.IDAO;

import java.util.List;

import com.Abe.Spoti.Model.DataObject.Artista;
import com.Abe.Spoti.Model.DataObject.Disco;

public interface DiscoDAO extends IDAO<Disco, Long>{
	
	/**
	 * Método que muestra los disco de cada artista
	 * @param aux el artista por el que queremos filtrar la búsqueda
	 * @return la lista de discos en las que el artista es el autor
	 * @throws DAOException
	 */
	List<Disco>mostrarDiscosPorArtista(Artista aux) throws DAOException;

}
