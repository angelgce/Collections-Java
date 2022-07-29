import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.ListModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<Integer>();
        lista.add(10);
        lista.add(5);
        lista.add(6);
        lista.add(3);
        lista.add(2);

        // lambda for each
        lista.forEach(calificacion -> System.out.println(calificacion));
        System.out.println("-------------------");
        // filter - progamacion funcional
        lista.stream().filter(item -> item > 6).forEach(resultado -> System.out.println(resultado));

        // -----
        Empleado empleado1 = new Empleado("Angel", 28);
        Empleado empleado2 = new Empleado("Mario", 47);
        Empleado empleado3 = new Empleado("juan", 19);
        Empleado empleado4 = new Empleado("luis", 10);
        List<Empleado> listaEmp = new ArrayList<Empleado>();
        listaEmp.add(empleado1);
        listaEmp.add(empleado2);
        listaEmp.add(empleado3);
        listaEmp.add(empleado4);
        // l
        System.out.println("-------------------");
        listaEmp.stream().filter(empleado -> empleado.getEdad() > 18)
                .forEach(resultado -> System.out.println(resultado.getEdad()));
        System.out.println("-------------------");
        Collections.sort(listaEmp, (e1, e2) -> e1.getEdad() - e2.getEdad());
        System.out.println(listaEmp.get(0));
        //
        System.out.println("-------------------");
        lista.stream().map(numero -> numero + 1).forEach(resultado -> System.out.println(resultado));
        //
        List<Empleado> listaFilter = listaEmp.stream().filter(empleado -> empleado.getEdad() > 18)
                .collect(Collectors.toList());
        //
        System.out.println("-------------------");
        String csvEdad = "10,5,6,21,23,45,67,85,32,34,12,34,54";
        String[] split = csvEdad.split(",");

        List<Integer> edades = Arrays.asList(split).stream().map(string -> Integer.parseInt(string))
                .filter(num -> num > 18).collect(Collectors.toList());

        // listaEmp.stream().map(empleado ->
        // empleado.setNombre(empleado.getNombre().toUpperCase()));

    }

}