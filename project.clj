(defproject finance "0.1.0-SNAPSHOT"
  :description "Finance backend service"
  :url ""
  :min-lein-version "2.9.8"

  :dependencies [[org.clojure/clojure "1.11.1"]
                 [ring/ring-core "1.11.0"]
                 [ring/ring-jetty-adapter "1.11.0"]
                 [compojure "1.7.0"]
                 [cheshire "5.11.0"]
                 [org.slf4j/slf4j-simple "2.0.9"]]

  :main finance.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
