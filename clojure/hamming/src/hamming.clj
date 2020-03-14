(ns hamming)

(defn zip [s1 s2]
  (partition 2 
     (interleave s1 s2)))

(defn check [tuple]
   (let [x (first tuple)
         y (second tuple)]
      (if (= x y) 0 1)))

(defn compute [strand1 strand2]
   (apply +
       (map check 
       	 (zip strand1 strand2))))


(defn distance [strand1 strand2]
   (let [s1 (count strand1)
         s2 (count strand2)]
	 (cond
	    (= s1 s2) (compute strand1 strand2)
	    :else nil)))
