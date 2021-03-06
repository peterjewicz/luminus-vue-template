(ns vue-test.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [vue-test.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[vue-test started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[vue-test has shut down successfully]=-"))
   :middleware wrap-dev})
