package com.example.demo.model;
import lombok.*;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
@Table(name = "usuario")
@ToString @EqualsAndHashCode
@NoArgsConstructor
public class Usuario implements Serializable {
    @Getter @Setter @Column(name="name")
    private String name;
    @Getter @Setter @Column(name="lastName")
    private String lastName;
    @Getter @Setter @Column(name="id") @Id
    private Long id;

    public Usuario(String name, String lastName, Long id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }

}


