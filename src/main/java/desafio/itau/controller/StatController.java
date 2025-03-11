package desafio.itau.controller;

import java.util.DoubleSummaryStatistics;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import desafio.itau.db.Statistics;
import desafio.itau.service.TransService;

@RestController
@RequestMapping("/estatistica")
public class StatController {
  
  private final TransService transService;

  public StatController(TransService transService){
    this.transService = transService;
  }
  @GetMapping
  public ResponseEntity <Statistics>  getStatistics(){
    DoubleSummaryStatistics stats = transService.getStatistics();
    return ResponseEntity.ok(new Statistics(stats));
  }
}
