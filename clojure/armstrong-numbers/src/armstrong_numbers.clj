(ns armstrong-numbers)

(defn armstrong? [num] 
   (let [digits (->> num str (map #(Character/digit % 10)))
         power (count digits)]
      (->> digits
           (map #(Math/pow % power))
	   (apply +)
	   (== num))))
