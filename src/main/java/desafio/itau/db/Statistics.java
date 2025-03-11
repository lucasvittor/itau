package desafio.itau.db;

import java.util.DoubleSummaryStatistics;

public class Statistics {

  private long count;
  private double min;
  private double max;
  private double avg;
  private double sum;

  public Statistics(DoubleSummaryStatistics stats) {
    this.count = stats.getCount();
    this.min = stats.getMin();
    this.max = stats.getMax();
    this.avg = stats.getAverage();
    this.sum = stats.getSum();
  }

  public long getCount() {
    return count;
  }

  public double getMin() {
    return min;
  }

  public double getMax() {
    return max;
  }

  public double getAvg() {
    return avg;
  }

  public double getSum() {
    return sum;
  }

}
