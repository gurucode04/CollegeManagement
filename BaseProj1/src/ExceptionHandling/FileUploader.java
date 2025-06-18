package ExceptionHandling;
import java.io.*;
public class FileUploader {
	
	public void uploadFile(String filePath) throws IOException {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filePath));
            System.out.println("Uploading file content: " + reader.readLine());
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            throw e;
        } finally {
            if (reader != null) {
                reader.close(); // close resource
            }
        }

        System.out.println("Upload attempt finished.");
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
FileUploader uploader = new FileUploader();
try {
	uploader.uploadFile("missing_file.txt");
}catch(IOException e) {
	System.out.println("Error uploading: "+e.getMessage());
}

	}

}
