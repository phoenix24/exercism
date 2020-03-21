(ns armstrong-numbers)

(defn exp [e x] 
   (reduce * (repeat x e)))

(defn carm [lnum]
   (let [pow (count lnum)
         exps (map #(exp % pow) lnum)]
      (reduce + exps)))

(defn lint [snum]
   (map #(- (int %) 48) (seq snum)))

(defn armstrong? [num] 
   (let [snum (str num)
         lnum (lint snum)
	 anum (carm lnum)]
      	 (= anum num)))
