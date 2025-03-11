package desafio.itau.db;

import java.time.OffsetDateTime;

import jakarta.validation.constraints.NotNull;

public class Request {
  
  @NotNull
  
  private double valor;

  @NotNull
  private OffsetDateTime dataHora;

  public double getValor() {
    return valor;
  }

  public OffsetDateTime getDataHora() {
    return dataHora;
  }
}
