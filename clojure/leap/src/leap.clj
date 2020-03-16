(ns leap)

(defn divv [x] 
  (fn [y] 
    (= 0 (mod y x))))

(def div4
  (divv 4))

(def div100 
  (divv 100))

(def div400
  (divv 400))

(defn leap-year? [year]
  (or
     (div400 year)
     (and
        (div4 year)
        (not (div100 year)))))
