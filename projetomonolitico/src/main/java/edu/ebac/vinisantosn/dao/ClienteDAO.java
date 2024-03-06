/**
 * 
 */
package edu.ebac.vinisantosn.dao;

import edu.ebac.vinisantosn.dao.generic.GenericDAO;
import edu.ebac.vinisantosn.domain.Cliente;

/**
 * @author rodrigo.pires
 *
 */
public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super(Cliente.class);
	}

}