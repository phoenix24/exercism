(ns leap)

(defn leap-year? [year]
  (letfn [(div? [n] (zero? (mod year n)))]
     (or (div? 400)
         (and (div? 4)
	      (not (div? 100))))))
