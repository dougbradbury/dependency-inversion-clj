(ns dip2.controller
  (:require
    [dip2.shape :as shape]
   ; [dip2.linear :as linear]
    ))

(defn execute[printer shape]
  ;(linear/printit {:type :square})
  (printer shape))
