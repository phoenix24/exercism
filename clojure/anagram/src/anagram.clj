(ns anagram
  (:require [clojure.string :as str]))

(defn isanagram? [word1 word2] 
  (let [lw1 (str/lower-case word1)
	lw2 (str/lower-case word2)
	fw1 (frequencies lw1)
	fw2 (frequencies lw2)]
	(and 
	  (= fw1 fw2) 
	  (not= lw1 lw2))))

(defn anagrams-for [word prospect-list]
   (or (filter #(isanagram? word %) prospect-list) []))
