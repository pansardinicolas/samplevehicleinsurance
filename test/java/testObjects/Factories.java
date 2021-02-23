package testObjects;

import java.time.LocalDate;

/**
 * @author Nicolas Pansardi
 */

public class Factories {
    public static class Vehicle{
        private String make = "Audi";
        private String model = "Scooter";
        private Integer ccm = 10;
        private Double enginePerformance = 17.5;
        private LocalDate dateofmanufacture = LocalDate.now();
        private Integer numberofseats = 2;
        private Boolean rightHandDrive = Boolean.TRUE;
        private Integer numberofseatsMoto = 2;
        private String fuel = "Petrol";
        private Integer payload = 100;
        private Integer totalWeight = 200;
        private Integer listprice = 2000;
        private String licenseplatenumber = "abc123";
        private Integer annualmileage = 15000;

        public Vehicle(String make, String model, Integer ccm, Double enginePerformance, LocalDate dateofmanufacture,
                       Integer numberofseats, Boolean rightHandDrive, Integer numberofseatsMoto, String fuel,
                       Integer payload, Integer totalWeight, Integer listprice, String licenseplatenumber,
                       Integer annualmileage) {
            this.make = make;
            this.model = model;
            this.ccm = ccm;
            this.enginePerformance = enginePerformance;
            this.dateofmanufacture = dateofmanufacture;
            this.numberofseats = numberofseats;
            this.numberofseatsMoto = numberofseatsMoto;
            this.rightHandDrive = rightHandDrive;
            this.fuel = fuel;
            this.payload = payload;
            this.totalWeight = totalWeight;
            this.listprice = listprice;
            this.licenseplatenumber = licenseplatenumber;
            this.annualmileage = annualmileage;
        }

        public Vehicle() {
        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public Double getEnginePerformance() {
            return enginePerformance;
        }

        public void setEnginePerformance(Double enginePerformance) {
            this.enginePerformance = enginePerformance;
        }

        public LocalDate getDateofmanufacture() {
            return dateofmanufacture;
        }

        public void setDateofmanufacture(LocalDate dateofmanufacture) {
            this.dateofmanufacture = dateofmanufacture;
        }

        public Integer getNumberofseats() {
            return numberofseats;
        }

        public void setNumberofseats(Integer numberofseats) {
            this.numberofseats = numberofseats;
        }

        public String getFuel() {
            return fuel;
        }

        public void setFuel(String fuel) {
            this.fuel = fuel;
        }

        public Integer getListprice() {
            return listprice;
        }

        public void setListprice(Integer listprice) {
            this.listprice = listprice;
        }

        public String getLicenseplatenumber() {
            return licenseplatenumber;
        }

        public void setLicenseplatenumber(String licenseplatenumber) {
            this.licenseplatenumber = licenseplatenumber;
        }

        public Integer getAnnualmileage() {
            return annualmileage;
        }

        public void setAnnualmileage(Integer annualmileage) {
            this.annualmileage = annualmileage;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public Integer getCcm() {
            return ccm;
        }

        public void setCcm(Integer ccm) {
            this.ccm = ccm;
        }

        public Integer getPayload() {
            return payload;
        }

        public void setPayload(Integer payload) {
            this.payload = payload;
        }

        public Integer getTotalWeight() {
            return totalWeight;
        }

        public void setTotalWeight(Integer totalWeight) {
            this.totalWeight = totalWeight;
        }

        public Boolean getRightHandDrive() {
            return rightHandDrive;
        }

        public void setRightHandDrive(Boolean rightHandDrive) {
            this.rightHandDrive = rightHandDrive;
        }

        public Integer getNumberofseatsMoto() {
            return numberofseatsMoto;
        }

        public void setNumberofseatsMoto(Integer numberofseatsMoto) {
            this.numberofseatsMoto = numberofseatsMoto;
        }
    }
    public static class Insurant{
        private String firstname = "Teste";
        private String lastname = "TesteSobrenome";
        private LocalDate dateofbirth = LocalDate.of(1990, 1, 10);
        private Boolean isGenderMale = Boolean.TRUE;
        private String streetaddress = "St. Abc Teste";
        private String country = "Pais Teste";
        private String zipcode = "123456";
        private String city = "Cidade Teste";
        private String occupation = "Profissao teste";
        private Boolean hobbiesSpeeding = Boolean.TRUE;
        private Boolean hobbiesBungeejumping = Boolean.FALSE;
        private Boolean hobbiesCliffdiving = Boolean.TRUE;
        private Boolean hobbiesSkydiving = Boolean.FALSE;
        private String website = "www.abc.com.br";
        private String picturePath = "abcabc";

        public Insurant() {
        }

        public Insurant(String firstname, String lastname, LocalDate dateofbirth, Boolean isGenderMale,
                        String streetaddress, String country, String zipcode, String city, String occupation,
                        Boolean hobbiesSpeeding, Boolean hobbiesBungeejumping, Boolean hobbiesCliffdiving,
                        Boolean hobbiesSkydiving, String website, String picturePath) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.dateofbirth = dateofbirth;
            this.isGenderMale = isGenderMale;
            this.streetaddress = streetaddress;
            this.country = country;
            this.zipcode = zipcode;
            this.city = city;
            this.occupation = occupation;
            this.hobbiesSpeeding = hobbiesSpeeding;
            this.hobbiesBungeejumping = hobbiesBungeejumping;
            this.hobbiesCliffdiving = hobbiesCliffdiving;
            this.hobbiesSkydiving = hobbiesSkydiving;
            this.website = website;
            this.picturePath = picturePath;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public LocalDate getDateofbirth() {
            return dateofbirth;
        }

        public void setDateofbirth(LocalDate dateofbirth) {
            this.dateofbirth = dateofbirth;
        }

        public Boolean getGenderMale() {
            return isGenderMale;
        }

        public void setGenderMale(Boolean genderMale) {
            isGenderMale = genderMale;
        }

        public String getStreetaddress() {
            return streetaddress;
        }

        public void setStreetaddress(String streetaddress) {
            this.streetaddress = streetaddress;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getZipcode() {
            return zipcode;
        }

        public void setZipcode(String zipcode) {
            this.zipcode = zipcode;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getOccupation() {
            return occupation;
        }

        public void setOccupation(String occupation) {
            this.occupation = occupation;
        }

        public Boolean getHobbiesSpeeding() {
            return hobbiesSpeeding;
        }

        public void setHobbiesSpeeding(Boolean hobbiesSpeeding) {
            this.hobbiesSpeeding = hobbiesSpeeding;
        }

        public Boolean getHobbiesBungeejumping() {
            return hobbiesBungeejumping;
        }

        public void setHobbiesBungeejumping(Boolean hobbiesBungeejumping) {
            this.hobbiesBungeejumping = hobbiesBungeejumping;
        }

        public Boolean getHobbiesCliffdiving() {
            return hobbiesCliffdiving;
        }

        public void setHobbiesCliffdiving(Boolean hobbiesCliffdiving) {
            this.hobbiesCliffdiving = hobbiesCliffdiving;
        }

        public Boolean getHobbiesSkydiving() {
            return hobbiesSkydiving;
        }

        public void setHobbiesSkydiving(Boolean hobbiesSkydiving) {
            this.hobbiesSkydiving = hobbiesSkydiving;
        }

        public String getWebsite() {
            return website;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        public String getPicturePath() {
            return picturePath;
        }

        public void setPicturePath(String picturePath) {
            this.picturePath = picturePath;
        }
    }
    public static class Product{

        private LocalDate startdate = LocalDate.of(2021, 5, 22);
        private String insurancesum = "3.000.000,00";
        private String meritrating = "Malus 11";
        private String damageinsurance = "No coverage";
        private Boolean optionalEuroprotection = Boolean.TRUE;
        private Boolean optionalLegaldefense = Boolean.TRUE;
        private String selectorCourtesycar = "Yes";

        public Product() {
        }

        public Product(LocalDate startdate, String insurancesum, String meritrating, String damageinsurance,
                       Boolean optionalEuroprotection, Boolean optionalLegaldefense, String selectorCourtesycar) {
            this.startdate = startdate;
            this.insurancesum = insurancesum;
            this.meritrating = meritrating;
            this.damageinsurance = damageinsurance;
            this.optionalEuroprotection = optionalEuroprotection;
            this.optionalLegaldefense = optionalLegaldefense;
            this.selectorCourtesycar = selectorCourtesycar;
        }

        public LocalDate getStartdate() {
            return startdate;
        }

        public void setStartdate(LocalDate startdate) {
            this.startdate = startdate;
        }

        public String getInsurancesum() {
            return insurancesum;
        }

        public void setInsurancesum(String insurancesum) {
            this.insurancesum = insurancesum;
        }

        public String getMeritrating() {
            return meritrating;
        }

        public void setMeritrating(String meritrating) {
            this.meritrating = meritrating;
        }

        public String getDamageinsurance() {
            return damageinsurance;
        }

        public void setDamageinsurance(String damageinsurance) {
            this.damageinsurance = damageinsurance;
        }

        public Boolean getOptionalEuroprotection() {
            return optionalEuroprotection;
        }

        public void setOptionalEuroprotection(Boolean optionalEuroprotection) {
            this.optionalEuroprotection = optionalEuroprotection;
        }

        public Boolean getOptionalLegaldefense() {
            return optionalLegaldefense;
        }

        public void setOptionalLegaldefense(Boolean optionalLegaldefense) {
            this.optionalLegaldefense = optionalLegaldefense;
        }

        public String getSelectorCourtesycar() {
            return selectorCourtesycar;
        }

        public void setSelectorCourtesycar(String selectorCourtesycar) {
            this.selectorCourtesycar = selectorCourtesycar;
        }
    }

    public static class QuoteDestine {
        private String email = "test@abc.com";
        private String phone = "419999999";
        private String username = "test";
        private String password = "Testabc123";
        private String comments = "abcabcteste 123";

        public QuoteDestine() {
        }

        public QuoteDestine(String email, String phone, String username, String password, String comments) {
            this.email = email;
            this.phone = phone;
            this.username = username;
            this.password = password;
            this.comments = comments;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getComments() {
            return comments;
        }

        public void setComments(String comments) {
            this.comments = comments;
        }
    }
}
