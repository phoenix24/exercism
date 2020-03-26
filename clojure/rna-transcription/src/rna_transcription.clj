(ns rna-transcription)

(defn- trans [x]
   (case x 
       \G \C
       \C \G
       \T \A 
       \A \U
       (throw (AssertionError. "Wrong input."))))
     
(defn to-rna [dna]
   (apply str (map trans dna)))