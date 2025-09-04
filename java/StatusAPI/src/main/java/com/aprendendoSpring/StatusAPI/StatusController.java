package com.aprendendoSpring.StatusAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 

@RestController
public class StatusController {
    @GetMapping("/status")
    public String getStatus(){
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
        String dataHoraFormatada = agora.format(formatter);
        return "API está funcionando!! Acesso em " + dataHoraFormatada;
    }
}
