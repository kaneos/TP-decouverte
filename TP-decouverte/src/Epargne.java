
public class Epargne extends Compte{
	private Client client;
	private int numero;
	private double solde;
	private double decouvertAutorise;
	private double tauxInteret;
	
	
	public Epargne ()
	{
		
	}
	
	public Epargne(Client client, int numero, double solde, double decouvertAutorise)
	{
		super(client, numero, solde);
		this.decouvertAutorise = decouvertAutorise;
	}

	public double getSolde() {
		solde = solde + solde*tauxInteret;
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public double getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}

	

	
	
	
	
	
}

