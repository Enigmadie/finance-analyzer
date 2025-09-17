(defproject cl-app "0.1.0-SNAPSHOT"
  :description "clojure finance analyzer"
  :url ""
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [ring "1.8.0"]
                 [compojure "1.6.2"]
                 [org.clojure/clojurescript "1.11.132"]
                 [reagent "1.2.0"]
                 [cljs-http "0.1.46"]
                 [org.clojure/core.async "1.6.681"]
                 ]
  :plugins [[lein-figwheel "0.5.20"]
            [lein-cljsbuild "1.1.8"]]
  :ring {:handler health.system/app_routes
         :auto-reload? true
         :auto-refresh? true}
  :figwheel {:css-dirs ["resources/public/css"]}
  :source-paths ["src"]
  :main health.system
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
  :cljsbuild
  {:builds
   [{:id "dev"
     :source-paths ["src"]
     :figwheel {:on-jsload "my-app.core/on-js-reload"}
     :compiler {:main my-app.core
                :asset-path "js/compiled/out"
                :output-to "resources/public/js/compiled/my_app.js"
                :output-dir "resources/public/js/compiled/out"
                :source-map-timestamp true}}
    {:id "prod"
     :source-paths ["src"]
     :compiler {:main my-app.core
                :output-to "resources/public/js/compiled/my_app.js"
                :optimizations :advanced}}]})
