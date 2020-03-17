(ns scrabble-score
  (:require [clojure.string :as str]))

(def score-map 
   {"D" 2 
    "G" 2
    "B" 3
    "C" 3
    "M" 3
    "P" 3
    "F"	4
    "H"	4
    "V"	4
    "W"	4
    "Y"	4
    "K"	5
    "J"	8
    "X"	8
    "Q"	10
    "Z"	10})

(defn score-letter [x] 
  (score-map x 1))

(defn score-word [word]
  (let [upper-word (clojure.string/upper-case word)
        list-of-chars (map str (seq upper-word))]
    (reduce + 0 (map score-letter list-of-chars))))