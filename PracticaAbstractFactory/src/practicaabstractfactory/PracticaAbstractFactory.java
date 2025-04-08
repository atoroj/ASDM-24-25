/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaabstractfactory;

import java.util.ArrayList;
import practicaabstractfactory.componentes.Ford;
import practicaabstractfactory.componentes.Seat;
import practicaabstractfactory.componentes.Toyota;
import practicaabstractfactory.factory.Fabrica;
import practicaabstractfactory.factory.FabricaVehiculoDiesel;
import practicaabstractfactory.factory.FabricaVehiculoElectrico;
import practicaabstractfactory.factory.FabricaVehiculoGasolina;
import practicaabstractfactory.factory.FabricaVehiculoHibrido;
import practicaabstractfactory.vistas.VistaCatalogo;

/**
 *
 * @author Antonio
 */
public class PracticaAbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fabrica fabricaElectrico = new FabricaVehiculoElectrico();
        Fabrica fabricaHibrido = new FabricaVehiculoHibrido();
        Fabrica fabricaGasolina = new FabricaVehiculoGasolina();
        Fabrica fabricaDiesel = new FabricaVehiculoDiesel();

        ArrayList<Toyota> toyota = new ArrayList();
        ArrayList<Seat> seat = new ArrayList();
        ArrayList<Ford> ford = new ArrayList();

        // --- Diesel ---
        ford.add(fabricaDiesel.creaFord("Focus TDCi", "Diesel", 120, 4, -1, -1, 5, 20000f, 1500f));
        toyota.add(fabricaDiesel.creaToyota("Avensis D4D", "Diesel", 150, 5, -1, -1, 7, 23000f, 1800f));
        seat.add(fabricaDiesel.creaSeat("León TDI", "Diesel", 110, 4, -1, -1, 5, 19000f, 1600f));
        seat.add(fabricaDiesel.creaSeat("Ibiza TDI", "Diesel", 90, 3, -1, -1, 4, 17000f, 1400f));

        // --- Gasolina ---
        // --- Gasolina ---
        ford.add(fabricaGasolina.creaFord("Fiesta EcoBoost", "Gasolina", 100, 5, -1, -1, 5, 18000f, 14500f));
        toyota.add(fabricaGasolina.creaToyota("Corolla 1.6", "Gasolina", 132, 6, -1, -1, 5, 20000f, 16000f));
        seat.add(fabricaGasolina.creaSeat("Ibiza 1.0 TSI", "Gasolina", 95, 4, -1, -1, 4, 16000f, 13500f));
        ford.add(fabricaGasolina.creaFord("Puma 1.0", "Gasolina", 125, 5, -1, -1, 4, 19500f, 15500f));

        // --- Híbrido ---
        // --- Híbrido ---
        toyota.add(fabricaHibrido.creaToyota("Prius", "Híbrido", 122, 4, 50, 200, 5, 25000f, 1800f));
        toyota.add(fabricaHibrido.creaToyota("Yaris Hybrid", "Híbrido", 100, 3, 300, 4, 5, 21000f, 1500f));
        seat.add(fabricaHibrido.creaSeat("León eHybrid", "Híbrido", 204, 6, 60, 250, 5, 28000f, 1600f));
        seat.add(fabricaHibrido.creaSeat("Ibiza Hybrid", "Híbrido", 110, 4, 40, 275, 5, 22000f, 1400f));

        // --- Eléctrico ---
        ford.add(fabricaElectrico.creaFord("Mustang Mach-E", "Eléctrico", 269, -1, 450, 40, 2, 48000f, -1f));
        toyota.add(fabricaElectrico.creaToyota("bZ4X", "Eléctrico", 204, -1, 410, 30, 7, 42000f, -1f));
        toyota.add(fabricaElectrico.creaToyota("C-HR EV", "Eléctrico", 180, -1, 390, 35, 5, 40000f, -1f));
        toyota.add(fabricaElectrico.creaToyota("Proace City EV", "Eléctrico", 136, -1, 280, 25, 7, 36000f, -1f));
        
        VistaCatalogo vistaCatalogo = new VistaCatalogo(seat, toyota, ford);
        vistaCatalogo.setVisible(true);
    }

}
