public class slime extends musuh implements BisaLoot {
    public slime(){
    super("Slime Asam", 50);
    }
    @Override
    public void serangPemain(){
        System.out.println(this.namaMusuh +" melompat dan menyiram cairan asam! Playeer -15 HP");
    }
    @Override
    public void suaraKhas(){
        System.out.println(this.namaMusuh +" Bluupp..Bluupp..Bluupp....");
    }
    @Override
    public void jatuhkanItem(){
        System.out.println(this.namaMusuh +" Jatuhkan tembakan slime!");
    }
}


