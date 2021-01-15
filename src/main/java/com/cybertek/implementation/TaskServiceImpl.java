package com.cybertek.implementation;

import com.cybertek.dto.TaskDTO;
import com.cybertek.entity.Task;
import com.cybertek.entity.User;
import com.cybertek.mapper.TaskMapper;
import com.cybertek.repository.TaskRepository;
import com.cybertek.service.TaskService;
import com.cybertek.utils.Status;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class TaskServiceImpl implements TaskService {

    TaskRepository taskRepository;
    TaskMapper taskMapper;

    public TaskServiceImpl(TaskRepository taskRepository, TaskMapper taskMapper) {
        this.taskRepository = taskRepository;
        this.taskMapper = taskMapper;
    }

    @Override
    public TaskDTO findById(Long id) {
        return null;
    }

    @Override
    public List<TaskDTO> listAllTasks() {
        List<Task>list = taskRepository.findAll(Sort.by("task_subject"));
        return list.stream().map(taskMapper::convertToDTO).collect(Collectors.toList());


        //return list.stream().map(obj -> {return taskMapper.convertToDTO(obj);}).collect(Collectors.toList());
    }

    @Override
    public Task save(TaskDTO dto) {
        dto.setTaskStatus(Status.OPEN);
        dto.setAssignedDate(LocalDate.now());
        Task task = taskMapper.convertToEntity(dto);
        return  taskRepository.save(task);

    }

    @Override
    public void update(TaskDTO dto) {

    }

    @Override
    public void delete(Long id) {

    }
}
