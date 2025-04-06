/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaabstractfactory;

import java.util.ArrayList;
import practicaabstractfactory.componentes.Diesel;
import practicaabstractfactory.componentes.Electrico;
import practicaabstractfactory.componentes.Gasolina;
import practicaabstractfactory.componentes.Hibrido;
import practicaabstractfactory.factory.FabricaVehiculo;
import practicaabstractfactory.factory.FabricaVehiculoFord;
import practicaabstractfactory.factory.FabricaVehiculoSeat;
import practicaabstractfactory.factory.FabricaVehiculoToyota;
import practicaabstractfactory.vistas.VistaCatalogo;

/**
 *
 * @author Antonio
 */
public class PracticaAbstractFactory {


    public static void main(String[] args) {
        
        FabricaVehiculo fabricaFord = new FabricaVehiculoFord();
        FabricaVehiculo fabricaToyota = new FabricaVehiculoToyota();
        FabricaVehiculo fabricaSeat = new FabricaVehiculoSeat();
        
        ArrayList<Diesel> diesel = new ArrayList();
        ArrayList<Gasolina> gasolina = new ArrayList();
        ArrayList<Hibrido> hibrido = new ArrayList();
        ArrayList<Electrico> electrico = new ArrayList();

        // Creación de los diesel
        diesel.add(fabricaFord.creaDiesel("Ford", "Focus TDCi", 120, 4, 5, 20000f));
        diesel.add(fabricaToyota.creaDiesel("Toyota", "Avensis D4D", 150, 5, 7, 23000f));
        diesel.add(fabricaSeat.creaDiesel("Seat", "León TDI", 110, 4, 5, 19000f));
        diesel.add(fabricaSeat.creaDiesel("Seat", "Ibiza TDI", 90, 3, 4, 17000f));

        // Creación de los gasolina
        gasolina.add(fabricaFord.creaGasolina("Ford", "Fiesta EcoBoost", 100, 5, 5, 18000f));
        gasolina.add(fabricaToyota.creaGasolina("Toyota", "Corolla 1.6", 132, 6, 5, 20000f));
        gasolina.add(fabricaSeat.creaGasolina("Seat", "Ibiza 1.0 TSI", 95, 4, 4, 16000f));
        gasolina.add(fabricaFord.creaGasolina("Ford", "Puma 1.0", 125, 5, 4, 19500f));

        // Creación de los híbridos
        hibrido.add(fabricaToyota.creaHibrido("Toyota", "Prius", 122, 4, 50, 7, 25000f));
        hibrido.add(fabricaToyota.creaHibrido("Toyota", "Yaris Hybrid", 100, 3, 45, 4, 21000f));
        hibrido.add(fabricaSeat.creaHibrido("Seat", "León eHybrid", 204, 6, 60, 5, 28000f));
        hibrido.add(fabricaSeat.creaHibrido("Seat", "Ibiza Hybrid", 110, 4, 40, 4, 22000f));

        // Creación de los eléctricos
        electrico.add(fabricaFord.creaElectrico("Ford", "Mustang Mach-E", 269, 450, 40, 2, 48000f));
        electrico.add(fabricaToyota.creaElectrico("Toyota", "bZ4X", 204, 410, 30, 7, 42000f));
        electrico.add(fabricaToyota.creaElectrico("Toyota", "C-HR EV", 180, 390, 35, 5, 40000f));
        electrico.add(fabricaToyota.creaElectrico("Toyota", "Proace City EV", 136, 280, 25, 7, 36000f));
        
        VistaCatalogo vistaCatalogo = new VistaCatalogo(diesel, gasolina, hibrido, electrico);
        vistaCatalogo.setVisible(true);
    }

}
