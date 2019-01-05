package be.pxl.wijn;

import java.time.LocalDate;

public class Wijn {
    private String naam, omschrijving, druivenras, kleur, land, regio, serveerTip;
    private double alcoholPercentage;
    private int jaargang;

    Wijn(String naam, String kleur, String land) {
        this.jaargang = LocalDate.now().getYear() - 1;
        this.alcoholPercentage = 12.5;

    }

    Wijn(String naam, String land, String kleur, int jaargang, double alcoholPercentage) {

        }


    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public String getDruivenras() {
        return druivenras;
    }

    public void setDruivenras(String druivenras) {
        this.druivenras = druivenras;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        while (kleur != "Wit" && kleur != "Rood" && kleur != "Rosé") {
            kleur = "Rood";
        }
        this.kleur = kleur;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        while (land != "Frankrijk" && land != "Chili" && land != "Italië" && land !="Spanje") {
            System.out.println("Onbekend, geef een geldig land op!");
            System.out.println(" Dit kan Frankrijk, Chili, Italië of Spanje zijn. ");
        }
        this.land = land;
    }

    public String getRegio() {
        return regio;
    }

    public void setRegio(String regio) {
        this.regio = regio;
    }

    public String getServeerTip() {
        return serveerTip;
    }

    public void setServeerTip(String serveerTip) {
        this.serveerTip = serveerTip;
    }

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public void setAlcoholPercentage(double alcoholPercentage) {
        if (alcoholPercentage < 0) {
            alcoholPercentage = 0;
        } else if (alcoholPercentage > 17) {
            alcoholPercentage = 17;
        } else {
            alcoholPercentage = alcoholPercentage;
        }
        this.alcoholPercentage = alcoholPercentage;
    }

    public int getJaargang() {
        return jaargang;
    }

    public void setJaargang(int jaargang) {
        if (jaargang < 1950) {
            jaargang = 1950;
        } else if (jaargang > LocalDate.now().getYear()) {
            jaargang = LocalDate.now().getYear();
        } else {
            jaargang = jaargang;
        }
        this.jaargang = jaargang;
    }

    public double getAdviesPrijs() {
        double prijs;
        if (land.equals("Frankrijk")) {
            prijs = 7.50;
        } else if (land.equals("chili")) {
            prijs = 8.25;
        } else if (land.equals("Italië")) {
            prijs = 9.30;
        } else if (land.equals("Spanje")) {
            prijs = 6.45;
        } else {
            prijs = 9.30;
        }
        if (jaargang % 10 != 7) {
            prijs += (LocalDate.now().getYear() - jaargang) * 0.1;
        }

    return prijs;
    }

    public String getLabel() {
        return naam + "\n" + druivenras + regio + jaargang;

    }

    @Override
    public String toString() {
        return "Wijn{" +
                "naam='" + naam + '\'' +
                ", omschrijving='" + omschrijving + '\'' +
                ", druivenras='" + druivenras + '\'' +
                ", kleur='" + kleur + '\'' +
                ", land='" + land + '\'' +
                ", regio='" + regio + '\'' +
                ", serveerTip='" + serveerTip + '\'' +
                ", alcoholPercentage=" + alcoholPercentage +
                ", jaargang=" + jaargang +
                '}';
    }
}


