public class Bus {
	private String estado;
	private int id;
	private int anioDeFabricacion;
	private Empresa empresa;

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAnioDeFabricacion() {
		return this.anioDeFabricacion;
	}

	public void setAnioDeFabricacion(int anioDeFabricacion) {
		this.anioDeFabricacion = anioDeFabricacion;
	}
}