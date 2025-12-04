class Dogs {
    String Name;
    String Breed;
    String color;
    int age;
    public Dogs(String Name, String Breed, String color, int age){
        this.Name = Name;
        this.Breed = Breed;
        this.color = color;
        this.age = age;

    }
    public String getName(){
        return Name;
    }
    public String getColor(){
        return color;
    }
    public String getBreed(){
        return Breed;
    }
    public int getAge(){
        return age;
    }
    @Override

    public String toString(){
        return "Name is:" +Name+ "\nBreed age and color are:" +Breed+ " " +age+ " " +color;
    }
    public static void main(String[] args){
        Dogs tuffy = new Dogs("tuffy", "papillon", "black", 5 );
        System.out.println(tuffy);

    }
}
