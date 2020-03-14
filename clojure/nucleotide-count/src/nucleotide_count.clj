(ns nucleotide-count)

(def nucleotides {\A 1 \T 1 \C 1 \G 1})

(defn count-of-nucleotide-in-strand [nu strand]
  (if (contains? nucleotides nu)
    (count (filter (fn [x] (= x nu)) strand))
    (throw (Exception. "throwing exception invalid nucleotide"))))

(defn nucleotide-counts [strand]
   (merge {\A 0 \T 0 \C 0 \G 0}
         (frequencies strand)))

