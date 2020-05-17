
clean:
	rm -rf out

setup:
	yarn

repl:
	clj -m cljs.main -co build.edn -v -c -r

