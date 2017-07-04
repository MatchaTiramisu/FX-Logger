package model;

import java.time.LocalDateTime;
import java.util.Objects;

public final class Transaction {
  private final Currency fromCurrency;
  private final Currency toCurrency;
  private final double price;
  private final int amount;
  private final LocalDateTime time;

  public Transaction(final Currency fromCurrency, final Currency toCurrency,
	  final double price, final int amount, final LocalDateTime time) {
	this.fromCurrency = fromCurrency;
	this.toCurrency = toCurrency;
	this.price = price;
	this.amount = amount;
	this.time = time;
  }

  public Currency getFromCurrency() {
	return fromCurrency;
  }

  public Currency getToCurrency() {
	return toCurrency;
  }

  public double getPrice() {
	return price;
  }

  public int getAmount() {
	return amount;
  }

  public LocalDateTime getTime() {
	return time;
  }

  @Override
  public String toString() {
	return "Transaction [fromCurrency=" + fromCurrency + ", toCurrency=" + toCurrency + ", price=" + price
		+ ", amount=" + amount + ", time=" + time + "]";
  }

  @Override
  public int hashCode() {
	return Objects.hash(fromCurrency, toCurrency, price, time, amount);
  }

  @Override
  public boolean equals(final Object obj) {
	if (obj instanceof Transaction) {
	  final Transaction that = (Transaction) obj;
	  return this.fromCurrency == that.fromCurrency
		  && this.toCurrency == that.toCurrency
		  && Double.doubleToLongBits(this.price) == Double.doubleToLongBits(that.price)
		  && Objects.equals(this.time, that.time)
		  && this.amount == that.amount;
	}
	return false;
  }
}
