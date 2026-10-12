public class PetMain {
    public static void main(String[] args) {
        Pet Jackson = new Pet("짹슨", 10);
        Pet Michael = new Pet("마이클", 5);

        Jackson.playWith(Michael);
        Pet.PrintPetInfo(Jackson);
        Pet.PrintPetInfo(Michael);
        
        Michael.playWith(Jackson);
        Pet.PrintPetInfo(Jackson);
        Pet.PrintPetInfo(Michael);



    }
    
}
