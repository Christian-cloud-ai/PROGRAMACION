package ejercicio1;
public class main {
    
    public static void main(String[] args) {
        
        Vehiculo v1 = new Vehiculo();
        v1.setMarca("Seat");
        v1.setModelo("Ibiza");
        v1.setMatricula("4628GOK");
        
        Vehiculo v2 = new Vehiculo("1234DMK", "Ford", "Fiesta", true);
        Vehiculo v3 = new Vehiculo("9871OKG", "Lamborghini", "Huracan", true);
        
        Empresa e = new Empresa();
        
        e.incorporarVehiculo(e.getVehiculosRegistrados(), v1);
        e.incorporarVehiculo(e.getVehiculosRegistrados(), v2);
        
        /*
        e.incorporarVehiculo(e.getVehiculosRegistrados(), v1);
        e.incorporarVehiculo(e.getVehiculosRegistrados(), v3);
        */
        
        e.alquilarVehiculo(e.getVehiculosRegistrados(), v2);
        
        for (Vehiculo v : e.getVehiculosRegistrados()) {
            System.out.println(v);
        }
        
        System.out.println(e.toString());
    }
    
}
