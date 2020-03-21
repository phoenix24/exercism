(ns bob
    (:require [clojure.string :as str]))

(defn acronym? [msg]
   (let [words #{"OK" "DMV"}]
      (contains? words msg)))

(defn isupper? [msg]
   (cond
      (acronym? msg) false
      :else (every? true? (map #(Character/isUpperCase %) msg))))

(defn yelling? [msg]
   (reduce 
      #(or %1 %2)
      false
      (map isupper? (str/split msg #"\W+")))) 

(defn question? [msg] 
   (str/ends-with? msg "?"))

(defn response-for [s]
   (let [msg (str/trim s)
   	 is-yelling (yelling? msg)
   	 is-question (question? msg)]
   (cond
      (= "" msg) "Fine. Be that way!"
      (and is-question is-yelling) "Calm down, I know what I'm doing!"
      (true? is-yelling) "Whoa, chill out!"
      (true? is-question) "Sure."
      :else "Whatever.")))

