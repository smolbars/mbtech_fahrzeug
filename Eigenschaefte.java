import javax.persistence.*;

@Entity
public class Fahrzeug {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.ORDINAL)
	private EigenschaftTyp typ;

}