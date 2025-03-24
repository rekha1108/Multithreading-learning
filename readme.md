# Multithreading Learning

## Inter-Thread Communication (wait & notify)

### Overview
Inter-thread communication is essential for synchronizing multiple threads in a multithreaded environment. The `wait()`, `notify()`, and `notifyAll()` methods help threads coordinate their execution efficiently.

### Key Concepts
1. **Why Use wait & notify?**
   - Helps manage thread execution order.
   - Prevents busy waiting, improving performance.
   
2. **How It Works?**
   - A thread calls `wait()` inside a synchronized block, releasing the lock and pausing execution.
   - Another thread calls `notify()` or `notifyAll()` to wake up waiting threads.
   
3. **Common Use Case: Producer-Consumer Problem**
   - Producer generates data and waits if the buffer is full.
   - Consumer consumes data and notifies the producer when space is available.

### Notes
- `wait()` and `notify()` must be used within a synchronized block.
- Calling `wait()` without holding a lock will throw `IllegalMonitorStateException`.

### Future Topics (To Be Added)
- Thread Creation & Lifecycle
- Thread Synchronization
- Deadlocks & Avoidance Strategies
- Executor Framework

---
**📌 Stay tuned! More multithreading concepts will be added soon.**
