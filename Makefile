build: 
	javac -d ./bin ./*.java

run:
	java -cp ./bin Solution

clean:
	rm -rf ./bin