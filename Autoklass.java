import javax.persistence.*;

@Entity
public class Autoklass {

  private Interger id;
  private String nameKlass;

  @Id
  @Column(name = "id")
  public Integer getId() {
    return this.id;
  }

  @Column(name = "nameKlass")
  public Integer getNameKlass() {
    return this.nameKlass;
  }

}