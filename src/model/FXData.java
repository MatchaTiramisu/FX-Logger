package model;

import java.util.Objects;

/**
 * Mutable class to store buy and sell transactions
 */
public final class FXData {
  private final int id;
  private Transaction buy;
  private Transaction sell;
  // Absolute path to local machine
  private String imagePath;

  public FXData(final int id) {
	this.id = id;
  }

  public int getId()
  {
	return id;
  }

  public Transaction getBuy() {
	return buy;
  }

  public void setBuy(final Transaction buy) {
	this.buy = buy;
  }

  public Transaction getSell() {
	return sell;
  }

  public void setSell(final Transaction sell) {
	this.sell = sell;
  }

  public String getImagePath() {
	return imagePath;
  }

  public void setImagePath(final String imagePath) {
	this.imagePath = imagePath;
  }

  @Override
  public String toString() {
	return "FXData [id=" + id + ", buy=" + buy.toString() + ", sell=" + sell.toString()
		+ ", imagePath=" + imagePath + "]";
  }

  @Override
  public int hashCode() {
	return Objects.hash(id, buy, sell, imagePath);
  }

  @Override
  public boolean equals(final Object obj) {
	if (obj instanceof FXData) {
	  final FXData that = (FXData) obj;
	  return this.id == that.id
		  && Objects.equals(this.buy, that.buy)
		  && Objects.equals(this.sell, that.sell)
		  && Objects.equals(this.imagePath, that.imagePath);
	}
	return false;
  }
}
