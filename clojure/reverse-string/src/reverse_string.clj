(ns reverse-string)

(defn reverse-string-1 [s]
   (apply str (reverse s)))

(defn reverse-string-2 [s]
   (apply str (into () s)))

(defn reverse-string [s]
   (reduce #(str %2 %1) "" s))
