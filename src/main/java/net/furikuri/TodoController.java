package net.furikuri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoRepository repository;

    @RequestMapping("/")
    public List<Todo> getAll() {
        return repository.findAll();
    }
}
