(ns clojure-quest.core
	(:gen-class))

(defn printfoo 
	"Print 'Hello World!' and execute the args passed" 
	([x] (println "Hello World!") x) 
	([x & xs] (println "Hello World!") x xs))

(defn -main [& args] (clojure.main/repl :eval printfoo))
