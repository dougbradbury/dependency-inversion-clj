(ns dip2.linear.shapes)

(defmulti printit :type)

(defmethod printit :default [shape]
  (println "default"))

(defmethod printit :square [shape]
  (println "That thing is square [] "))

;defmulti just becomes a fancy case statment
;Why not, that's the example!
;http://clojuredocs.org/clojure.core/defmulti
