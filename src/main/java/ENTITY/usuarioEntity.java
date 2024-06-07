package ENTITY;
//m
import jakarta.persistence.*;

@Entity
@Table(name = "bk_usuarios")
public class usuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, unique = true)
    private String nome;
    @Column(nullable = false, unique = true)
    private String senha;
    @Column(nullable = false, unique = true)
    private String email;

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }
}
