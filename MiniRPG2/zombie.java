public class zombie extends musuh implements BisaLoot {
    public zombie(){
    super("Zombie Halel", 150);
    }
    @Override
    public void serangPemain(){
        System.out.println(this.namaMusuh +" menggigit dan terkena virus! Playeer -20 HP");
    }
    @Override
    public void suaraKhas(){
        System.out.println(this.namaMusuh +" Grapppphh....Graoappp..Groaap");
    }
    @Override
    public void jatuhkanItem(){
        System.out.println(this.namaMusuh +" Jatuhkan darah zombie!");
    }
}
