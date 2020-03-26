(ns isogram
   (:require [clojure.string :as str]))


(defn isalpha? [word]
   (filter #(Character/isLetter %) word))

(defn isogram? [word]
   (let [lword (str/lower-case word)
         letters (isalpha? lword)]
      (= (count letters) 
         (count (set letters)))))
