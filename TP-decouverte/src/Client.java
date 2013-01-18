import java.util.ArrayList;


public class Client 
{
	private ArrayList<Compte> lesComptes;
	private String nom;
	private String prenom;
	
	public Client(ArrayList<Compte> lesComptes, String nom, String prenom) 
	{
		this.lesComptes = lesComptes;
		this.nom = nom;
		this.prenom = prenom;
	}

	public ArrayList<Compte> getLesComptes()
	{
		return lesComptes;
	}

	public void setLesComptes(ArrayList<Compte> lesComptes)
	{
		this.lesComptes = lesComptes;
	}

	public String getNom() 
	{
		return nom;
	}

	public void setNom(String nom) 
	{
		this.nom = nom;
	}

	public String getPrenom() 
	{
		return prenom;
	}

	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}
	
	
}
