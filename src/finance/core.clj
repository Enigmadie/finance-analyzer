(ns finance.core
  (:require [compojure.core :refer [defroutes GET POST]]
            [compojure.route :as route]
            [ring.adapter.jetty :refer [run-jetty]]
            [cheshire.core :as json])
  (:gen-class))

(defroutes app-routes
  (GET "/" [] 
       {:status 200
        :headers {"Content-Type" "application/json"}
        :body (json/generate-string {:message "Running"})})
  (GET "/page" [] "<div><h1>Finance Analyzer</h1></div>")
  (route/not-found {:status 404 :body "Not Found"}))

(defn -main [& args]
  (run-jetty app-routes {:port 3000 :join? true}))
