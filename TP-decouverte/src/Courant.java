
public class Courant extends Compte{
	private Client client;
	private int numero;
	private double solde;
	private double decouvertAutorise;
	
	public Courant ()
	{
		
	}
	
	public Courant(Client client, int numero, double solde, double decouvertAutorise)
	{
		super(client, numero, solde);
		this.decouvertAutorise = decouvertAutorise;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}

	public void setDecouvertAutorise(double decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}

	
	
	
}

