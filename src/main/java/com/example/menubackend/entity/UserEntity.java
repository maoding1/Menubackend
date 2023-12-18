package com.example.menubackend.entity;

import com.example.menubackend.entity.utils.Ingredient;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Entity
@Table(name = "user1")  // table name "user" is a reserved word in H2
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(unique = true)
    private String uid;

    @NotNull
    private String username;

    @NotNull
    private String password;

    @ElementCollection
    private List<Long> favouriteMenusId;

    @ElementCollection
    private List<Ingredient> unLikes;

}

