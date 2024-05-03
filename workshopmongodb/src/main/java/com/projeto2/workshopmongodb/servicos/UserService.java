package com.projeto2.workshopmongodb.servicos;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto2.workshopmongodb.dto.UserDTO;
import com.projeto2.workshopmongodb.entidades.User;
import com.projeto2.workshopmongodb.repositorios.UserRepository;
import com.projeto2.workshopmongodb.servicos.exceptions.ObjectNotFoundException;

@Service
public class UserService {
    @Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}
    public User findById(String id) {
		Optional<User> obj= repo.findById(id);
    	return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
   }

    public User insert(User obj) {
        return repo.insert(obj);
   }
   
    public void delete(String id) {
        findById(id);
        repo.deleteById(id);
    }

   public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
}