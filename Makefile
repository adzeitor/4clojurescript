.PHONY: run
run:
	clj --main cljs.main --compile foreclojurescript.core --repl

.PHONE: gh_pages
gh_pages:
	git checkout gh-pages
	git reset --soft master
	@echo "COMPILING..."
	clj -m cljs.main --output-to main.js --optimizations advanced -c foreclojurescript.core
	git add main.js
	git commit -m 'Generate gh-pages'
	git push --force
	git checkout -
	@echo "======================================================="
	@echo "DEPLOYED TO: https://adzeitor.github.io/4clojurescript/"
