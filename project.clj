(defproject cl-app "0.1.0-SNAPSHOT"
  :description "clojure simple project"
  :url ""
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [ring "1.8.0"]
                 [compojure "1.6.2"]]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler health.system/app_routes
         :auto-reload? true
         :auto-refresh? true}
  :main health.system
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
