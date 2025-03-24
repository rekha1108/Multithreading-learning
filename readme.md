# Inter-thread communication

1) `wait()` and `notify()` methods are used for inter thread communication.
2) Producer consumer problem -> if one thread produces and other thread consumes the value without wait and notify methods that will result in inconsistent producing and consuming like producer thread can produce value 2 times then consumer therad will come and consume But we want it to work sequentially means when producer produces a value consumer should consume that value and after that only producer should start producing.
3) Solution to problem in point 2 can be achived by `wait()` and `notify()` method when producer will be done with producing it will wait and notify to other thread for consuming.
4) When consumer will be done with consuming it will notify producer to produce.
5) The methods in which we use `wait()` should be synchronized. Because if a thread calling `wait()` method does not own the inherent lock, an exception `IllegalMonitorStateException` will be thrown.
