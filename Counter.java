class Counter {
  /**
   * The id of the counter associated with this event.
   * This field only matters if the event type if 
   * SERVICE_BEGIN or SERVICE_END.
   */
  private int counterId;
  
  /**
   * This indicates the availability of this particular
   * counter. True means available, false means occupied.
   */
  private boolean available; 
  
  /**
   * Constructor for a Counter.
   * @param counterId   The id of the counter associated with
   *                    this event.
   */
  public Counter(int counterId) {
    this.counterId = counterId;
    this.available = true;
  }

  /**
   * Method to access counterId.
   *
   * @return this counter's Id
   */
  public int getCounterId() {
    return this.counterId;
  }

  /**
   * Sets the boolean value of this.available.
   *
   * @param update  Indicates the new availability of the counter.
   */
  public void setAvailability(boolean update) {
    this.available = update;
  }

  /**
   * Returns the boolean value of this.available.
   *
   * @return whether this counter is available,
   *         true if so, false otherwise.
   */
  public boolean getAvailability() {
    return this.available;
  }

  @Override
  public String toString() {
    return "S" + this.counterId;
  }
}
