public class Hava {
    public int temperatur;
    public String havaDurumu;
    public Hava(String havaDurumu,int temperatur){
        this.havaDurumu=havaDurumu;
        this.temperatur=temperatur;
    }
    public int GetTemp(){
        return this.temperatur;
    }
    public void SetTemp(int temperatur){
        this.temperatur=temperatur;
    }
    public String GetHavaDurum(){
        return this.havaDurumu;
    }
    public void SetHavaDurum(String havaDurumu){
        this.havaDurumu=havaDurumu;
    }
    public void TempAsagi(int temperatur){
        if(this.havaDurumu=="Buludlu"){
            this.temperatur-=temperatur;
        }
    }
    public void TempYuxari(int temperatur){
        if(this.havaDurumu=="Gunesli"){
            this.temperatur+=temperatur;
        }
    }
    public static void main(String[] args){
        Hava hava=new Hava("Buludlu",45);
        hava.SetHavaDurum("Gunesli");
        hava.SetTemp(68);
        System.out.println(hava.GetHavaDurum());
        System.out.println(hava.GetTemp());
        hava.TempAsagi(54);
        hava.TempYuxari(78);
    }
}
