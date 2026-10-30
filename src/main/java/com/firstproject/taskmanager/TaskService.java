package com.firstproject.taskmanager;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> getAll() {
        return repository.findAll();
    }

    public Optional<Task> getById(Long id) {
        return repository.findById(id);
    }

    public Task create(String title) {
        Task task = new Task();
        task.setTitle(title);
        return repository.save(task);
    }

    public Optional<Task> update(Long id, String title, boolean done) {
        return repository.findById(id).map(existing -> {
            existing.setTitle(title);
            existing.setDone(done);
            return repository.save(existing);
        });
    }

    public boolean delete(Long id) {
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }
}