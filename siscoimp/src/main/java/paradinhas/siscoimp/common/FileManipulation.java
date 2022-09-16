/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradinhas.siscoimp.common;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author rodri
 */
public class FileManipulation {

    private static void fileFolderExists(String folder) {
        try {
            String pathRoot = "files";
            Path folderPath = Paths.get(pathRoot);
            if (!Files.exists(folderPath)) {
                Files.createDirectory(folderPath);
            }
            pathRoot = pathRoot + "/" + folder;
            folderPath = Paths.get(pathRoot);
            if (!Files.exists(folderPath)) {
                Files.createDirectory(folderPath);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static String saveFile(File file, String folder) throws IOException {
        fileFolderExists(folder);
        Path copie = Paths.get("files/" + folder + "/" + file.getName());
        Files.copy(Paths.get(file.getAbsolutePath()), copie, StandardCopyOption.REPLACE_EXISTING);

        return copie.toAbsolutePath().toString();
    }
}
