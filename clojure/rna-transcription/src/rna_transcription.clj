(ns rna-transcription)

(defn trans [x]
   (let [trans {\G \C \C \G \T \A \A \U}
         elemt (trans x)]
      (cond 
         (some? elemt) elemt
         :else (throw (AssertionError. "invalid element")))))

(defn to-rna [dna]
   (apply str (map trans (seq dna))))