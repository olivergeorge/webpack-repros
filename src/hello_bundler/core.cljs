(ns hello-bundler.core
  (:require [goog.dom :as gdom]
            [reagent.dom :as dom]
            [react-select :as rs]
            [react-select/async :as rsa]))

(.log js/console "rs" rs)
(.log js/console "rsa" rsa)

(defn simple-component []
  [:div
   [:p "I am a component!"]
   [:p.someclass
    "I have " [:strong "bold"]
    [:span {:style {:color "red"}} " and red "] "text."]])

(dom/render [simple-component] (gdom/getElement "app"))
