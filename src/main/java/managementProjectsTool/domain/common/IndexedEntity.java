package managementProjectsTool.domain.common;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class IndexedEntity implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
