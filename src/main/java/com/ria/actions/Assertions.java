package com.ria.actions;
import static org.testng.AssertJUnit.assertEquals;


public class Assertions extends BaseAction{
    public void assertDraftLetterFieldsAreCorrect(){

        assertEquals(draftPage.getDraftLetterTOValue(), emailData.getTo());
        assertEquals(draftPage.getDraftLetterCCValue(), emailData.getCc());
        assertEquals(draftPage.getDraftLetterBCCValue(), emailData.getBcc());
        assertEquals(draftPage.getDraftLetterSubject(), emailData.getSubject());

    }
}
