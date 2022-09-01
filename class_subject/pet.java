public class pets {
    
    // Pet Attributes
    String name;
    float trustlevel;
    float level;
    boolean isHappy;

    // Pet Methods
    public void sayMyPets() {
        System.out.println(" " + name + " " + trustlevel +  " " +  level +  " " + isHappy );
    }

    // Constructor
    public pets(String petName, float petTrustLevel, float petLevel, boolean petIsHappy) {
        name = petName;
        trustlevel = petTrustLevel;
        level = petLevel;
        isHappy = petIsHappy;
    }
 }

