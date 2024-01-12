import java.util.ArrayList;

public class Sucursal {
	private String id;
	private String nombre;
	private String direccion;
	private ArrayList<Editorial> listaEditoriales = new ArrayList<>();


	public Sucursal(String nombre, String id, String direccion) {
		this.nombre = nombre;
		this.id = id;
		this.direccion = direccion;
	}
	//nombre
	public String getnombre() {
		return nombre;
	}
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	//id
	public String id() {
		return id;
	}
	public void setId(String di) {
		this.id = di;
	}
	//dirreccion
	public String isDireccion() {
		return this.direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void agregarEditorial(ArrayList<Editorial> listaEditoriales, String nombreEditorial) {
        Editorial nuevaEditorial = new Editorial(nombreEditorial);
        listaEditoriales.add(nuevaEditorial);
    }
	
	
    public boolean existeEditorial(String nombre) {
        for (Editorial editorial : listaEditoriales) {
            if (editorial.getName().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

	public Editorial buscarEditorial(String nombre) {
        for (Editorial editorial : listaEditoriales) {
            if (editorial.getName().equals(nombre)) {
                return editorial;
            }
        }
        return null;
	}
	
}
