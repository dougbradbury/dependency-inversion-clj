(ns dip2.linear.controller
  (:require
   [dip2.linear.shapes :as shapes]))

(defn execute[shape]
  (shapes/printit {:type :square}))
