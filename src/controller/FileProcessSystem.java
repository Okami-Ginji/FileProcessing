package controller;

import repository.FileProcessRepository;
import view.Menu;



public class FileProcessSystem extends Menu<String>{
    static String[] mc = {"Check Path", "Get file name with type java","Get file with size greater than input","Write more content to file","Read file and count characters", "Exit"};
    FileProcessRepository program;
    
    public FileProcessSystem() {
        super("\tFile Processing", mc);
        program = new FileProcessRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                program.checkPath();
                break;
            case 2:
                program.getAllFileNameJavaInDirectory();
                break;
            case 3:
                program.getFileWithSizeGreaterThanInput();
                break;
            case 4:
                program.appendContentToFile();
                break;
            case 5:
                program.countCharacter();
                break;
            case 6:
                System.exit(0);
        }
    }
    
}