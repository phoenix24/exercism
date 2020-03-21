(ns word-count
  (:require [clojure.string :as str]))

(defn isalpha? [x]
   (or 
     (Character/isDigit x)
     (Character/isSpace x)
     (Character/isLetter x)))

(defn word-count [s] 
   (let [string (->> s
                  (filter isalpha?)
		  (apply str)
		  (str/trim)
		  (str/lower-case))]
      (frequencies (str/split string #"\s+"))))
