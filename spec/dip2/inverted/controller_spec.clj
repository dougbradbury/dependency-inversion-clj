(ns dip2.inverted.controller-spec
  (:require [speclj.core :refer :all]
            [dip2.inverted.controller :refer :all]
            [dip2.shape :as shape]))

(describe "inverted-test"
  (it "works with a mock"
           (with-redefs [dip2.shape/printit (constantly true)]
    (should= true (execute {:type :square})))))

(run-specs)
