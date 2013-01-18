
public class Compte {
	
	private Client client;
	private int numero;
	private double solde;
	
	
	public Compte()
	{
		
	}

	public Compte(Client client, int numero, double solde)
	{
		this.client = client;
		this.numero = numero ;
		this.solde = solde ;
	}

	public Client getClient() 
	{
		return client;
	}

	public void setClient(Client client)
	{
		this.client = client;
	}

	public int getNumero() 
	{
		return numero;
	}

	public void setNumero(int numero)
	{
		this.numero = numero;
	}

	public double getSolde() 
	{
		return solde;
	}

	public void setSolde(double solde) 
	{
		this.solde = solde;
	}
	
	public String toString()
	{
		return ("[Client] = "+this.client+" ; [Numero] = "+this.numero+" ; [Solde] = "+this.solde);
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
	
	public boolean transfertMontant(double montant, Compte unCompte)
	{
		boolean possible = false;
		if(debiter(montant))
		{
			unCompte.crediter(montant);
		}
		return possible;
	}
	
	public boolean comparerMontant(Compte unCompte)
	{
		boolean possible = true;
		if(this.getSolde() < unCompte.getSolde())
		{
			possible = false;
		}
		return possible;
	}
	
	
	

}
