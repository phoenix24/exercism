(ns nucleotide-count)

(def nucleotides {\A 1 \T 1 \C 1 \G 1})

(defn count-of-nucleotide-in-strand [nu strand]
  (if (contains? nucleotides nu)
    (count (filter (fn [x] (= x nu)) strand))
    (throw (Exception. "throwing exception invalid nucleotide"))))

(defn nucleotide-counts [strand]
  (let [a (count-of-nucleotide-in-strand \A strand)
        t (count-of-nucleotide-in-strand \T strand)
	c (count-of-nucleotide-in-strand \C strand)
	g (count-of-nucleotide-in-strand \G strand)]
	{\A a \T t \C c \G g}))
