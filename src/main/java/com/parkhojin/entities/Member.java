package com.parkhojin.entities;

import com.parkhojin.commons.constants.MemberType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @Builder
@NoArgsConstructor @AllArgsConstructor
public class Member extends Base{

    @Id @GeneratedValue
    private Long seq; // 기본키 자동 증감

    @Column(length = 65, unique = true, nullable = false)
    private String email;

    @Column(length = 65, nullable = false)
    private String password;

    @Column(length = 40, nullable = false)
    private String name;

    @Column(length = 11)
    private String mobile;

    @Enumerated(EnumType.STRING)
    @Column(length = 15, nullable = false)
    private MemberType type = MemberType.USER;
}
