(ns hello-bundler.core
  (:require [react]
            ["aws-amplify" :as aws]
            ["@aws-amplify/ui-react" :as ui-react]))

(def m1 aws)

(.log js/console react/Component)

(.log js/console "aws" m1)
(.log js/console "aws type" (type m1))
(.log js/console "aws keys" (goog.object/getKeys m1))

(def m2 ui-react)

(.log js/console "ui-react" m2)
(.log js/console "ui-react type" (type m2))
(.log js/console "ui-react keys" (goog.object/getKeys m2))

