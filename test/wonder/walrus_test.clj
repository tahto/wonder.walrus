(ns wonder.walrus-test
  (:use midje.sweet)
  (:require [wonder.walrus :refer :all])
  (:import java.util.UUID))

(def q1-m
  {:type :entry
   :code :case/female/name
   :title "What is your wife's name"
   :data [{:type :string :input true}]})

(def q1-f
  {:type :entry
   :code :case/female/name
   :title "What is your name"
   :data [{:type :string :input true}]})

(def q1
  {:type :single
   :code :user/gender
   :title "Please select your gender"
   :data [{:type :compound
           :value :gender/male
           :children [q1-m]}
          {:type :compound
           :value :gender/female
           :children [q1-f]}]})
