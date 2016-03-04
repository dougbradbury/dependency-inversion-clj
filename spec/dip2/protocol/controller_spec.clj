(ns dip2.protocol.controller-spec
  (:require [speclj.core :refer :all]
            [dip2.protocol.controller :refer :all]
            [dip2.protocol.shape :as shape]))


(deftype MockShape []
  shape/Shape
  (area [shape] "test area")
  (printit [shape] true))

(describe "injected"
  (it "does the mock thing"
    (should= true (execute (MockShape.) ))))

(run-specs)
