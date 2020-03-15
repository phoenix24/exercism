(ns complex-numbers)

(defn real [[a b]] 
  a)

(defn imaginary [[a b]] 
  b)

(defn abs [[a b]] 
   (Math/sqrt (+ (* a a) (* b b))))

(defn conjugate [[a b]] 
  [a (* -1 b)])

(defn add [[a b] [c d]] 
  (let [real (+ a c) 
        imag (+ b d)]
	[real imag]))

(defn sub [[a b] [c d]] 
  (let [real (- a c) 
        imag (- b d)]
	[real imag]))

(defn mul [[a b] [c d]] 
  (let [real (- (* a c) (* b d)) 
        imag (+ (* b c) (* a d))]
	[real imag]))

(defn div [[a b] [c d]] 
   (let [n1 (+ (* a c) (* b d))
   	 n2 (- (* b c) (* a d))
	 d1 (float (+ (* c c) (* d d)))]
	 [(/ n1 d1) (/ n2 d1)]))
