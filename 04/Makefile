MAINCLASS=ForestFireSimulation
CLASSES = \
		  Tree.class \
		  Ground.class \
		  Sector.class \
		  ForestFire.class \
		  ForestFireSimulation.class \

%.class: %.java
	javac $<

default: $(CLASSES)

clean:
	rm -rf *.class

run: $(CLASSES)
	java $(MAINCLASS)
