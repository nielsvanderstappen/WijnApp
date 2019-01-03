import java.time.LocalDate;

public class Wijn {
    private String Naam, Omschrijving, Druivenras, Kleur, Land, Regio, Serveertip;
    private double Jaargang, Alcoholpercentage, AdviesPrijs;

    public Wijn(String naam, String kleur, String land, double jaargang, double alcoholpercentage) {
        Naam = naam;
        Kleur = kleur;
        Land = land;
        Jaargang = 2018;
        Alcoholpercentage = 12.5;
    }

    public String getNaam() {
        return Naam;
    }

    public void setNaam(String naam) {
        Naam = naam;
    }

    public String getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        Omschrijving = omschrijving;
    }

    public String getDruivenras() {
        return Druivenras;
    }

    public void setDruivenras(String druivenras) {
        Druivenras = druivenras;
    }

    public String getKleur() {
        return Kleur;
    }

    public void setKleur(String kleur) {
        while (kleur != "Wit" || kleur != "Rood" || kleur != "Rosé") {
            Kleur = "Rood";
        }
        Kleur = kleur;
    }

    public String getLand() {
        return Land;
    }

    public void setLand(String land) {
        while (land != "Frankrijk" || land != "Chili" || land != "Italië" || land != "Spanje") {
            System.out.println("Onbekend, Geef een geldig land op");
            System.out.println("Dit kan Frankrijk, Chili, Italië of Spanje zijn. ");
        }
        Land = land;
    }

    public String getRegio() {
        return Regio;
    }

    public void setRegio(String regio) {
        Regio = regio;
    }

    public String getServeertip() {
        return Serveertip;
    }

    public void setServeertip(String serveertip) {
        Serveertip = serveertip;
    }

    public double getJaargang() {
        return Jaargang;
    }

    public void setJaargang(double jaargang) {
        if (jaargang < 1950) {
            Jaargang = 1950;
        } else if (jaargang > 2019) {
            Jaargang = LocalDate.now().getYear();
        } else {
            Jaargang = jaargang;
        }
    }

    public double getAlcoholpercentage() {
        return Alcoholpercentage;
    }

    public void setAlcoholpercentage(double alcoholpercentage) {
        if (alcoholpercentage < 0) {
            Alcoholpercentage = 0;
        } else if (alcoholpercentage > 17) {
            Alcoholpercentage = 17;
        } else {
            Alcoholpercentage = alcoholpercentage;
        }
    }

    public void getAdviesPrijs(String getLand, double AdviesPrijs, double OuderdomPrijs) {
        if (getLand == "Frankrijk") {
            AdviesPrijs = 7.5;

        } else if (getLand == "Chili") {
            AdviesPrijs = 8.25;


        } else if (getLand == "Italië") {
            AdviesPrijs = 9.30;

        } else if (getLand == "Spanje") {
            AdviesPrijs = 6.45;

        } else {
            AdviesPrijs = 9.3;
        }

        if (Jaargang % 10 != 7) {
            OuderdomPrijs += getJaargang() * 0.1 + AdviesPrijs;
        }
    }
    public void getLabel() {
        System.out.println("label: " + getNaam() + getDruivenras() + getRegio() + getJaargang() );

    }

    @Override
    public String toString() {
        return "Wijn{" +
                "Naam='" + Naam + '\'' +
                ", Omschrijving='" + Omschrijving + '\'' +
                ", Druivenras='" + Druivenras + '\'' +
                ", Kleur='" + Kleur + '\'' +
                ", Land='" + Land + '\'' +
                ", Regio='" + Regio + '\'' +
                ", Serveertip='" + Serveertip + '\'' +
                ", Jaargang=" + Jaargang +
                ", Alcoholpercentage=" + Alcoholpercentage +
                ", AdviesPrijs=" + AdviesPrijs +
                '}';
    }
}
