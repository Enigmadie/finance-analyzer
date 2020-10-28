(ns health.system
  (:require [ring.adapter.jetty :refer [run-jetty]]
             [compojure.core :refer :all]
             [compojure.route :as route]))

(defroutes app_routes
  (GET "/" [] "Hello")
  (GET "/coll" [] "COLL")
  (route/not-found "<h1>Page not found</h1>"))

(defn -main [& args]
  (run-jetty app_routes {:port 8000})
  (println "Started server"))
