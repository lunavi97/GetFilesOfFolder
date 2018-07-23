package file;

import static org.junit.Assert.assertArrayEquals;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import file.FilesOfFolder;

public class FilesOfFolderTests {

  FilesOfFolder fof;
  File folder;
  File[] listOfFiles;
  final String PATH = "Folder";
  final int CANT = 4;

  @Before
  public void setUp() throws IOException {
    fof = new FilesOfFolder();
    listOfFiles = new File[CANT];

    folder = new File(PATH);
    folder.mkdir();

    for (int i = 1; i <= CANT; i++) {
      File file = new File(PATH + File.separator + "file" + i + ".txt");
      file.createNewFile();
      listOfFiles[i - 1] = file;
    }
  }

  @Test
  public void test() {
    assertArrayEquals(listOfFiles, fof.getFilesOfFolder(PATH));
  }

}
