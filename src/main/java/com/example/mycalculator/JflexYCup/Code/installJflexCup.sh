clear
rm -f Lexema.java
rm -f parser.java
rm -f sym.java
java -jar jflex-full-1.9.1.jar code.jflex
java -jar java-cup-11b.jar code.cup
