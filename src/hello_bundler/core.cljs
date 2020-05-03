(ns hello-bundler.core
  (:require [react]
            ["aws-amplify" :as aws]))

(def m aws)

(.log js/console react/Component)
(.log js/console "aws" m)
(.log js/console "aws type" (type m))
(.log js/console "aws keys" (goog.object/getKeys m))

