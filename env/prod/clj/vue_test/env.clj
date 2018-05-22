(ns vue-test.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[vue-test started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[vue-test has shut down successfully]=-"))
   :middleware identity})
