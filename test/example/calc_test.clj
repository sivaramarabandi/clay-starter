;; test/example/calc_test.clj
(ns example.calc-test
  (:require [clojure.test :refer :all]
            [example.calc-test :refer :all]))

(deftest adding-numbers
  (is (= 4 (+ 2 2))))

(deftest dividing-numbers 
  (is (= 2 (/ 4 2))))

