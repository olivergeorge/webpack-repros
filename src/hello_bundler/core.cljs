(ns hello-bundler.core
  (:require [reagent.core :as r]))

(js/console.log (pr-str ::hello))

(defn simple-component []
  [:div
   [:p "I am a component!"]
   [:p.someclass
    "I have " [:strong "bold"]
    [:span {:style {:color "red"}} " and red "] "text."]])

(def ^:export SimpleComponent (r/reactify-component simple-component))

