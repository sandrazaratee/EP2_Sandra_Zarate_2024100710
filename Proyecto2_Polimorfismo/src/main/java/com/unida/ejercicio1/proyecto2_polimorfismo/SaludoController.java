
package com.unida.ejercicio1.proyecto2_polimorfismo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SaludoController {
    
    @GetMapping("/saludo")
    public String mostrar() {
        return "saludo";
    }
}
