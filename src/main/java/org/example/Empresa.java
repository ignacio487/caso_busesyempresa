import java.util.ArrayList;

public class Empresa {
	private ArrayList<Bus> buses; // Corregido: El tipo de dato debe ser "Bus" en lugar de "bus"

	public Empresa() {
		buses = new ArrayList<>(); // Inicializar la lista en el constructor
	}

	public void agregarBus(Bus bus) {
		buses.add(bus); // Agregar el autobús a la lista
	}

	public Bus buscarBusPorAnio(int anio) {
		for (Bus bus : buses) {
			if (bus.getAnio() == anio) {
				return bus; // Devolver el autobús si se encuentra
			}
		}
		return null; // Si no se encuentra, devolver
	}

	public void eliminarBus(int id) {
		Bus busAEliminar = null;
		for (Bus bus : buses) {
			if (bus.getId() == id) {
				busAEliminar = bus;
				break; // Salir del bucle al encontrar el autobús
			}
		}
		if (busAEliminar != null) {
			buses.remove(busAEliminar); // Eliminar el autobús de la lista
		}
	}
}

