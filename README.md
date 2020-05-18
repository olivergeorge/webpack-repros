

# To test

```
yarn 
clj -m cljs.main -w src -co build.edn -O simple -v -c
yarn storybook
```

# Notes

## -O none build

Two issues/insights here.  

Storybook can serve up static assets so that `index.js` will resolve the various 'out/...' paths.  Update the package.json file to include '-s .'.

```
    "storybook": "start-storybook -s . -p 6006",
```

Because index.js fires off GET requests the core ns isn't immediately available so there is a race in the code.


