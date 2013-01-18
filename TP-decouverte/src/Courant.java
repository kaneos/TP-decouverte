
public class Courant extends Compte{
	private String client;
	private int numero;
	private double solde;
	private double decouvertAutorise;
	
	public Courant ()
	{
		super();
		this.decouvertAutorise=48648646;
	}
	
	public Courant(String client, int numero, double solde, double decouvertAutorise)
	{
		super(client, numero, solde);
		this.decouvertAutorise = decouvertAutorise;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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
	
	public String toString()
	{
		return ("[Client] = "+this.client+" ; [Numero] = "+this.numero+" ; [Solde] = "+this.solde+" ; [Decouvert autorisé] = "+this.decouvertAutorise );
	}
	
	public void crediter(double montant)
	{
		this.solde = this.solde + montant ;
	}
	
	public boolean debiter(double montant)
	{
		boolean possible = true;
		if (montant > this.solde)
		{
			possible = false;
		}
		else
		{
			this.solde = this.solde - montant ;
		}
		
		return possible;
	}
	
	
	
}

