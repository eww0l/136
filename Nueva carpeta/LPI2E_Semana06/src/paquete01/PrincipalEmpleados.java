package paquete01;

public class PrincipalEmpleados {
    
    public static void main(String[] args) {
        AdministrarEmpleados admEmpleados = new AdministrarEmpleados();
        //Agregar empleados
        admEmpleados.agregar(new Empleado(1, "Juan", 2500));
        admEmpleados.agregar(new Empleado(2, "Juanito", 1500));
        admEmpleados.agregar(new Empleado(3, "Juanita", 3500));
        admEmpleados.agregar(new Empleado(10, "Juana", 3500));
        admEmpleados.agregar(new Empleado(5, "Jose", 3500));
        
        //Mostrar Datos
        admEmpleados.imprimirDatos();
        
        //Buscar empleado por codigo
        System.out.println("Empleado encontrado en: "+admEmpleados.buscar(4));
        
         //Modificar Datos y mostrar datos
        admEmpleados.modificar(new Empleado(3, "Marcos", 8500));
        admEmpleados.imprimirDatos();
        
        //Eliminar empleado y mostrar datos
        admEmpleados.eliminar(2);
        admEmpleados.imprimirDatos();
        
       
        
    }
    
}
