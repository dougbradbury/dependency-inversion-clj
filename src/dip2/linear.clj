(ns dip2.linear)

(defmulti printit :type)

(defmethod printit :default [shape]
            (println "default"))

(defmethod printit :square [shape]
  (println "That thing is square"))
