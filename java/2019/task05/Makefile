packageName = $(notdir $(CURDIR:%/=%)).tar.gz
sourcePath = br/com/ap220191/ta02/rodrigo_martins_201703695/lista05/ex1

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
