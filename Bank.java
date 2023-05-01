class Bank {
  /**
   * An array containing all the counters. Each
   * counter will have an int id attribute and
   * a boolean available attribute.
   */
  private Counter[] allCounters;
  
  /**
   * Queue for the bank.
   */
  private Queue queue;
 
  /**
   * Bank constructor to initialise the counters.
   *
   * @param numOfCounters  Number of counters in the bank
   * @param maxQueue       Maximum length of the queue
   */ 
  public Bank(int numOfCounters, int maxQueue) {
    this.allCounters = new Counter[numOfCounters];
    for (int i = 0; i < numOfCounters; i++) {
      this.allCounters[i] = new Counter(i);
    }
    this.queue = new Queue(maxQueue);
  }

  /**
   * Method to retrieve the first available
   * counter.
   *
   * @return Return first available counter,
   *         otherwise return null.
   */
  public Counter findCounter() {
    // Find the first available counter.
    for (Counter i : allCounters) {
      if (i.getAvailability()) {
        // returns the available counter
        return i;
      }
    }
    // return null if there are no empty counter
    return null;
  }

  /**
   * Method to access the queue.
   *
   * @return the entire queue object
   */
  public Queue getQueue() {
    return this.queue;
  }
}
