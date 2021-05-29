(ns foreclojurescript.core
  (:require [sci.core :as sci]))

(def problems
     [
      {:_id 1
       :title "Nothing but the Truth"
       :times-solved 0
       :description "This is a clojure form.  Enter a value which will make the form evaluate to true.  Don't over think it!  If you are confused, see the <a href='/directions'>getting started</a> page.  Hint: true is equal to true."
       :tags ["elementary"]
       :approved true
       :placeholder "(def answer false)"
       :tests [{:case "(= answer true)" :expected true}]}
      
      {:_id 2
       :title "Simple Math"
       :times-solved 0
       :description "If you are not familiar with <a href='http://en.wikipedia.org/wiki/Polish_notation'>polish notation</a>, simple arithmetic might seem confusing."
       :tags ["elementary"]
       :approved true
       :placeholder "(def answer 42)"
       :tests [{:case "(= (- 10 (* 2 3)) answer)" :expected true}]}

      {:_id 3
       :title "Intro to Strings"
       :times-solved 0
       :description "Clojure strings are Java strings.  This means that you can use any of the Java string methods on Clojure strings."
       :tags["elementary"]
       :approved true
       :placeholder "(def answer \"\")"
       :tests ["(= answer (.toUpperCase \"hello world\"))"]}

      {:_id 4
       :title "Intro to Lists"
       :times-solved 0
       :description "Lists can be constructed with either a function or a quoted form."
       :tags["elementary"]
       :approved true
       :placeholder "(def answer (list ))"
       :tests [{:case"(= answer '(:a :b :c))" :expected true}]}

      {:_id 5
       :title "Lists: conj"
       :times-solved 0
       :description "When operating on a list, the conj function will return a new list with one or more items \"added\" to the front."
       :tags["elementary"]
       :approved true
       :placeholder "(def answer '(2 3 4))"
       :tests [{:case "(= (conj '(2 3 4) 1) answer)" :expected true}
               {:case "(= (conj '(3 4) 2 1) answer)" :expected true}]}


      {:_id 6
       :title "Intro to Vectors"
       :times-solved 0
       :description "Vectors can be constructed several ways.  You can compare them with lists."
       :tags["elementary"]
       :approved true
       :placeholder "(def my-vector [])"
       :tests [{:case "(= my-vector (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))"
                :expected true}]}

      {:_id 7
       :title "Vectors: conj"
       :times-solved 0
       :description "When operating on a Vector, the conj function will return a new vector with one or more items \"added\" to the end."
       :tags["elementary"]
       :approved true
       :placeholder "(def answer [])"
       :tests [{:case "(= answer (conj [1 2 3] 4))" :expected true}
               {:case "(= answer (conj [1 2] 3 4))" :expected true}]}
      {:_id 8
       :title "Intro to Sets"
       :times-solved 0
       :description "Sets are collections of unique values."
       :tags["elementary"]
       :approved true
       :placeholder "(def answer (set '()))"
       :tests [{:case "(= answer (set '(:a :a :b :c :c :c :c :d :d)))" :expected true}
               {:case "(= answer (clojure.set/union #{:a :b :c} #{:b :c :d}))" :expected true}]}

      {:_id 9
       :title "Sets: conj"
       :times-solved 0
       :description "When operating on a set, the conj function returns a new set with one or more keys \"added\"."
       :tags["elementary"]
       :approved true
       :placeholder "(def answer 2)"
       :tests [{:case "(= #{1 2 3 4} (conj #{1 4 3} answer))" :expected true}]}

      {:_id 10
       :title "Intro to Maps"
       :times-solved 0
       :description "Maps store key-value pairs.  Both maps and keywords can be used as lookup functions. Commas can be used to make maps more readable, but they are not required."
       :tags["elementary"]
       :approved true
       :placeholder "(def answer 40)"
       :tests [{:case "(= answer ((hash-map :a 10, :b 20, :c 30) :b))" :expected true}
               {:case "(= answer (:b {:a 10, :b 20, :c 30}))"          :expected true}]}

      {:_id 11
       :title "Maps: conj"
       :times-solved 0
       :description "When operating on a map, the conj function returns a new map with one or more key-value pairs \"added\"."
       :tags["elementary"]
       :approved true
       :placeholder "(def answer [])"
       :tests [{:case "(= {:a 1, :b 2, :c 3} (conj {:a 1} answer [:c 3]))" :expected true}]}

       {:_id 12
        :title "Intro to Sequences"
        :times-solved 0
        :description "All Clojure collections support sequencing.  You can operate on sequences with functions like first, second, and last."
        :tags["elementary"]
        :approved true
        :placeholder "(def answer 0)"
        :tests [{:case "(= answer (first '(3 2 1)))"    :expected true}
                {:case "(= answer (second [2 3 4]))"    :expected true}
                {:case "(= answer (last (list 1 2 3)))" :expected true}]}

      {:_id 13
       :title "Sequences: rest"
       :times-solved 0
       :description "The rest function will return all the items of a sequence except the first."
       :tags["elementary"]
       :approved true
       :placeholder "(def answer [10 20 30 40])"
       :tests [{:case "(= answer (rest [10 20 30 40]))" :expected true}]}

      {:_id 14
       :title "Intro to Functions"
       :times-solved 0
       :description "Clojure has many different ways to create functions."
       :tags["elementary"]
       :approved true
       :placeholder "(def answer 0)"
       :tests [{:case "(= answer ((fn add-five [x] (+ x 5)) 3))" :expected true}
               {:case "(= answer ((fn [x] (+ x 5)) 3))"          :expected true}
               {:case "(= answer (#(+ % 5) 3))"                  :expected true}
               {:case "(= answer ((partial + 5) 3))"             :expected true}]}

      {:_id 15
       :title "Double Down"
       :times-solved 0
       :description "Write a function which doubles a number."
       :tags ["elementary"]
       :approved true
       :palceholder "(defn double-down [x] x)" 
       :tests [{:case "(double-down 2)"  :expected 4}
               {:case "(double-down 3)"  :expected 6}
               {:case "(double-down 11)" :expected 22}
               {:case "(double-down 7)"  :expected 14}]}

      {:_id 16
       :title "Hello World"
       :times-solved 0
       :description "Write a function which returns a personalized greeting."
       :tags ["elementary"]
       :approved true
       :placeholder "(defn greet [name] \"Hello\")"
       :tests [{:case "(greet \"Dave\")" :expected "Hello, Dave!"}
               {:case "(greet \"Jenn\")" :expected "Hello, Jenn!"}
               {:case "(greet \"Rhea\")" :expected "Hello, Rhea!"}]}
      
      {:_id 17
       :title "Sequences: map"
       :times-solved 0
       :description "The map function takes two arguments: a function (f) and a sequence (s).  Map returns a new sequence consisting of the result of applying f to each item of s.  Do not confuse the map function with the map data structure."
       :tags["elementary"]
       :approved true
       :placeholder "(def answer '(1 2 3))"
       :tests [{:case "(= answer (map #(+ % 5) '(1 2 3)))" :expected true}]}

      {:_id 18
       :title "Sequences: filter"
       :times-solved 0
       :description "The filter function takes two arguments: a predicate function (f) and a sequence (s).  Filter returns a new sequence consisting of all the items of s for which (f item) returns true."
       :tags["elementary"]
       :approved true
       :placeholder "(def answer '(3 4 5 6 7))"
       :tests [{:case "(= answer (filter #(> % 5) '(3 4 5 6 7)))" :expected true}]}

      {:_id 19
       :title "Last Element"
       :times-solved 0
       :restricted ["last"]
       :description "Write a function which returns the last element in a sequence."
       :tags ["easy" "seqs" "core-functions"]
       :approved true
       :placeholder "(defn lasto [l] 0)"
       :tests [{:case "(lasto [1 2 3 4 5])" :expected 5}
               {:case "(lasto '(5 4 3))" :expected 3}
               {:case "(lasto [\"b\" \"c\" \"d\"])" :expected "d"}]}
      
      {:_id 20
       :title "Penultimate Element"
       :times-solved 0
       :description "Write a function which returns the second to last element from a sequence."
       :tags["easy" "seqs"]
       :approved true
       :placeholder "(defn penultimate [x] 0)"
       :tests [{:case "(penultimate (list 1 2 3 4 5))" :expected 4}
               {:case "(penultimate [\"a\" \"b\" \"c\"])" :expected "b"}
               {:case "(penultimate [[1 2] [3 4]])" :expected [1, 2]}]}

      {:_id 21
       :title "Nth Element"
       :times-solved 0
       :restricted ["nth"]
       :description "Write a function which returns the Nth element from a sequence."
       :tags["easy" "seqs" "core-functions"]
       :approved true
       :placeholder "(defn nth [coll n] 0)"
       :tests [{:case "(nth '(4 5 6 7) 2)" :expected 6}
               {:case "(nth [:a :b :c] 0)" :expected :a}
               {:case "(nth [1 2 3 4] 1)"  :expected 2}
               {:case "(nth '([1 2] [3 4] [5 6]) 2)" :expected [5 6]}]}
      
      {:_id 22
       :title "Count a Sequence"
       :times-solved 0
       :restricted ["count"]
       :description "Write a function which returns the total number of elements in a sequence."
       :tags["easy" "seqs" "core-functions"]
       :approved true
       :placeholder "(defn cnt [x] 0)"
       :tests [{:case "(cnt '(1 2 3 3 1))" :expected 5}
               {:case "(cnt \"Hello World\")" :expected 11}
               {:case "(cnt [[1 2] [3 4] [5 6]])" :expected 3}
               {:case "(cnt '(13))" :expected 1}
               {:case "(cnt '(:a :b :c))" :expected 3}]}

      {:_id 23
       :title "Reverse a Sequence"
       :times-solved 0
       :restricted ["reverse"]
       :description "Write a function which reverses a sequence."
       :tags["easy" "seqs" "core-functions"]
       :approved true
       :placeholder "(defn reverse [s] s)"
       :tests [{:case "(reverse [1 2 3 4 5])" :expected [5 4 3 2 1]}
               {:case "(reverse (sorted-set 5 7 2 7))" :expected '(7 5 2)}
               {:case "(reverse [[1 2][3 4][5 6]])" :expected [[5 6][3 4][1 2]]}]}

      {:_id 24
       :title "Sum It All Up"
       :times-solved 0
       :description "Write a function which returns the sum of a sequence of numbers."
       :tags ["easy" "seqs"]
       :approved true
       :placeholder "(defn sum [s] 0)"
       :tests [{:case "(sum [1 2 3])" :expected 6}
               {:case "(sum (list 0 -2 5 5))" :expected 8}
               {:case "(sum #{4 2 1})" :expected 7}
               {:case "(sum '(0 0 -1))" :expected -1}
               {:case "(sum '(1 10 3))" :expected 14}]}

      {:_id 25
       :title "Find the odd numbers"
       :times-solved 0
       :description "Write a function which returns only the odd numbers from a sequence."
       :tags["easy" "seqs"]
       :approved true
       :placeholder "(defn only-odds [s] s)"
       :tests [{:case "(only-odds #{1 2 3 4 5})" :expected '(1 3 5)}
               {:case "(only-odds [4 2 1 6])"    :expected '(1)}
               {:case "(only-odds [2 2 4 6])"    :expected '()}
               {:case "(only-odds [1 1 1 3])"    :expected '(1 1 1 3)}]}

      {:_id 26
       :title "Fibonacci Sequence"
       :times-solved 0
       :description "Write a function which returns the first X fibonacci numbers."
       :tags["easy" "Fibonacci" "seqs"]
       :approved true
       :placeholder "(defn fib-seq [n] '(1))"
       :tests [{:case "(fib-seq 3)" :expected '(1 1 2)}
               {:case "(fib-seq 6)" :expected '(1 1 2 3 5 8)}
               {:case "(fib-seq 8)" :expected '(1 1 2 3 5 8 13 21)}]}

      {:_id 27
       :title "Palindrome Detector"
       :times-solved 0
       :description "Write a function which returns true if the given sequence is a palindrome.<br/><br>
                Hint: \"racecar\" does not equal '(\\r \\a \\c \\e \\c \\a \\r)"
       :tags["easy" "seqs"]
       :approved true
       :placeholder "(defn palindrome? [s] nil)"
       :tests [{:case "(palindrome? '(1 2 3 4 5))" :expected false}
               {:case "(palindrome? \"racecar\")" :expected true}
               {:case "(palindrome? [:foo :bar :foo])" :expected true}
               {:case "(palindrome? '(1 1 3 3 1 1))" :expected true}
               {:case "(palindrome? '(:a :b :c))":expected false}]}

      {:_id 28
       :title "Flatten a Sequence"
       :times-solved 0
       :restricted ["flatten"]
       :description "Write a function which flattens a sequence."

       :tags["easy" "seqs" "core-functions"]
       :approved true
       :placeholder "(defn flatten [s] s)"
       :tests [{:case "(flatten '((1 2) 3 [4 [5 6]]))" :expected '(1 2 3 4 5 6)}
               {:case "(flatten [\"a\" [\"b\"] \"c\"])" :expected '("a" "b" "c")}
               {:case "(flatten '((((:a)))))" :expected '(:a)}]}

      {:_id 29
       :title "Get the Caps"
       :times-solved 0
       :description "Write a function which takes a string and returns a new string containing only the capital letters."
       :tags["easy" "strings"]
       :approved true
       :placeholder "(defn only-caps [s] s)"
       :tests [{:case "(only-caps \"HeLlO, WoRlD!\")" :expected "HLOWRD"}
               {:case "(only-caps \"nothing\")" :expected ""}
               {:case "(only-caps \"$#A(*&987Zf\")" :expected "AZ"}]}

      {:_id 30
       :title "Compress a Sequence"
       :times-solved 0
       :description "Write a function which removes consecutive duplicates from a sequence."
       :tags ["easy" "seqs"]
       :approved true
       :placeholder "(defn compress [s] s)"
       :tests [{:case "(apply str (compress \"Leeeeeerrroyyy\"))" :expected "Leroy"}
               {:case "(compress [1 1 2 3 3 2 2 3])" :expected '(1 2 3 2 3)}
               {:case "(compress [[1 2] [1 2] [3 4] [1 2]])" :expected '([1 2] [3 4] [1 2])}]}

      {:_id 31
       :title "Pack a Sequence"
       :times-solved 0
       :description "Write a function which packs consecutive duplicates into sub-lists."
       :tags ["easy" "seqs"]
       :approved true
       :placeholder "(defn pack-duplicates [s] [])"
       :tests [{:case     "(pack-duplicates [1 1 2 1 1 1 3 3])"
                :expected '((1 1) (2) (1 1 1) (3 3))}
               {:case     "(pack-duplicates [:a :a :b :b :c])"
                :expected '((:a :a) (:b :b) (:c))}
               {:case "(pack-duplicates [[1 2] [1 2] [3 4]])"
                :expected '(([1 2] [1 2]) ([3 4]))}]}

      {:_id 32
       :title "Duplicate a Sequence"
       :times-solved 0
       :description "Write a function which duplicates each element of a sequence."
       :tags ["easy" "seqs"]
       :approved true
       :placeholder "(defn dup-seq [s] s)"
       :tests [{:case "(dup-seq [1 2 3])" :expected '(1 1 2 2 3 3)}
               {:case "(dup-seq [:a :a :b :b])" :expected '(:a :a :a :a :b :b :b :b)}
               {:case "(dup-seq[[1 2] [3 4]])" :expected '([1 2] [1 2] [3 4] [3 4])}
               {:case "(dup-seq [44 33])" :expected [44 44 33 33]}]}

      {:_id 33
       :title "Replicate a Sequence"
       :times-solved 0
       :description "Write a function which replicates each element of a sequence a variable number of times."
       :tags ["easy" "seqs"]
       :approved true
       :placeholder "(defn replicate [s n] [])"
       :tests [{:case "(replicate [1 2 3] 2)" :expected '(1 1 2 2 3 3)}
               {:case "(replicate [:a :b] 4)" :expected '(:a :a :a :a :b :b :b :b)}
               {:case "(replicate [4 5 6] 1)" :expected '(4 5 6)}
               {:case "(replicate [[1 2] [3 4]] 2)" :expected '([1 2] [1 2] [3 4] [3 4])}
               {:case "(replicate [44 33] 2)" :expected [44 44 33 33]}]}

      {:_id 34
       :title "Implement range"
       :times-solved 0
       :restricted ["range"]
       :description "Write a function which creates a list of all integers in a given range."
       :tags ["easy" "seqs" "core-functions"]
       :approved true
       :placeholder "(defn range [start end] '())"
       :tests [{:case "(range 1 4)"  :expected '(1 2 3)}
               {:case "(range -2 2)" :expected '(-2 -1 0 1)}
               {:case "(range 5 8)"  :expected '(5 6 7)}]}
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
      (set! (.-innerHTML cur-test)
            (str "(= " (:case test)
                 " " (:expected test) ")"))
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

(defn format-error-test-case
  [result]
  (str (:case (:test result)) ", Error: " (ex-message (:error result))
       "(line:" (:line (ex-data (:error result))) ","
       "column:" (:column (ex-data (:error result))) ")"))

(defn format-fail-case
  [result]
  (str "FAIL: " (:case (:test result)) "<br/>"
       "expected <b>" (:expected (:test result)) "</b><br/>"
       "but got <b>" (:result result) "</b>"))

(defn test-success?
  [result]
  (= (:result result)
     (:expected (:test result))))

(defn format-test-case
  [result]
  (if (test-success? result)
      (str "PASS: (= " (:case (:test result))
           " " (:expected (:test result)) ")")
      (format-fail-case result)))



(defn render-test-result
  [parentElement test result]
  (let
      [element (.createElement js/document "li")]
    (set! (.-innerHTML element)
          (str "<code>"
               (cond
                 (contains? result :error) (format-error-test-case result)
                 (contains? result :result) (format-test-case result)
                 :else result)
               "</code>"))
    (.appendChild testsElement element)))

(defn run-test
  [testcase solution problem]
  (try
    {:result (sci/eval-string
             (str "(require '[solution]) (in-ns 'solution)"
                  testcase)
             {:deny (map keyword (:restricted problem))
              :load-fn (constantly
                        {:file "solution.clj"
                         :source (str "(ns solution)" solution)})})}
    (catch :default e {:error e})))

(defn run-tests
  [problem solution]
  (map (fn [test]
         (merge {:test test}
                (run-test (:case test) solution problem)))
         (:tests problem)))

(defn run
  [problem solution]
  (set! (.-innerHTML testsElement) "")
  (let [test-results (run-tests problem solution)]
    (doseq [result test-results]
      (let
          [test-element (.createElement js/document "li")]
        (update-progress! (set-problem-solution (:_id problem) solution))
        (render-test-result testsElement (:test result) result)))))

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
     (run cur-problem (.-value codeElement))
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
