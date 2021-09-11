package lection1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiplomasInFoldersTests {

    @Test
    public void oneFolderTest() {
        assertEquals(0 , DiplomasInFolders.getMinSec(new int[]{1}));
    }

    @Test
    public void manyFolderTest() {
        assertEquals(111,
                DiplomasInFolders.getMinSec(new int[]{4, 1, 5, 9, 878, 3, 5, 6, 76, 2}));
        assertEquals(1,
                DiplomasInFolders.getMinSec(new int[]{4, 1}));
        assertEquals(5,
                DiplomasInFolders.getMinSec(new int[]{4, 1, 5}));
    }
}
