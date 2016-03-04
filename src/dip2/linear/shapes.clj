(ns dip2.linear.shapes)

(defmulti printit :type)

(defmethod printit :default [shape]
  (println "default"))

(defmethod printit :square [shape]
  (println "That thing is square [] "))
