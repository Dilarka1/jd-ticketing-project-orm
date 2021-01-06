package com.cybertek.service;

import com.cybertek.dto.TaskDTO;

import java.util.List;

public interface PendingService extends CrudService<TaskDTO, Long> {

    List<TaskDTO> findTaskByStatus(TaskDTO status);

}
