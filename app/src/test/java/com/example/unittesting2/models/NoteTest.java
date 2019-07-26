package com.example.unittesting2.models;

import com.example.unittesting2.model.Note;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class NoteTest {
    public static final String TIMESTAMP_1 = "05-2019";
    public static final String TIMESTAMP_2 = "04-2019";

    /*
    Compare two equal Notes
     */
    @Test
    public void isNotesEqual_identicalProperties_returnTrue() throws Exception {
        //Arrange
        Note note1 = new Note("Note#1", "This is note #1", TIMESTAMP_1);
        note1.setId(1);
        Note note2 = new Note("Note#1", "This is note #1", TIMESTAMP_1);
        note2.setId(1);
        //Act
        //Assert

        Assertions.assertEquals(note1, note2);
        System.out.println("The notes are equal!");
    }
    /*
    Compare notes with 2 different ids
     */

    @Test
    public void isNotesEqual_differentId_returnFalse() throws Exception {
        Note note1 = new Note("Note#1", "This is note #1", TIMESTAMP_1);
        note1.setId(1);
        Note note2 = new Note("Note#1", "This is note #1", TIMESTAMP_1);
        note2.setId(2);
        //Act
        //Assert

        Assertions.assertNotEquals(note1, note2);
        System.out.println("The notes are not equal!");
    }

    /*
    Write a Test case for comparing notes with different timestaml
     */

    @Test
    public void isNotesEqual_differentTimestamp_returnTrue() throws Exception {
        //Arrange
        Note note1 = new Note("Note#1", "This is note #1", TIMESTAMP_1);
        note1.setId(1);
        Note note2 = new Note("Note#1", "This is note #1", TIMESTAMP_1);
        note2.setId(1);
        //Act
        //Assert

        Assertions.assertEquals(note1, note2);
        System.out.println("The notes are equal!");
    }
    /*
    Compare two Notes with different Titles
     */
    @Test
    public void isNotesEqual_differentTitle_returnFalse() throws Exception {
        //Arrange
        Note note1 = new Note("Note#1", "This is note #1", TIMESTAMP_1);
        note1.setId(1);
        Note note2 = new Note("Note#2", "This is note #1", TIMESTAMP_1);
        note2.setId(1);
        //Act
        //Assert

        Assertions.assertNotEquals(note1, note2);
        System.out.println("The notes are not equal, They have different titles!");
    }

    /*
    Compare two notes with different content

     */
    @Test
    public void isNotesEqual_differentContent_returnFalse() throws Exception {
        //Arrange
        Note note1 = new Note("Note#1", "This is note #1", TIMESTAMP_1);
        note1.setId(1);
        Note note2 = new Note("Note#2", "This is note #1", TIMESTAMP_2);
        note2.setId(1);
        //Act
        //Assert

        Assertions.assertNotEquals(note1, note2);
        System.out.println("The notes are not equal, They have different Contents!");
    }
}
