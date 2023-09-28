package paquete01;

public class AdministrarEmpleados {

    private Empleado[] objEmpleados = new Empleado[100];
    private int posicion = 0;

    public void agregar(Empleado emp) {
        objEmpleados[posicion] = emp;
        posicion++;
    }

    public int buscar(int codigo) {
        int p = -1;
        for (int i = 0; i < posicion; i++) {
            if (objEmpleados[i].getCodigo() == codigo) {
                return i;
            }
        }
        return p;
    }

    public void eliminar(int codigo) {
        int p = buscar(codigo);
        if (p < 0) {
            System.out.println("No hay elemento a eliminar");
        } else {
            objEmpleados[p] = null;
        }
    }

    public void modificar(Empleado emp) {
        int p = buscar(emp.getCodigo());
        if (p < 0) {
            System.out.println("No hay elemento a modificar");
        } else {
            objEmpleados[p].setNombre(emp.getNombre()) ;
            objEmpleados[p].setSueldo(emp.getSueldo()) ;
        }
    }

    public void ordernarPorCodigo() {

    }

    public void imprimirDatos() {
        System.out.println("");
        for (int i = 0; i < posicion; i++) {
            System.out.println(objEmpleados[i]);
        }
    }
}
