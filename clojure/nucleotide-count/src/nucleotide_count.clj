(ns nucleotide-count)

(defn count-of-nucleotide-in-strand [nu strand]
  {:pre [(contains? #{\A \T \C \G} nu)]}
  (count (filter (fn [x] (= x nu)) strand)))

(defn nucleotide-counts [strand]
   (merge {\A 0 \T 0 \C 0 \G 0}
         (frequencies strand)))

