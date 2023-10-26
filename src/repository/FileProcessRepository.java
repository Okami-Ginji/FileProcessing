/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;
import dataacess.FileProcessDAO;

/**
 *
 * @author Administrator
 */
public class FileProcessRepository implements IFileProcessRepository{

    @Override
    public void checkPath() {
        FileProcessDAO.Instance().checkPath();
    }

    @Override
    public void getAllFileNameJavaInDirectory() {
        FileProcessDAO.Instance().getAllFileNameJavaInDirectory();
    }

    @Override
    public void getFileWithSizeGreaterThanInput() {
        FileProcessDAO.Instance().getFileWithSizeGreaterThanInput();
    }

    @Override
    public void appendContentToFile() {
        FileProcessDAO.Instance().appendContentToFile();
    }

    @Override
    public void countCharacter() {
        FileProcessDAO.Instance().countCharacter();
    }
    
}
