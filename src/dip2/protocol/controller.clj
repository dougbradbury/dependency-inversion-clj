(ns dip2.protocol.controller
  (:require
    [dip2.protocol.shape :as ishape]))

(defn execute[shape]
  (println "************* Protocol Controller ***************")
  (println (ishape/area shape))
  (ishape/printit shape))
