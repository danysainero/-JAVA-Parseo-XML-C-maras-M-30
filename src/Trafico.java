
public class Trafico {
	
	private int vehiculos_tunel, vehiculos_calle30;
	float v_superficie, v_tunel;
	public Trafico(int vehiculos_tunel, int vehiculos_calle30, float v_superficie, float v_tunel) {
		super();
		this.vehiculos_tunel = vehiculos_tunel;
		this.vehiculos_calle30 = vehiculos_calle30;
		this.v_superficie = v_superficie;
		this.v_tunel = v_tunel;
	}
	public int getVehiculos_tunel() {
		return vehiculos_tunel;
	}
	public void setVehiculos_tunel(int vehiculos_tunel) {
		this.vehiculos_tunel = vehiculos_tunel;
	}
	public int getVehiculos_calle30() {
		return vehiculos_calle30;
	}
	public void setVehiculos_calle30(int vehiculos_calle30) {
		this.vehiculos_calle30 = vehiculos_calle30;
	}
	public float getV_superficie() {
		return v_superficie;
	}
	public void setV_superficie(float v_superficie) {
		this.v_superficie = v_superficie;
	}
	public float getV_tunel() {
		return v_tunel;
	}
	public void setV_tunel(float v_tunel) {
		this.v_tunel = v_tunel;
	}



}
