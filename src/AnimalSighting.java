class AnimalSighting {
    private int id;
    private String animalName;
    private String location;
    private String date;
    private String description;

    public AnimalSighting(int id, String animalName, String location, String date, String description) {
        this.id = id;
        this.animalName = animalName;
        this.location = location;
        this.date = date;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDetails() {
        return "ID: " + id + ", Animal: " + animalName + ", Location: " + location + ", Date: " + date + ", Description: " + description;
    }
}
