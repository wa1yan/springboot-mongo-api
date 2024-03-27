package dev.waiyanhtet.mongocrud.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressDto {

    private String id;
    private String building;
    private String street;
    private String state;
    private String city;
}
