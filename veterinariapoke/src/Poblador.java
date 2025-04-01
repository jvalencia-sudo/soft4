import java.util.ArrayList;
import java.util.List;

public class Poblador {
    public static List<Cliente> getClientes(){

        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente(1, "Ash Ketchum", "Pallet Town", "ash@pokemon.com", "123456789"));
        Cliente misty = new Cliente(2, "Misty", "Cerulean City", "misty@pokemon.com", "987654321");
        Cliente brock = new Cliente(3, "Brock", "Pewter City", "brock@pokemon.com", "456789123");
        Cliente jessie = new Cliente(4, "Jessie", "Team Rocket HQ", "jessie@pokemon.com", "789123456");
        Cliente james = new Cliente(5, "James", "Team Rocket HQ", "james@pokemon.com", "321654987");
        Cliente gary = new Cliente(6, "Gary Oak", "Pallet Town", "gary@pokemon.com", "112233445");
        Cliente tracey = new Cliente(7, "Tracey Sketchit", "Orange Islands", "tracey@pokemon.com", "556677889");
        Cliente nurseJoy = new Cliente(8, "Nurse Joy", "Pokémon Center", "joy@pokemon.com", "999888777");
        Cliente officerJenny = new Cliente(9, "Officer Jenny", "Viridian City", "jenny@pokemon.com", "101010101");
        Cliente professorOak = new Cliente(10, "Professor Oak", "Pallet Town", "oak@pokemon.com", "202020202");



        return clientes;
    }
}
