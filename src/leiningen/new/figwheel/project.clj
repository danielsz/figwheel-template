(defproject {{ name }} "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2202"]
                 [figwheel "0.1.0-SNAPSHOT"]]

  :plugins [[lein-cljsbuild "1.0.3"]
            [lein-figwheel "0.1.0-SNAPSHOT"]]
  :cljsbuild {
              :builds [{ :source-paths ["src"]
                         :compiler { :output-to "resources/public/js/compiled/{{sanitized}}.js"
                                     :output-dir "resources/public/js/compiled/out"
                                     :optimizations :none }}]}
  :figwheel {
             :http-server-root "public" ;; default and assumes "resources" 
             :server-port 3449 ;; default
             })