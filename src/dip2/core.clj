(ns dip2.core
  (:require
  [dip2.linear.controller :as linear]
  [dip2.inverted.controller :as inverted]
  [dip2.injected.controller :as injected]
  [dip2.shape :as shape]
  [dip2.square]) ;just so it compiles
  (:gen-class))

(defn -main
  [& args]
  (linear/execute {:type :square})
  (inverted/execute {:type :square})
  (injected/execute shape/printit {:type :square}))
