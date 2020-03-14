(ns hamming)

(defn distance [x y]
   (if (= (count x) (count y))
       (count (filter false? (map = x y)))))
