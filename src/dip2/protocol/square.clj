(ns dip2.protocol.square
  (:require [dip2.protocol.shape :as shape]))

(deftype Square [params]
  shape/Shape
  (printit [shape] (println "Printing a protocol square"))
  (area [shape] "2 feet sq"))
