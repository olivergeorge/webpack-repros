
clean:
	rm -rf out node_modules

setup:
	yarn

repl:
	clj -M -m cljs.main -co build.edn -v -c -r

build:
	clj -M -m cljs.main -co build.edn -v -c

release:
	clj -M -m cljs.main -co build.edn -O advanced -v -c -s

