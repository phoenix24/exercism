(ns rna-transcription)

(defn trans [x]
   (cond 
      (= x \G) "C"
      (= x \C) "G"
      (= x \T) "A"
      (= x \A) "U"
      :else (throw (AssertionError. "invalid element"))))

(defn to-rna [dna]
   (apply str (map trans (seq dna))))