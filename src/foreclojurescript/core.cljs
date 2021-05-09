(ns foreclojurescript.core
  (:require [cljs.js]))

(def problems
     [
      {:_id 1
       :title "Nothing but the Truth"
       :times-solved 0
       :description "This is a clojure form.  Enter a value which will make the form evaluate to true.  Don't over think it!  If you are confused, see the <a href='/directions'>getting started</a> page.  Hint: true is equal to true."
       :tags ["elementary"]
       :approved true
       :placeholder "0"
       :tests ["(= __ true)"]}
      
      {:_id 2
       :title "Simple Math"
       :times-solved 0
       :description "If you are not familiar with <a href='http://en.wikipedia.org/wiki/Polish_notation'>polish notation</a>, simple arithmetic might seem confusing."
       :tags ["elementary"]
       :approved true
       :placeholder "42"
       :tests ["(= (- 10 (* 2 3)) __)"]}

      {:_id 3
       :title "Intro to Strings"
       :times-solved 0
       :description "Clojure strings are Java strings.  This means that you can use any of the Java string methods on Clojure strings."
       :tags["elementary"]
       :approved true
       :placeholder "\"foo\""
       :tests ["(= __ (.toUpperCase \"hello world\"))"]}

      {:_id 4
       :title "Intro to Lists"
       :times-solved 0
       :description "Lists can be constructed with either a function or a quoted form."
       :tags["elementary"]
       :approved true
       :placeholder ""
       :tests ["(= (list __) '(:a :b :c))"]}

      {:_id 5
       :title "Lists: conj"
       :times-solved 0
       :description "When operating on a list, the conj function will return a new list with one or more items \"added\" to the front."
       :tags["elementary"]
       :approved true
       :placeholder "'(2 3 4)"
       :tests ["(= __ (conj '(2 3 4) 1))"
               "(= __ (conj '(3 4) 2 1))"]}

      {:_id 6
       :title "Intro to Vectors"
       :times-solved 0
       :description "Vectors can be constructed several ways.  You can compare them with lists."
       :tags["elementary"]
       :approved true
       :tests ["(= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))"]}

      {:_id 7
       :title "Vectors: conj"
       :times-solved 0
       :description "When operating on a Vector, the conj function will return a new vector with one or more items \"added\" to the end."
       :tags["elementary"]
       :approved true
       :placeholder "[]"
       :tests ["(= __ (conj [1 2 3] 4))"
               "(= __ (conj [1 2] 3 4))"]}
      {:_id 8
       :title "Intro to Sets"
       :times-solved 0
       :description "Sets are collections of unique values."
       :tags["elementary"]
       :approved true
       :placeholder "(set '())"
       :tests ["(= __ (set '(:a :a :b :c :c :c :c :d :d)))"
               "(= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))"]}

      {:_id 9
       :title "Sets: conj"
       :times-solved 0
       :description "When operating on a set, the conj function returns a new set with one or more keys \"added\"."
       :tags["elementary"]
       :approved true
       :placeholder "0"
       :tests ["(= #{1 2 3 4} (conj #{1 4 3} __))"]}

      {:_id 10
       :title "Intro to Maps"
       :times-solved 0
       :description "Maps store key-value pairs.  Both maps and keywords can be used as lookup functions. Commas can be used to make maps more readable, but they are not required."
       :tags["elementary"]
       :approved true
       :tests ["(= __ ((hash-map :a 10, :b 20, :c 30) :b))"
               "(= __ (:b {:a 10, :b 20, :c 30}))"]}

      {:_id 11
       :title "Maps: conj"
       :times-solved 0
       :description "When operating on a map, the conj function returns a new map with one or more key-value pairs \"added\"."
       :tags["elementary"]
       :approved true
       :tests ["(= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))"]}

       {:_id 12
        :title "Intro to Sequences"
        :times-solved 0
        :description "All Clojure collections support sequencing.  You can operate on sequences with functions like first, second, and last."
        :tags["elementary"]
        :approved true
        :tests ["(= __ (first '(3 2 1)))"
                "(= __ (second [2 3 4]))"
                "(= __ (last (list 1 2 3)))"]}

      {:_id 13
       :title "Sequences: rest"
       :times-solved 0
       :description "The rest function will return all the items of a sequence except the first."
       :tags["elementary"]
       :approved true
       :placeholder "[10 20 30 40]"
       :tests ["(= __ (rest [10 20 30 40]))"]}

      {:_id 14
       :title "Intro to Functions"
       :times-solved 0
       :description "Clojure has many different ways to create functions."
       :tags["elementary"]
       :approved true
       :tests ["(= __ ((fn add-five [x] (+ x 5)) 3))"
               "(= __ ((fn [x] (+ x 5)) 3))"
               "(= __ (#(+ % 5) 3))"
               "(= __ ((partial + 5) 3))"]}

      {:_id 15
       :title "Double Down"
       :times-solved 0
       :description "Write a function which doubles a number."
       :tags ["elementary"]
       :approved true
       :palceholder "(fn double [x] x)"
       :tests ["(= (__ 2) 4)"
               "(= (__ 3) 6)"
               "(= (__ 11) 22)"
               "(= (__ 7) 14)"]}

      {:_id 16
       :title "Hello World"
       :times-solved 0
       :description "Write a function which returns a personalized greeting."
       :tags ["elementary"]
       :approved true
       :placeholder "(fn greet [name] \"Hello\")"
       :tests ["(= (__ \"Dave\") \"Hello, Dave!\")"
               "(= (__ \"Jenn\") \"Hello, Jenn!\")"
               "(= (__ \"Rhea\") \"Hello, Rhea!\")"]}
      
      {:_id 17
       :title "Sequences: map"
       :times-solved 0
       :description "The map function takes two arguments: a function (f) and a sequence (s).  Map returns a new sequence consisting of the result of applying f to each item of s.  Do not confuse the map function with the map data structure."
       :tags["elementary"]
       :approved true
       :placeholder "'(1 2 3)"
       :tests ["(= __ (map #(+ % 5) '(1 2 3)))"]}

      {:_id 18
       :title "Sequences: filter"
       :times-solved 0
       :description "The filter function takes two arguments: a predicate function (f) and a sequence (s).  Filter returns a new sequence consisting of all the items of s for which (f item) returns true."
       :tags["elementary"]
       :approved true
       :placeholder "'(3 4 5 6 7)"
       :tests ["(= __ (filter #(> % 5) '(3 4 5 6 7)))"]}

      {:_id 19
       :title "Last Element"
       :times-solved 0
       :restricted ["last"]
       :description "Write a function which returns the last element in a sequence."
       :tags ["easy" "seqs" "core-functions"]
       :approved true
       :placeholder "(fn last [l] 0)"
       :tests ["(= (__ [1 2 3 4 5]) 5)"
               "(= (__ '(5 4 3)) 3)"
               "(= (__ [\"b\" \"c\" \"d\"]) \"d\")"]}
      
      {:_id 20
       :title "Penultimate Element"
       :times-solved 0
       :description "Write a function which returns the second to last element from a sequence."
       :tags["easy" "seqs"]
       :approved true
       :placeholder "(fn penultimate [x] 0)"
       :tests ["(= (__ (list 1 2 3 4 5)) 4)"
               "(= (__ [\"a\" \"b\" \"c\"]) \"b\")"
               "(= (__ [[1 2] [3 4]]) [1 2])"]}

      {:_id 21
       :title "Nth Element"
       :times-solved 0
       :restricted ["nth"]
       :description "Write a function which returns the Nth element from a sequence."
       :tags["easy" "seqs" "core-functions"]
       :approved true
       :placeholder "(fn nth [x] 0)"
       :tests ["(= (__ '(4 5 6 7) 2) 6)"
                      "(= (__ [:a :b :c] 0) :a)"
                      "(= (__ [1 2 3 4] 1) 2)"
                      "(= (__ '([1 2] [3 4] [5 6]) 2) [5 6])"]}
      
      {:_id 22
       :title "Count a Sequence"
       :times-solved 0
       :restricted ["count"]
       :description "Write a function which returns the total number of elements in a sequence."
       :tags["easy" "seqs" "core-functions"]
       :approved true
       :placeholder "(fn cnt [x] 0)"
       :tests ["(= (__ '(1 2 3 3 1)) 5)"
               "(= (__ \"Hello World\") 11)"
               "(= (__ [[1 2] [3 4] [5 6]]) 3)"
               "(= (__ '(13)) 1)"
               "(= (__ '(:a :b :c)) 3)"]}

      {:_id 23
       :title "Reverse a Sequence"
       :times-solved 0
       :restricted ["reverse"]
       :description "Write a function which reverses a sequence."
       :tags["easy" "seqs" "core-functions"]
       :approved true
       :placeholder "(fn reverse [s] s)"
       :tests ["(= (__ [1 2 3 4 5]) [5 4 3 2 1])"
               "(= (__ (sorted-set 5 7 2 7)) '(7 5 2))"
               "(= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])"]}

      {:_id 24
       :title "Sum It All Up"
       :times-solved 0
       :description "Write a function which returns the sum of a sequence of numbers."
       :tags ["easy" "seqs"]
       :approved true
       :placeholder "(fn sum [s] 0)"
       :tests ["(= (__ [1 2 3]) 6)"
               "(= (__ (list 0 -2 5 5)) 8)"
               "(= (__ #{4 2 1}) 7)"
               "(= (__ '(0 0 -1)) -1)"
               "(= (__ '(1 10 3)) 14)"]}

      {:_id 25
       :title "Find the odd numbers"
       :times-solved 0
       :description "Write a function which returns only the odd numbers from a sequence."
       :tags["easy" "seqs"]
       :approved true
       :placeholder "(fn only-odds [s] s)"
       :tests ["(= (__ #{1 2 3 4 5}) '(1 3 5))"
               "(= (__ [4 2 1 6]) '(1))"
               "(= (__ [2 2 4 6]) '())"
               "(= (__ [1 1 1 3]) '(1 1 1 3))"]}

      {:_id 26
       :title "Fibonacci Sequence"
       :times-solved 0
       :description "Write a function which returns the first X fibonacci numbers."
       :tags["easy" "Fibonacci" "seqs"]
       :approved true
       :placeholder "(fn fib-seq [n] '(1))"
       :tests ["(= (__ 3) '(1 1 2))"
               "(= (__ 6) '(1 1 2 3 5 8))"
               "(= (__ 8) '(1 1 2 3 5 8 13 21))"]}

      {:_id 27
       :title "Palindrome Detector"
       :times-solved 0
       :description "Write a function which returns true if the given sequence is a palindrome.<br/><br>
                Hint: \"racecar\" does not equal '(\\r \\a \\c \\e \\c \\a \\r)"
       :tags["easy" "seqs"]
       :approved true
       :placeholder "(fn palindrome? [s] nil)"
       :tests ["(false? (__ '(1 2 3 4 5)))"
               "(true? (__ \"racecar\"))"
               "(true? (__ [:foo :bar :foo]))"
               "(true? (__ '(1 1 3 3 1 1)))"
               "(false? (__ '(:a :b :c)))"]}

      {:_id 28
       :title "Flatten a Sequence"
       :times-solved 0
       :restricted ["flatten"]
       :description "Write a function which flattens a sequence."

       :tags["easy" "seqs" "core-functions"]
       :approved true
       :placeholder "(fn flatten [s] s)"
       :tests ["(= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))"
               "(= (__ [\"a\" [\"b\"] \"c\"]) '(\"a\" \"b\" \"c\"))"
               "(= (__ '((((:a))))) '(:a))"]}

      {:_id 29
       :title "Get the Caps"
       :times-solved 0
       :description "Write a function which takes a string and returns a new string containing only the capital letters."
       :tags["easy" "strings"]
       :approved true
       :placeholder "(fn only-caps [s] s)"
       :tests ["(= (__ \"HeLlO, WoRlD!\") \"HLOWRD\")"
               "(empty? (__ \"nothing\"))"
               "(= (__ \"$#A(*&987Zf\") \"AZ\")"]}

      {:_id 30
       :title "Compress a Sequence"
       :times-solved 0
       :description "Write a function which removes consecutive duplicates from a sequence."
       :tags ["easy" "seqs"]
       :approved true
       :placeholder "(fn compress [s] s)"
       :tests ["(= (apply str (__ \"Leeeeeerrroyyy\")) \"Leroy\")"
               "(= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))"
               "(= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))"]}

      {:_id 31
       :title "Pack a Sequence"
       :times-solved 0
       :description "Write a function which packs consecutive duplicates into sub-lists."
       :tags ["easy" "seqs"]
       :approved true
       :placeholder "(fn pack-duplicates [s] s)"
       :tests ["(= (__ [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))"
               "(= (__ [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))"
               "(= (__ [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))"]}

      {:_id 32
       :title "Duplicate a Sequence"
       :times-solved 0
       :description "Write a function which duplicates each element of a sequence."
       :tags ["easy" "seqs"]
       :approved true
       :placeholder "(fn dup-seq [s] s)"
       :tests ["(= (__ [1 2 3]) '(1 1 2 2 3 3))"
               "(= (__ [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))"
               "(= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))"
               "(= (__ [44 33]) [44 44 33 33])"]}

      {:_id 33
       :title "Replicate a Sequence"
       :times-solved 0
       :description "Write a function which replicates each element of a sequence a variable number of times."
       :tags ["easy" "seqs"]
       :approved true
       :placeholder "(fn replicate [s n] s)"
       :tests ["(= (__ [1 2 3] 2) '(1 1 2 2 3 3))"
               "(= (__ [:a :b] 4) '(:a :a :a :a :b :b :b :b))"
               "(= (__ [4 5 6] 1) '(4 5 6))"
               "(= (__ [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))"
               "(= (__ [44 33] 2) [44 44 33 33])"]}

      {:_id 34
       :title "Implement range"
       :times-solved 0
       :restricted ["range"]
       :description "Write a function which creates a list of all integers in a given range."
       :tags ["easy" "seqs" "core-functions"]
       :approved true
       :placeholder "(fn range [start end] '())"
       :tests ["(= (__ 1 4) '(1 2 3))"
               "(= (__ -2 2) '(-2 -1 0 1))"
               "(= (__ 5 8) '(5 6 7))"]}
      ])

(defn problem-by-id
  [id]
  (first
   (filter #(= (:_id %) id)
	   problems)))



(defn empty-progress [] {:current 0})

(defn load-progress
  []
  (let
      [progress-json (.getItem
                     js/localStorage
                     "progress")]
    (if (nil? progress-json)
      (empty-progress)
      (js->clj (.parse js/JSON progress-json)))))


(defn save-progress
  [progress]
  (let
      [progress-json (js/JSON.stringify (clj->js progress))]
    (.setItem js/localStorage "progress" progress-json)))

(defn set-current
  [id]
  (fn [progress] (assoc progress "current" id)))

(defn set-problem-solution
  [id solution]
  (fn [progress]
    (assoc-in progress ["problems", (str id), "solution"] solution)))

(defn get-problem-solution
  [id progress]
  (get-in progress ["problems", (str id), "solution"]))

(defn get-current-problem
  [progress]
  (or (get progress "current") 1))

(def cur-progress (load-progress))

(defn update-progress!
  [modifier]
  (set! cur-progress (modifier cur-progress))
  (save-progress cur-progress))

(def codeElement (.getElementById js/document "code"))
(def titleElement (.getElementById js/document "title"))
(def descriptionElement (.getElementById js/document "description"))
(def runElement (.getElementById js/document "run"))
(def testsElement (.getElementById js/document "tests"))

(def cur-problem (first problems))

(defn render-tests
  [problem]
  (set! (.-innerHTML testsElement) "")
  (doseq [test (:tests problem)]
    (let
        [cur-test (.createElement js/document "pre")]
      (set! (.-innerHTML cur-test) test)
      (.appendChild testsElement cur-test))))

(defn render-problem
  [problem solution]
  (set! (.-innerHTML titleElement)
        (str (:_id problem) ": " (:title problem)))
  (set! (.-innerHTML descriptionElement) (:description problem))
  (set! (.-value codeElement)
        (or solution
            (:placeholder problem)))
  (render-tests problem))


(defn run-test
  [testcase cb]   
  (cljs.js/eval-str
   (cljs.js/empty-state)
   testcase
   nil
   {:eval cljs.js/js-eval :context :statement}
   cb))


(defn render-test-result
  [parentElement test]
  (fn [result]
    (let
        [element (.createElement js/document "pre")]
      (set! (.-innerHTML element)
            (cond
              (contains? result :error) (ex-message (ex-cause (:error result)))
              (true? (:value result)) (str "PASS: " test)
              (false? (:value result)) (str "FAIL: " test)
              :else (str "UNKNOWN" result)))
      (.appendChild testsElement element))))

(defn run-tests
  [problem solution]
  (set! (.-innerHTML testsElement) "")
  (doseq [test (:tests problem)]
    (let
        [test-element (.createElement js/document "li")
         testcase (clojure.string/replace test "__" solution)]
      (update-progress! (set-problem-solution (:_id problem) solution))
      (run-test testcase
                (render-test-result testsElement testcase)))))

(defn load-problem!
 [id]
 (let
     [problem  (problem-by-id id)
      solution (get-problem-solution id cur-progress)
      ]
   (if-not (nil? problem)
     (do (set! cur-problem problem)
         (render-problem problem solution)
         (update-progress! (set-current id)))
     nil)))

(defn prev-problem! []
  (let
      [prev-id (- (:_id cur-problem) 1)]
    (load-problem! prev-id)))


(defn next-problem! []
  (let
      [next-id (+ (:_id cur-problem) 1)]
    (load-problem! next-id)))


(defn add-listeners!
  [button code]
  (.addEventListener 
   button "click"
   (fn [evt]
     (run-tests cur-problem (.-value codeElement))
     (.preventDefault evt)))
  (.addEventListener 
   (.getElementById js/document "prev")
   "click"
   (fn [evt]
     (prev-problem!)
     (.preventDefault evt)))
  (.addEventListener 
   (.getElementById js/document "next")
   "click"
   (fn [evt]
     (next-problem!)
     (.preventDefault evt))))

(add-listeners! runElement codeElement)


(load-problem! (get-current-problem cur-progress))
