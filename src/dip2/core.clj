(ns dip2.core
  (:require
  [dip2.shape :as shape]
  [dip2.square]
  [dip2.controller :as ctl])
  (:gen-class))

(defn -main
  [& args]
  (ctl/execute shape/printit {:type :square}))
