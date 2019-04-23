packageName = $(notdir $(CURDIR:%/=%)).tar.gz
task = 06
sourcePath = br/com/ap220191/ta02/rodrigo_martins_201703695/lista$(task)/ex*

all:
	javac *.java
clean:
	rm *.class
	rm $(sourcePath)/*.class
pack:
	@if [ -f $(packageName) ]; then\
		rm $(packageName);\
	fi
	tar -czf $(packageName) Makefile $(sourcePath)/*.java *.java
