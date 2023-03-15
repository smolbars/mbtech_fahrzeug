import javax.persistence.*;

@Entity
public class AutoTyp {

  private Interger id;
  private String nameTyp;

  @Id
  @Column(name = "id")
  public Integer getId() {
    return this.id;
  }

  @Column(name = "nameTyp")
  public Integer getNameTyp() {
    return this.nameTyp;
  }

}