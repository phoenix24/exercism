(ns pangram
    (:require [clojure.string :as str]))

(def alphas (set "abcdefghijklmnopqrstuvwxyz"))

(defn lower [x]
  (clojure.string/lower-case x))

(defn isalpha? [x]
  (Character/isLetter x))

(defn clean [msg]
  (set 
    (filter isalpha? (lower msg))))

(defn pangram? [msg]
  (if (= alphas (clean msg)) true false))
