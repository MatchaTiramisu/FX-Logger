package model;

import java.time.LocalDateTime;

public class FXStats {
  public static FXStats createStatsFromData(final FXData data)
  {
	// TODO
	// Calculate stats from the data entry
	return new FXStats(null, 0, 0);
  }

  public enum Result
  {
	WIN, LOSE;
  }

  private final LocalDateTime timePassed;
  private final double profit;
  private final int pips;

  private FXStats(final LocalDateTime timePassed, final double profit, final int pips) {
	this.timePassed = timePassed;
	this.profit = profit;
	this.pips = pips;
  }

  public LocalDateTime getTimePassed() {
	return timePassed;
  }

  public double getProfit() {
	return profit;
  }

  public int getPips() {
	return pips;
  }

  // TODO toStirng, equals and hash
}
