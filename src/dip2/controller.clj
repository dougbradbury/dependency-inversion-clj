(ns dip2.controller
  (:require
    [dip2.shape :as shape]
    [dip2.linear :as linear]))

(defn execute[shape]
  (linear/printit {:type :square})
  (shape/printit shape))
