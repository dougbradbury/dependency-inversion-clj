(ns dip2.controller-test
  (:require [clojure.test :refer :all]
            [dip2.controller :refer :all]
            [dip2.shape :as shape]
            ))

(defn mock-print [shape]
  true)

(deftest a-test
  (testing "with mock"
    (is (= true (execute mock-print {:type :square})))))
