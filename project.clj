(defproject im.chit/spirit "0.1.0-SNAPSHOT"
  :description "workflow as data"
  :url "https://github.com/zcaudate/spirit"
  :license {:name "The MIT License"
            :url "http://http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :profiles {:dev {:plugins [[lein-midje "3.1.3"]
                             [lein-hydrox "0.1.16"]]
                   :dependencies [[midje "1.6.3"]
                                  [helpshift/hydrox "0.1.16"]]}})
