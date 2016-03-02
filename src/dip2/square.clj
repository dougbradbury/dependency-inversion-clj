(ns dip2.square
  (:require [dip2.shape :as interface]))

(defmethod interface/printit :square [shape]
  (println "DIP: That thing is square")
  true)
