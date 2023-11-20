package uy.edu.um;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DisponibilidadPuertasT {
    String aeropuerto;
    String hora;
    LocalDate fecha;
    
}
