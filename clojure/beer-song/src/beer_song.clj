(ns beer-song)

(defn verse
  "Returns the nth verse of the song."
  [num]
  (cond 
     (= num 0) (str "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n")
     (= num 1) (str "1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n")
     (= num 2) (str "2 bottles of beer on the wall, 2 bottles of beer.\nTake one down and pass it around, 1 bottle of beer on the wall.\n")
     :else (str num " bottles of beer on the wall, " num " bottles of beer.\nTake one down and pass it around, " (- num 1) " bottles of beer on the wall.\n"))
  )

(defn sing
  "Given a start and an optional end, returns all verses in this interval. If
  end is not given, the whole song from start is sung."
  ([start] (clojure.string/join "\n" (map verse (range start -1 -1))))
  ([start end] (clojure.string/join "\n" (map verse (range start (- end 1) -1)))))
