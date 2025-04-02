import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class SearchThread implements Runnable {
    private File file;
    private String searchTerm;

    public SearchThread(File file, String searchTerm) {
        this.file = file;
        this.searchTerm = searchTerm;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int lineNumber = 0;
            boolean found = false;

            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (line.trim().equalsIgnoreCase(searchTerm.trim())) {
                    System.out.println("Found in: " + file.getName() + " at line " + lineNumber + ": " + line);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No match found in " + file.getName());
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + file.getName());
        }
    }
}

public class slip14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept search term
        System.out.print("Enter the string to search: ");
        String searchTerm = scanner.nextLine();

        // Get the current directory and list all text files
        File currentDirectory = new File("C:\\Practicals\\java-Prcatical\\txt-files");
        if (!currentDirectory.exists() || !currentDirectory.isDirectory()) {
            System.out.println("The specified directory does not exist or is not a directory.");
            scanner.close();
            return;
        }

        File[] textFiles = currentDirectory.listFiles((dir, name) -> name.endsWith(".txt"));

        if (textFiles == null || textFiles.length == 0) {
            System.out.println("No text files found in the current directory.");
            scanner.close();
            return;
        }

        // Create a thread pool for efficient execution
        ExecutorService executor = Executors.newFixedThreadPool(5); // Limit to 5 threads at a time

        System.out.println("\nSearching for \"" + searchTerm + "\" in text files...\n");

        // Create and start a thread for each file
        for (File file : textFiles) {
            executor.execute(new SearchThread(file, searchTerm));
        }

        executor.shutdown(); // Gracefully shut down the executor

        try {
            // Wait for all threads to finish
            if (!executor.awaitTermination(1, TimeUnit.MINUTES)) {
                System.out.println("Some tasks did not finish within the timeout.");
            }
        } catch (InterruptedException e) {
            System.out.println("Thread execution was interrupted.");
        }

        scanner.close(); // Close the scanner
    }
}