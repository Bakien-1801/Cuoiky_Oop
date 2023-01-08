package countrylistmanager;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class CountryListManager {
    // Singleton pattern
    private static CountryListManager instance;

    private final List<AbstractCountry> countryList;

    private CountryListManager() {
        countryList = new LinkedList<>();
    }

    public static CountryListManager getInstance() {
        /* TODO */
        if (instance == null) {
            instance = new CountryListManager();
        }
        return instance;
    }

    public List<AbstractCountry> getCountryList() {
        return this.countryList;
    }

    public void append(AbstractCountry country) {
        /* TODO */
        if (country != null) {
            countryList.add(country);
        }
    }

    public void add(AbstractCountry country, int index) {
        /* TODO */
        if (index > -1 && index <= countryList.size() && country != null) {
            countryList.add(index, country);
        }
    }

    public void remove(int index) {
        /* TODO */
        if (index < countryList.size() && index > -1) {
            countryList.remove(index);
        }
    }

    public void remove(AbstractCountry country) {
        /* TODO */
        if (country != null) {
            countryList.remove(country);
        }
    }

    public AbstractCountry countryAt(int index) {
        /* TODO */
        if (index > -1 && index < countryList.size()) {
            return countryList.get(index);
        }
        return null;
    }

    public List<AbstractCountry> sortPopulationIncreasing() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return left.getPopulation() - right.getPopulation();
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortPopulationDecreasing() {
        /* TODO */
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return right.getPopulation() - left.getPopulation();
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortAreaIncreasing() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                if (left.getArea() > right.getArea()) {
                    return 1;
                } else if (left.getArea() < right.getArea()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortAreaDecreasing() {
        /* TODO */
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return Double.compare(right.getArea(), left.getArea());
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortGdpIncreasing() {
        /* TODO */
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return Double.compare(left.getGdp(), right.getGdp());
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortGdpDecreasing() {
        /* TODO */
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return Double.compare(right.getGdp(), left.getGdp());
            }
        });
        return newList;
    }

    public List<AbstractCountry> filterContinent(String continent) {
        /* TODO */
//        List<AbstractCountry> newList = null;
//        switch (continent) {
//            case "Asia":
//                newList = countryList.stream().filter(it -> it instanceof AsiaCountry).toList();
//                break;
//            case "North America":
//                newList = countryList.stream().filter(it -> it instanceof NorthAmericaCountry).toList();
//                break;
//            case "South America":
//                newList = countryList.stream().filter(it -> it instanceof SouthAmericaCountry).toList();
//                break;
//            case "Africa":
//                newList = countryList.stream().filter(it -> it instanceof AfricaCountry).toList();
//                break;
//            case "Europe":
//                newList = countryList.stream().filter(it -> it instanceof EuropeCountry).toList();
//                break;
//            case "Oceania":
//                newList = countryList.stream().filter(it -> it instanceof EuropeCountry).toList();
//                break;
//        }
//        return newList;
//        List<AbstractCountry> newList = null;
//        switch (continent) {
//            case "Asia":
//                newList = countryList.stream().filter(it -> it instanceof AsiaCountry).collect(Collectors.toList());
//                break;
//            case "North America":
//                newList = countryList.stream().filter(it -> it instanceof NorthAmericaCountry).collect(Collectors.toList());
//                break;
//            case "South America":
//                newList = countryList.stream().filter(it -> it instanceof SouthAmericaCountry).collect(Collectors.toList());
//                break;
//            case "Africa":
//                newList = countryList.stream().filter(it -> it instanceof AfricaCountry).collect(Collectors.toList());
//                break;
//            case "Europe":
//                newList = countryList.stream().filter(it -> it instanceof EuropeCountry).collect(Collectors.toList());
//                break;
//            case "Oceania":
//                newList = countryList.stream().filter(it -> it instanceof OceaniaCountry).collect(Collectors.toList());
//                break;
//
//        }
//        return newList;
        String[] countinents = {"Asia", "North America", "South America", "Africa", "Europe", "Oceania"};

        List<AbstractCountry> newList = null;
        switch (continent) {
            case "Asia":
                newList = new ArrayList<>();
                for (AbstractCountry country : countryList) {
                    if (country instanceof AsiaCountry) {
                        newList.add(country);
                    }
                }
                break;
            case "North America":
                newList = new ArrayList<>();
                for (AbstractCountry country : countryList) {
                    if (country instanceof NorthAmericaCountry) {
                        newList.add(country);
                    }
                }
                break;
            case "South America":
                newList = new ArrayList<>();
                for (AbstractCountry country : countryList) {
                    if (country instanceof SouthAmericaCountry) {
                        newList.add(country);
                    }
                }
                break;
            case "Africa":
                newList = new ArrayList<>();
                for (AbstractCountry country : countryList) {
                    if (country instanceof AfricaCountry) {
                        newList.add(country);
                    }
                }
                break;
            case "Europe":
                newList = new ArrayList<>();
                for (AbstractCountry country : countryList) {
                    if (country instanceof EuropeCountry) {
                        newList.add(country);
                    }
                }
                break;
            case "Oceania":
                newList = new ArrayList<>();
                for (AbstractCountry country : countryList) {
                    if (country instanceof OceaniaCountry) {
                        newList.add(country);
                    }
                }
        }
        return newList;
        
    }

    public List<AbstractCountry> filterCountriesMostPopulous(int howMany) {
        /* TODO */
        return sortPopulationDecreasing().subList(0, howMany);
    }

    public List<AbstractCountry> filterCountriesLeastPopulous(int howMany) {
        /* TODO */
        return sortPopulationIncreasing().subList(0, howMany);
    }

    public List<AbstractCountry> filterCountriesLargestArea(int howMany) {
        /* TODO */
        return sortAreaDecreasing().subList(0, howMany);
    }

    public List<AbstractCountry> filterCountriesSmallestArea(int howMany) {
        /* TODO */
        return sortAreaIncreasing().subList(0, howMany);

    }

    public List<AbstractCountry> filterCountriesHighestGdp(int howMany) {
        /* TODO */
        return sortGdpDecreasing().subList(0, howMany);
    }

    public List<AbstractCountry> filterCountriesLowestGdp(int howMany) {
        /* TODO */
        return sortGdpIncreasing().subList(0, howMany);
    }

    public static String codeOfCountriesToString(List<AbstractCountry> countryList) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (AbstractCountry country : countryList) {
            codeOfCountries.append(country.getCode()).append(" ");
        }
        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(List<AbstractCountry> countryList) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (AbstractCountry country : countryList) {
            countriesString.append(country.toString()).append("\n");
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
