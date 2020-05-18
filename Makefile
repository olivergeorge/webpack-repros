
clean:
	rm -rf out storybook-static

setup:
	yarn

simple:
	clj -m cljs.main -co build.edn -O simple -v -c

advanced:
	clj -m cljs.main -co build.edn -O advanced -v -c

storybook: clean setup simple
	yarn storybook

build-storybook: clean setup advanced
	yarn build-storybook
