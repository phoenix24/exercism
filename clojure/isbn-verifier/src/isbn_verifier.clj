(ns isbn-verifier
    (:require [clojure.string :as str]))

(defn intt [x]
   (- (int x) 48))

(defn char? [x] 
   (Character/isLetter x))

(defn digit? [x] 
   (Character/isDigit x))

(defn clean [f c isbn]
   (map c (filter f isbn)))

(defn valid? [x]
   (zero? (rem x 11)))

(defn checksum [total index [ff & tail]]
  (cond 
     (nil? ff) total 
     (some? ff) (checksum (+ total (* index ff)) (dec index) tail)))

(defn isbn? [isbn]
   (let [isbn-digs (clean digit? intt isbn)
         isbn-chrs (clean char? identity isbn)
   	 isbn-ldigs (count isbn-digs)
   	 isbn-lchrs (count isbn-chrs)
   	 isbn-sum (checksum 0 10 isbn-digs)]
      (cond 
         (= 10 isbn-ldigs) (valid? isbn-sum)
	 (and (= 10 (+ isbn-ldigs isbn-lchrs)) (= \X (last isbn-chrs))) (valid? (+ isbn-sum 10))
	 :else false)))
