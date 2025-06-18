package CollectionTree;

class FileBackup { 
    String name; 
    FileBackup left, right; 
 
    FileBackup(String name) { 
        this.name = name; 
    } 
}

public class FileRestoreSystem {
	 public static void restore(FileBackup node) { 
	        if (node == null) return; 
	        restore(node.left);   // Sub-files/folders 
	        restore(node.right); 
	        System.out.println("Restoring: " + node.name); // Parent last 
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileBackup root = new FileBackup("Root Folder"); 
        root.left = new FileBackup("Documents"); 
        root.right = new FileBackup("Photos"); 
        root.left.left = new FileBackup("Resume.docx"); 
        root.left.right = new FileBackup("Notes.txt"); 
 
        System.out.println("Restoration Order (Postorder):"); 
        restore(root);
		

	}

}
