(ns dip2.injected.controller-spec
  (:require [speclj.core :refer :all]
            [dip2.injected.controller :refer :all]
            [dip2.shape :as shape]))


(defn mock-print [shape]
  true)

(describe "injected"
  (it "does the mock thing"
    (should= true (execute mock-print {:type :square}))))

(run-specs)
