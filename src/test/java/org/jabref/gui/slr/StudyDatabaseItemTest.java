package org.jabref.gui.slr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudyDatabaseItemTest {

    @Test
    void StudyDatabaseItemTestEquals(){
        StudyDatabaseItem studyDatabaseItem = new StudyDatabaseItem("name_teste", true);
        boolean result = studyDatabaseItem.equals(studyDatabaseItem);
        assertEquals(true, result);
    }

    @Test
    void StudyDatabaseItemTestEqualsObjectNull() {
        StudyDatabaseItem studyDatabaseItem = new StudyDatabaseItem("name_teste", true);
        boolean result = studyDatabaseItem.equals(null);
        assertEquals(false, result);
    }

    @Test
    void StudyDatabaseItemTestEqualsObjectOtherThanGetClass() {
        StudyDatabaseItem studyDatabaseItem = new StudyDatabaseItem("name_teste", true);
        Object o = new Object();
        boolean result = studyDatabaseItem.equals(o);
        assertEquals(false, result);
    }

    @Test
    void StudyDatabaseItemTestEqualsObjectGetClassEnable() {
        StudyDatabaseItem studyDatabaseItem = new StudyDatabaseItem("name_teste", true);
        StudyDatabaseItem newStudyDatabaseItem = new StudyDatabaseItem("name_teste", false);
        boolean result = studyDatabaseItem.equals(newStudyDatabaseItem);
        assertEquals(false, result);
    }

    @Test
    void StudyDatabaseItemTestEqualsObjectGetClass() {
        StudyDatabaseItem studyDatabaseItem = new StudyDatabaseItem("name_teste", false);
        StudyDatabaseItem newStudyDatabaseItem = new StudyDatabaseItem("name_teste", false);
        boolean result = studyDatabaseItem.equals(newStudyDatabaseItem);
        assertEquals(true, result);
    }

    @Test
    void StudyDatabaseItemTestshashCode() {
        StudyDatabaseItem studyDatabaseItem = new StudyDatabaseItem("name_teste", false);
        StudyDatabaseItem newStudyDatabaseItem = new StudyDatabaseItem("name_teste", false);
        int result = studyDatabaseItem.hashCode();
        assertEquals(339350657, result);
    }
}
