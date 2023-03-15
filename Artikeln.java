import javax.persistence.*;

@Entity
public class Fahrzeug {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String Artikel;

    @ManyToOne
    private Eigenschaft farbe;
	
	@ManyToOne
    private Eigenschaft motorLeistung;
	
	@ManyToOne
    private Eigenschaft sonderAusstattung;
	
	// wird kalkuliert im Kontroller
	private int preis;

}