package tn.esprit.timesheet.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employe implements Serializable {
	
	private static final long serialVersionUID = 1L;
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String prenom;
	
	private String nom;
	
	//@Column(unique=true)
	private String email;
	
	private String password;	
	
	private Boolean isActif;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@ManyToMany(mappedBy="employes")
	//@NotNull
	private List<Departement> departements;
	
	@OneToOne(mappedBy="employe")
	private Contrat contrat;
	
	@OneToMany(mappedBy="employe")
	private List<Timesheet> timesheets;
	
	
	public Employe() {
	}
	
	public Employe(String nom, String prenom, String email, String password, Boolean isActif, Role role) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password; 
		this.isActif = isActif;
		this.role = role;
	}
	
	
	
	public Employe(int id, String prenom, String nom, String email, String password, Boolean isActif, Role role) {
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.password = password;
		this.isActif = isActif;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getIsActif() {
		return isActif;
	}

	public void setIsActif(Boolean isActif) {
		this.isActif = isActif;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Departement> getDepartements() {
		return departements;
	}

	public void setDepartements(List<Departement> departement) {
		this.departements = departement;
	}

	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	public List<Timesheet> getTimesheets() {
		return timesheets;
	}

	public void setTimesheets(List<Timesheet> timesheets) {
		this.timesheets = timesheets;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", email=" + email + ", password="
				+ password + ", isActif=" + isActif + ", role=" + role + ", departements=" + departements + ", contrat="
				+ contrat + ", timesheets=" + timesheets + "]";
	}
	
	
	
}
