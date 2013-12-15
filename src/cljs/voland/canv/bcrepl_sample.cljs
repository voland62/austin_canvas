(ns voland.canv.bcrepl-sample
  (:require [clojure.browser.repl]))

(defn hello
  []
  (js/alert "hello Andrew!!"))

(defn whoami
  []
  (.-userAgent js/navigator))




(def can (.getElementById js/document "myCanvas"))
(def context (.getContext can "2d"))

(set! (.-fillStyle context) "#ffffaa")
(.fillRect context 0 0 500 300)
