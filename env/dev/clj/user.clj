(ns user
  (:require [vue-test.config :refer [env]]
            [clojure.spec.alpha :as s]
            [expound.alpha :as expound]
            [mount.core :as mount]
            [vue-test.core :refer [start-app]]))

(alter-var-root #'s/*explain-out* (constantly expound/printer))

(defn start []
  (mount/start-without #'vue-test.core/repl-server))

(defn stop []
  (mount/stop-except #'vue-test.core/repl-server))

(defn restart []
  (stop)
  (start))


