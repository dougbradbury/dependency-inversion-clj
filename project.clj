(defproject dip2 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [ [speclj "3.3.1"][org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot dip2.core
  :target-path "target/%s"
            :test-paths ["spec"]
  :plugins [ [speclj "3.3.1"][lein-ns-dep-graph "0.1.0-SNAPSHOT"]]
  :profiles {:uberjar {:aot :all}})
