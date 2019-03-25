packageName = $(notdir $(CURDIR:%/=%)).tar.gz

all:
	javac *.java
clean:
	rm *.class
pack:
	@if [ -f $(packageName) ]; then\
		rm $(packageName);\
	fi
	tar -czf $(packageName) Makefile *.java
