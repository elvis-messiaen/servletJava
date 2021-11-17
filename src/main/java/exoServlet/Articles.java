package exoServlet;



public class Articles {
	private String UID;
	private String titre;
	private String contenu;
	
	
	public Articles() {
	}

	public Articles(String uID, String titre, String contenu) {
		super();
		UID = uID;
		this.titre = titre;
		this.contenu = contenu;
	}

	public String getUID() {
		return UID;
	}

	public void setUID(String uID) {
		UID = uID;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}


	@Override
	public String toString() {
		return "Articles [UID=" + UID + ", titre=" + titre + ", contenu=" + contenu +  "]";
	}
	
	
}