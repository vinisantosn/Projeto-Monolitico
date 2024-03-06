/**
 * 
 */
package edu.ebac.vinisantosn.service;

import edu.ebac.vinisantosn.domain.Cliente;
import edu.ebac.vinisantosn.exceptions.DAOException;
import edu.ebac.vinisantosn.services.generic.IGenericService;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

}