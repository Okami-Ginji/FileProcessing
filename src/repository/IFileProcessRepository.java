/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;



public interface IFileProcessRepository {
    void checkPath();
    void getAllFileNameJavaInDirectory();
    void getFileWithSizeGreaterThanInput();
    void appendContentToFile();
    void countCharacter();
}
