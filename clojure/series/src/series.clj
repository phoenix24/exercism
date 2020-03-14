(ns series)

(defn countr [string ln] 
   (cond
      (= ln 0) 1
      :else (- (+ (count string) 1) ln)))

(defn substr [string ln]
   (fn [st] (subs string st (+ st ln))))

(defn slices [string length]
  (map 
    (substr string length)
    (range (countr string length))))
