(ns raindrops)


(defn convert [n] 
   (letfn [(fac [x] (zero? (rem n x)))]
      (cond-> nil
         (fac 3) (str "Pling")
         (fac 5) (str "Plang")
         (fac 7) (str "Plong")
         :always (or (str n)))))