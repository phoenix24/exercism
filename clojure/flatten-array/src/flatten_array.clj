(ns flatten-array)

(defn flatten [[a & rr]] 
   (cond
      (nil? a) []
      (vector? a) (concat (flatten a) (flatten rr))
      :else (concat [a] (flatten rr))))

