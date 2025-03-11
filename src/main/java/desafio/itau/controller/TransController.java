package desafio.itau.controller;

import java.time.OffsetDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import desafio.itau.db.Request;
import desafio.itau.model.Transaction;
import desafio.itau.service.TransService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/transacao")
public class TransController {

  private final TransService transService;

  public TransController(TransService transService) {
    this.transService = transService;
  }

  @PostMapping
  public ResponseEntity<Void> createTransaction(@Valid @RequestBody Request request) {
    if (request.getDataHora().isAfter(OffsetDateTime.now()) || request.getValor() <=0) {
      return ResponseEntity.unprocessableEntity().build();
    }
    
    transService.addTransaction(new Transaction(request.getValor(), request.getDataHora()));

    return ResponseEntity.status(HttpStatus.CREATED).build();
  }

  @DeleteMapping
  public ResponseEntity<Void> clearTransactions() {
    transService.clearTransactions();
    return ResponseEntity.ok().build();
  }
}
