package com.team13.hospital.domain.dto;

import com.team13.hospital.domain.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
// @Builder 를 사용하려면 @AllArgsConstructor 필요하다.
public class MemberResponse {
    private Long id;
    private boolean admin;
    private String name;
    private int age;

    // 생성자로 만들면 값이 없을 때 실행은 안된다

    // static 을 붙히면 인스턴스를 생성하지 않고 바로 붙힐 수 있음.
    public static MemberResponse of(Member entity) {
        return MemberResponse.builder()
                .id(entity.getId())
                .admin(entity.isAdmin())
                .name(entity.getName())
                .age(entity.getAge())
                .build();
    }
}
