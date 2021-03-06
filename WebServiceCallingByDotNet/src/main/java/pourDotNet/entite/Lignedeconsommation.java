package pourDotNet.entite;
// Generated 2 avr. 2018 22:14:16 by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Lignedeconsommation generated by hbm2java
 */
@Entity
@Table(name = "lignedeconsommation")
public class Lignedeconsommation implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numlc;
	private Article article;
	private Demandedeconsommation demandedeconsommation;
	private BigDecimal prixhorstaxe;
	private Integer quantitecommande;
	private Set<Article> articles = new HashSet<Article>(0);

	public Lignedeconsommation() {
	}

	public Lignedeconsommation(int numlc, Demandedeconsommation demandedeconsommation) {
		this.numlc = numlc;
		this.demandedeconsommation = demandedeconsommation;
	}

	public Lignedeconsommation(int numlc, Article article, Demandedeconsommation demandedeconsommation,
			BigDecimal prixhorstaxe, Integer quantitecommande, Set<Article> articles) {
		this.numlc = numlc;
		this.article = article;
		this.demandedeconsommation = demandedeconsommation;
		this.prixhorstaxe = prixhorstaxe;
		this.quantitecommande = quantitecommande;
		this.articles = articles;
	}

	@Id

	@Column(name = "numlc", unique = true, nullable = false)
	public int getNumlc() {
		return this.numlc;
	}

	public void setNumlc(int numlc) {
		this.numlc = numlc;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "numart")
	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "numdc", nullable = false)
	public Demandedeconsommation getDemandedeconsommation() {
		return this.demandedeconsommation;
	}

	public void setDemandedeconsommation(Demandedeconsommation demandedeconsommation) {
		this.demandedeconsommation = demandedeconsommation;
	}

	@Column(name = "prixhorstaxe", precision = 131089, scale = 0)
	public BigDecimal getPrixhorstaxe() {
		return this.prixhorstaxe;
	}

	public void setPrixhorstaxe(BigDecimal prixhorstaxe) {
		this.prixhorstaxe = prixhorstaxe;
	}

	@Column(name = "quantitecommande")
	public Integer getQuantitecommande() {
		return this.quantitecommande;
	}

	public void setQuantitecommande(Integer quantitecommande) {
		this.quantitecommande = quantitecommande;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lignedeconsommation")
	public Set<Article> getArticles() {
		return this.articles;
	}

	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}

}
