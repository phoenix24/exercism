(ns pangram
    (:require [clojure.string :as str]))

(def alphas (set "abcdefghijklmnopqrstuvwxyz"))

(defn pangram? [msg]
   (every? 
      (set (clojure.string/lower-case msg)) 
      alphas))
