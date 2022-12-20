package com.sparta.soundsea.user.entity;

import lombok.Getter;

@Getter
public enum UserRole {
    FOREIGN(Authority.FOREIGN),
    USER(Authority.USER),  // 사용자 권한
    ADMIN(Authority.ADMIN);  // 관리자 권한

    // Member의 권한을 String 값으로 사용하기 위함
    private final String authority;

    UserRole(String authority) {
        this.authority = authority;
    }

    public static class Authority {
        public static final String FOREIGN = "ROLE_FOREIGN";
        public static final String USER = "ROLE_USER";
        public static final String ADMIN = "ROLE_ADMIN";
    }
}
