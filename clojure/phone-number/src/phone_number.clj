(ns phone-number)

(def invalid-number "0000000000")

(defn clean [number]
  (apply str
    (filter (fn [x] (Character/isDigit x)) number)))

(defn validate [number] 
  (let [ll-number (count number)]
     (cond
       (= 10 ll-number) number 
       (and (= 11 ll-number) (= "1" (subs number 0 1))) (subs number 1)
       :else invalid-number)))

(defn number [num-string]
  (validate 
     (clean num-string)))

(defn area-code [num-string] 
  (subs (number num-string) 0 3))

(defn pretty-print [num-string] 
   (let [cl-number (number num-string)
   	 area-code (subs cl-number 0 3)
	 prefix    (subs cl-number 3 6)
	 suffix    (subs cl-number 6 10)]
      (format "(%s) %s-%s" area-code prefix suffix)))