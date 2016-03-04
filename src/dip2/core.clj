(ns dip2.core
  (:require
  [dip2.linear.controller :as linear]
  [dip2.inverted.controller :as inverted]
  [dip2.injected.controller :as injected]
  [dip2.protocol.controller :as protocoled]
  [dip2.protocol.square :as p-square]
  [dip2.shape :as shape]
  [dip2.square]) ;just so it compiles
  (:import dip2.protocol.square.Square)
  (:gen-class))

(defn -main
  [& args]
  (let [square {:type :square}]
  (linear/execute square)
  (inverted/execute square)
  (injected/execute shape/printit square)
  (protocoled/execute (Square. square))))
