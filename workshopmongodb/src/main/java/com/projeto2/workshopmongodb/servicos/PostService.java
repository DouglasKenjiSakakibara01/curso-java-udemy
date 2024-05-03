package com.projeto2.workshopmongodb.servicos;

import java.util.*;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto2.workshopmongodb.dto.UserDTO;
import com.projeto2.workshopmongodb.entidades.Post;
import com.projeto2.workshopmongodb.entidades.User;
import com.projeto2.workshopmongodb.repositorios.PostRepository;
import com.projeto2.workshopmongodb.servicos.exceptions.ObjectNotFoundException;

@Service
public class PostService {
    @Autowired
	private PostRepository repo;

	public List<Post> findAll() {
		return repo.findAll();
	}
    public Post findById(String id) {
		Optional<Post> obj= repo.findById(id);
    	return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
   }

    public Post insert(Post obj) {
        return repo.insert(obj);
   }
   
    public void delete(String id) {
        findById(id);
        repo.deleteById(id);
    }

    public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
    public List<Post> findByTitle(String text) {
		return repo.searchTitle(text);
	    // return repo.findByTitleContainingIgnoreCase(text);
	}
    public List<Post> fullSearch(String text, Date minDate, Date maxDate) {
		maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
		return repo.fullSearch(text, minDate, maxDate);
	}
    
}
