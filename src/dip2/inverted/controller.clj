(ns dip2.inverted.controller
  (:require
    [dip2.shape :as interface]))

(defn execute[shape]
  (interface/printit shape))
