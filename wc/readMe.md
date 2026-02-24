# CCWC — Custom Word Count Tool (Java)

A simple **Java implementation of the Unix `wc` (word count)** command built as part of coding challenges.

This project reads a file from the command line and calculates:

* Number of bytes
* Number of lines
* Number of words
* Number of characters

It mimics the behaviour of the Linux `wc` utility using Java file handling APIs.

---

## 🚀 Features

* Command‑line based file processing
* Supports multiple flags similar to Unix `wc`
* Efficient file reading using `BufferedReader`
* Clean separation of counting logic into reusable methods
* Handles large files using streaming (no full file load in memory)

---

## 📂 Project Structure

```
wc/
 └── ccwc.java   # Main implementation
```

---

## 🛠️ Technologies Used

* Java
* NIO File API (`Path`, `Files`, `Paths`)
* BufferedReader for efficient reading

---

## ▶️ How to Compile and Run

### 1️⃣ Compile

```bash
javac wc/ccwc.java
```

### 2️⃣ Run

```bash
java wc.ccwc <option> <file-path>
```

or

```bash
java wc.ccwc <file-path>
```

---

## ⚙️ Supported Commands

| Option    | Description      |
| --------- | ---------------- |
| `-b`      | Count bytes      |
| `-l`      | Count lines      |
| `-w`      | Count words      |
| `-c`      | Count characters |
| (no flag) | Shows all counts |

---

## 📌 Example Usage

### Count words

```bash
java wc.ccwc -w sample.txt
```

Output:

```
Number of words: 120 sample.txt
```

### Show all statistics

```bash
java wc.ccwc sample.txt
```

Output:

```
Number of bytes: ...
Number of lines: ...
Number of words: ...
Number of characters: ...
```

---

## 🧠 Implementation Overview

The program works by:

1. Reading command‑line arguments.
2. Detecting whether a flag is provided.
3. Selecting the required operation using a `switch` statement.
4. Processing the file using dedicated helper methods:

   * `getBytes()` → Uses `Files.size()`
   * `getLines()` → Counts lines using `BufferedReader`
   * `getWords()` → Splits text using whitespace regex
   * `getCharacters()` → Reads characters sequentially

---

## 📈 Learning Goals

This project helped practice:

* Java file handling
* Command‑line argument parsing
* String processing
* Writing modular utility functions
* Recreating real system tools in Java

---

## 🔮 Possible Improvements

* Support multiple files like real `wc`
* Add error handling for invalid paths
* Combine counts in a single file pass (performance optimization)
* Add GUI version

---

## 👨‍💻 Author

**Abhinay Anand**
B.Tech CSE Student | Learning Systems Programming & Software Development

---

⭐ If you found this project useful, feel free to star the repository!
