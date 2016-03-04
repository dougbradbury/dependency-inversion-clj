(ns dip2.inverted.controller
  (:require
    [dip2.shape :as interface]))

(defn execute[shape]
  (println "************* Inverted Controller ***************")
  (interface/printit shape))
