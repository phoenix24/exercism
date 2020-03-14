(ns collatz-conjecture)

(defn isEven [num] 
      (== 0 (mod num 2)))

(defn isOdd [num] 
      (not (isEven num)))

(defn procesx [num] 
      (cond
	(isEven num) (/ num 2)
	:else (+ 1 (* 3 num))))

(defn process [num count] 
      (cond 
         (== 1 num) count
	 :else (process (procesx num) (+ 1 count))))

(defn collatz [num] 
      (process num 0))
