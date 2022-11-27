package com.team13.hospital.domain.dto;

import com.team13.hospital.domain.entity.Hospital;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class HospitalResponse {
    private String fullAddress;
    private String hospitalName;
    private String businessTypeName;

    public static HospitalResponse of(Hospital entity){
        return HospitalResponse.builder()
                .fullAddress(entity.getFullAddress())
                .hospitalName(entity.getHospitalName())
                .businessTypeName(entity.getBusinessTypeName())
                .build();
    }

}
