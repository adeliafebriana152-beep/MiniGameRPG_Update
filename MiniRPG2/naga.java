public class naga extends musuh implements BisaTerbang, BisaLoot {
    public naga(){
    super("Naga Putih", 100);
    }
    @Override
    public void serangPemain(){
        System.out.println(this.namaMusuh + " Menyembur ice ke udara! Player -50 HP");
    }
    @Override
    public void suaraKhas(){
        System.out.println(this.namaMusuh +" RROOOAAAARRWW!!!!!");
    }
    @Override
    public void lepasLandas(){
        System.out.println(this.namaMusuh +" Terbang tinggi!, sulit untuk diserang!");
    }
    @Override
    public void seranganUdara(){
        System.out.println(this.namaMusuh +" Menyemburkan badai api! Pemain -80 HP.");
    }
    @Override
    public void jatuhkanItem(){
        System.out.println(this.namaMusuh +" Jatuhkan bola api!");
    }
}
