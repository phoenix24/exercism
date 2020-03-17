(ns raindrops)

(defn drops [n]
   (letfn [(fac [x] (zero? (rem n x)))]
      (str 
         (if (fac 3) "Pling" "")
         (if (fac 5) "Plang" "")
         (if (fac 7) "Plong" ""))))

(defn convert [n] 
   (let [msg (drops n)]
      (if (empty? msg) (str n) msg)))
