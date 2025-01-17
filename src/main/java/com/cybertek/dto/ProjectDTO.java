package com.cybertek.dto;


import com.cybertek.utils.Status;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProjectDTO {

    private Long id;
    private String projectName;
    private String projectCode;
    private UserDTO assignedManager;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;

    private String projectDetail;
    private Status projectStatus;

    private int completeTaskCounts;
    private int unfinishedTaskCounts;


}
