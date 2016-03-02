(ns dip2.core
  (:require
  [dip2.square]
  [dip2.controller :as ctl])
  (:gen-class))

(defn -main
  [& args]
  (ctl/execute {:type :square}))
