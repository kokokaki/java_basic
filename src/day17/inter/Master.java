package day17.inter;

//애완동물 주인
public class Master {

    //애완동물들
    Pet[] myPets;

    //애완동물과 놀아주는 기능
    public void playWithPets() {
        for (Pet myPet : myPets) {
            myPet.play();
        }
    }
}
