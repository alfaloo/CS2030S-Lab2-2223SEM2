class JoinQueue extends Event {
  /** 
   * Customer is now a separate class, currently
   * it only has one attribute, which is the
   * customerId. Can expand in the future with
   * other attributes such as the customer's age,
   * gender, service type, etc.
   */
  private Customer customer;
  
  /**
   * Bank is now a separate class, currently it
   * only has one function, which is the set of
   * counters represented as a boolean array.
   * Can expand in the future with other futionalities
   * such as waiting rooms, atms, etc.
   */
  private Bank bank;

  /**
   * Constructor for an Arrival event.
   *
   * @param time        The time this event occurs.
   * @param customer    The customer associated with this
   *                    event.
   * @param bank        The indicator of which bank is
   *                    visited
   */
  public JoinQueue(double time, Customer customer, Bank bank) {
    super(time);
    this.customer = customer;
    this.bank = bank;
  }

  @Override
  public Event[] simulate() {
    this.bank.getQueue().enq(this.customer);
    return new Event[] {};
  }

  @Override
  public String toString() {
    String str = String.format(": %s joined queue %s", this.customer, this.bank.getQueue());
    return super.toString() + str;
  }
}

