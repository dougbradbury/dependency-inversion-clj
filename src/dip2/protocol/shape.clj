(ns dip2.protocol.shape)

(defprotocol Shape
  "a Shape protocol"
  (printit [shape] "prints the shape")
  (area [shape] "calculates the area"))
