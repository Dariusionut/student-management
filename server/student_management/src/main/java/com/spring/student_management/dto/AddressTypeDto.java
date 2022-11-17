package com.spring.student_management.dto;

import com.spring.student_management.dto.parents.PrimaryDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * Created at 11/14/2022 by Darius
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class AddressTypeDto extends PrimaryDto {

    private static final long serialVersionUID = -960699201941104509L;
    private String type;
}
