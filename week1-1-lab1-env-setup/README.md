# Lab 1 - Setup and Java 101

## Java Development Environment in Windows - Step by Step

1. OpenJDK 11 (1.11)
    - Download from [RedHat](https://developers.redhat.com/products/openjdk/download), choose a plausable version.
    - Unzip OpenJDK, eg. `C:\Program Files\Java\`.
    - Open __Environment Variables__
        - Add system variable **JAVA_HOME**, value is the path of unzipped folder, eg. `C:\Program Files\Java\jdk-11.0.1`
        - Edit system variable **Path**, add `%JAVA_HOME%\bin`, now you can run `java -version` in `cmd` or `PowerShell`

1. IntelliJ
    - Download from [Official Website](https://www.jetbrains.com/idea/download/)
    - Activate withstudents account or buy :)

1. Git: download, install and setup keypairs.

## Java Compilation & Development

1. Exercises from [the H61B textbook](https://joshhug.gitbooks.io/hug61b/content/chap1/chap11.html)
    - 1.1.1
        - <details><summary>HelloWorld.java</summary>
        
            ``` java
            public class HelloWorld {
                public static void main(String[] args) {
                    System.out.println("\nHello VScode Container!\n");
                }
            }
            ```

        - Compile: `javac HelloWorld.java`

        - Interprete: `java HelloWorld`
        
        </details>
        
    - 1.1.2
        - <details><summary>HelloWorld.java</summary>
        
            ``` java
            public class HelloNumbers {
                public static void main(String[] args) {
                    int x = 0;
                    int n = 1;
                    while (x < 46) {
                        System.out.print(x + " ");
                        x = x + n;
                        n = n + 1;
                    }
                    System.out.println();
                }
            }
            ```
        
        </details>