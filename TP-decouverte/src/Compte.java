
public class Compte {
	
	private String client;
	private int numero;
	private double solde;
	
	
	public Compte()
	{
		
	}

	public Compte(String client, int numero, double solde)
	{
		this.client = client;
		this.numero = numero ;
		this.solde = solde ;
	}

	public String getClient() 
	{
		return client;
	}

	public void setClient(String client)
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
	
	
	

}
