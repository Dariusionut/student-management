package com.spring.student_management.dto;

import com.spring.student_management.dto.parents.PrimaryDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * Created at 11/13/2022 by Darius
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuperBuilder
public class RoleDto extends PrimaryDto {

    private static final long serialVersionUID = -1669105532346660072L;

    private String roleName;
}
