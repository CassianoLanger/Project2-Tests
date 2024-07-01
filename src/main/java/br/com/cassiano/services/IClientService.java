package br.com.cassiano.services;

import br.com.cassiano.domain.Client;

public interface IClientService {

	void save(Client client);

	Client searchByCpf(long cpf);

}
