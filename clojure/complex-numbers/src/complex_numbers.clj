(ns complex-numbers)

(def real first)

(def imaginary second)

(defn abs [[a b]] 
   (Math/sqrt (+ (* a a) (* b b))))

(defn conjugate [[a b]] 
  [a (* -1 b)])

(def add (partial map +))

(def sub (partial map -))

(defn mul [[a b] [c d]] 
  (let [real (- (* a c) (* b d)) 
        imag (+ (* b c) (* a d))]
	[real imag]))

(defn div [[a b] [c d]] 
   (let [n1 (+ (* a c) (* b d))
   	 n2 (- (* b c) (* a d))
	 d1 (float (+ (* c c) (* d d)))]
	 [(/ n1 d1) (/ n2 d1)]))
