package tokio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Portugal Cities!");
        System.out.println();

        // cidades
        Cities lisboa = new Cities("Lisboa", "Lisboa", 505526);
        Cities porto = new Cities("Porto", "Porto", 237559);
        Cities gaia = new Cities("Vila Nova de Gaia", "Porto", 302295);
        Cities matosinhos = new Cities("Matosinhos", "Porto", 175478);
        Cities gondomar = new Cities("Gondomar", "Porto", 168027);
        Cities braga = new Cities("Braga", "Braga", 181494);
        Cities coimbra = new Cities("Coimbra", "Coimbra", 143396);
        Cities aveiro = new Cities("Aveiro", "Aveiro", 78564);
        List<Cities> citiesList = new ArrayList<>();
        citiesList.add(lisboa);
        citiesList.add(porto);
        citiesList.add(gaia);
        citiesList.add(matosinhos);
        citiesList.add(gondomar);
        citiesList.add(braga);
        citiesList.add(coimbra);
        citiesList.add(aveiro);
        System.out.println(citiesList.stream().collect(Collectors.toList()));
        System.out.println();

        // Quantas cidades há no total?
        System.out.println("Quantas cidades há no total?");
        long citiesCount = citiesList.stream()
                .count();
        System.out.println("No total há: " + citiesCount + " cidades.");
        System.out.println("----------");

        // Quantas cidades de Portugal têm mais de 1.000 habitantes?
        System.out.println("Quantas cidades de Portugal têm mais de 1.000 habitantes?");
        long citiesCount1K = citiesList.stream()
                .filter(city -> city.getHabitantes() > 1000)
                .count();
        System.out.println("O número de cidades com mais de 1000 habitantes é: " + citiesCount1K);
        System.out.println("----------");

        // De que distritos são as cidades?
        System.out.println("De que distritos são as cidades");
        List<String> distrito = citiesList.stream()
                .map(Cities::getDistrito)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distrito);
        System.out.println("----------");

        // De quantos distritos diferentes são as cidades?
        System.out.println("De quantos distritos diferentes são as cidades?");
        long distritoCount = distrito.stream()
                .count();
        System.out.println("São de " + distritoCount + " distritos");
        System.out.println("----------");

        // Alguma cidade de Portugal tem mais de 50.000 habitantes?
        System.out.println("Alguma cidade de Portugal tem mais de 50.000 habitantes?");
        boolean isCity50K = citiesList.stream()
                .anyMatch(city -> city.getHabitantes() > 50000);
        String answer = isCity50K ? "Sim" : "Não";
        System.out.println(answer);

    }
}