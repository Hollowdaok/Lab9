package com.denys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Number id;
    private String email;
    private String password;
    private String name;
    private String role;
    private String avatar; // url to image
}
