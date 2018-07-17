package file;

import java.io.File;

public class FilesOfFolder {

	public FilesOfFolder() {}

	public File[] getFilesOfFolder(String path) {
		File folder = new File(path);
		return folder.listFiles();
	}

}
