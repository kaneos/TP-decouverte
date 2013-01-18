import java.util.ArrayList;


public class Banque
{
	private ArrayList<Client> lesClients;

	public Banque(ArrayList<Client> lesClients) 
	{
		this.lesClients = lesClients;
	}

	public ArrayList<Client> getLesClients()
	{
		return lesClients;
	}

	public void setLesClients(ArrayList<Client> lesClients)
	{
		this.lesClients = lesClients;
	}
	
	
}
