(ns phone-number
    (:require [clojure.string :as str]))

(def invalid-number "0000000000")

(defn validate [number] 
  (let [ll-number (count number)]
     (cond
       (= 10 ll-number) number 
       (and (= 11 ll-number) (= "1" (subs number 0 1))) (subs number 1)
       :else invalid-number)))

(defn number [num-string]
  (let [cl-number (str/join (re-seq #"\d" num-string))]
    (validate cl-number)))

(defn area-code [num-string] 
  (let [cl-number (number num-string)]
    (subs cl-number 0 3)))

(defn pretty-print [num-string] 
   (let [cl-number (number num-string)
   	 area-code (subs cl-number 0 3)
	 prefix    (subs cl-number 3 6)
	 suffix    (subs cl-number 6 10)]
      (format "(%s) %s-%s" area-code prefix suffix)))