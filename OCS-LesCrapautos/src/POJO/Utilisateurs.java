package POJO;

public class Utilisateurs {
	private int id_Utilisateur;
	private String nomUtilisateur;
	private String prenomUtilisateur;
	private String loginUtilisateur;
	private String emailUtilisateur;
	private String roleUtilisateur;
	
	public Utilisateurs(int id_Utilisateur, String nomUtilisateur, String prenomUtilisateur, String loginUtilisateur,
			String emailUtilisateur, String roleUtilisateur) {
		super();
		this.id_Utilisateur = id_Utilisateur;
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.loginUtilisateur = loginUtilisateur;
		this.emailUtilisateur = emailUtilisateur;
		this.roleUtilisateur = roleUtilisateur;
	}

	public int getId_Utilisateur() {
		return id_Utilisateur;
	}

	public void setId_Utilisateur(int id_Utilisateur) {
		this.id_Utilisateur = id_Utilisateur;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}

	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}

	public String getLoginUtilisateur() {
		return loginUtilisateur;
	}

	public void setLoginUtilisateur(String loginUtilisateur) {
		this.loginUtilisateur = loginUtilisateur;
	}

	public String getEmailUtilisateur() {
		return emailUtilisateur;
	}

	public void setEmailUtilisateur(String emailUtilisateur) {
		this.emailUtilisateur = emailUtilisateur;
	}

	public String getRoleUtilisateur() {
		return roleUtilisateur;
	}

	public void setRoleUtilisateur(String roleUtilisateur) {
		this.roleUtilisateur = roleUtilisateur;
	}

	@Override
	public String toString() {
		return "Utilisateurs [id_Utilisateur=" + id_Utilisateur + ", nomUtilisateur=" + nomUtilisateur
				+ ", prenomUtilisateur=" + prenomUtilisateur + ", loginUtilisateur=" + loginUtilisateur
				+ ", emailUtilisateur=" + emailUtilisateur + ", roleUtilisateur=" + roleUtilisateur + "]";
	}
}
