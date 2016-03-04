(ns dip2.shape)

(defmulti printit :type)

(defmethod printit :default [shape]
  (println "default")
  false)
