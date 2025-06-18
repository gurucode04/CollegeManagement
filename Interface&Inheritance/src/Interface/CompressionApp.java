package Interface;
import java.util.*;

interface Compressor {
    void compress(String fileName);
    double getCompressionRatio();
}

// ZIP compressor implementation
class ZipCompressor implements Compressor {
    private double compressionRatio = 1.8;

    public void compress(String fileName) {
        System.out.println("Compressing " + fileName + " using ZIP...");
    }

    public double getCompressionRatio() {
        return compressionRatio;
    }
}

// RAR compressor implementation
class RarCompressor implements Compressor {
    private double compressionRatio = 2.2;

    public void compress(String fileName) {
        System.out.println("Compressing " + fileName + " using RAR...");
    }

    public double getCompressionRatio() {
        return compressionRatio;
    }
}
public class CompressionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Input: Choose compression type
	        System.out.print("Choose compression type (ZIP/RAR): ");
	        String type = scanner.nextLine().trim();

	        // Input: File name
	        System.out.print("File to compress: ");
	        String fileName = scanner.nextLine().trim();

	        Compressor compressor;

	        // Choose appropriate compressor
	        if (type.equalsIgnoreCase("ZIP")) {
	            compressor = new ZipCompressor();
	        } else if (type.equalsIgnoreCase("RAR")) {
	            compressor = new RarCompressor();
	        } else {
	            System.out.println("Invalid compression type.");
	            scanner.close();
	            return;
	        }

	        // Compress and show result
	        compressor.compress(fileName);
	        System.out.println("Compression Ratio: " + compressor.getCompressionRatio());

	        scanner.close();

	}

}
